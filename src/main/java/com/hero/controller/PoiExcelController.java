package com.hero.controller;


import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.hero.entity.SupplierOrCustomer;
import com.hero.excel.ExcelUtil;
import com.hero.excel.PoiUtils;
import com.hero.service.SupplierOrCustomerService;


@RestController
@RequestMapping(value="/excel")
public class PoiExcelController {
	@Autowired
	private SupplierOrCustomerService supplierOrCustomerService;
	
	
	/**
	 * 导出供应商客户信息
	 * @param sidList
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/exportscExcel",produces="text/html;charset=UTF-8")
	public Object createStuExcel(@RequestParam("idList")List<Integer> sidList,HttpServletResponse response,Integer stype){
		//excel文件名
	    String downloadName="";
	    if (stype==1) {//供应商
	    	downloadName= "供应商信息"+System.currentTimeMillis()+".xls";
		} else {//客户
			downloadName= "客户信息"+System.currentTimeMillis()+".xls";
		}
	    
		System.out.println("导出的编号"+sidList);
		
		List<SupplierOrCustomer> slist=supplierOrCustomerService.getSupplierOrCustomerBySid(sidList);
		System.out.println("导出的集合"+slist);

		try {
			PoiUtils poiUtils=new PoiUtils();
			/*response.setCharacterEncoding("UTF-8");//指明响应的字符编码格式
			response.setContentType("application/vnd.ms-excel");//指明响应文件为excel类型
			response.setHeader("Content-disposition","attachment;filename="+new String(downloadName.getBytes("GB2312"),"ISO8859-1"));*/
			this.setResponseHeader(response, downloadName);
			ServletOutputStream outputStream=response.getOutputStream();//获取响应的字节输出流
			poiUtils.createExcel(slist, SupplierOrCustomer.class,outputStream);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	/**
	 * 下载供应商客户excel模板
	 * @param response
	 */
	@RequestMapping(value="/downloadSupplierOrCustomer")
	public void downloadExcel(HttpServletResponse response,Integer stype){
		//excel标题
      String[] title={"名称","传真","联系人","联系人电话","地址","描述","税号","备注"};
       //excel文件名
      String fileName ="";
      //sheet名
      String sheetName ="";
      
      if (stype==1) {//供应商
    	  fileName= "供应商信息"+System.currentTimeMillis()+".xls";
    	  sheetName = "供应商信息";
		} else {//客户
			fileName= "客户信息"+System.currentTimeMillis()+".xls";
			sheetName = "客户信息";
		}
      
      
     //创建HSSFWorkbook 
      HSSFWorkbook wb = ExcelUtil.getHSSFWorkbook(sheetName, title, null);

      //响应到客户端
    	  try {
			this.setResponseHeader(response, fileName);
				OutputStream os = response.getOutputStream();
				wb.write(os);
				os.flush();
				os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	//发送响应流方法
    public void setResponseHeader(HttpServletResponse response, String fileName) {
        try {
            try {
                fileName = new String(fileName.getBytes(),"ISO8859-1");
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            response.setContentType("application/octet-stream;charset=ISO8859-1");
            response.setHeader("Content-Disposition", "attachment;filename="+ fileName);
            response.addHeader("Pargam", "no-cache");
            response.addHeader("Cache-Control", "no-cache");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
	
	
    
    
    /**
	 * Excel导入供应商客户数据
	 * SpringMVC处理文件上传
	 * 单文件上传
	 * @param myfile
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="/uploadSupplierOrCustomer")
	public Object upload(@RequestParam(value="myfile",required=false) CommonsMultipartFile myfile,@RequestParam(value="desc",required=false) String desc,Integer stype) throws Exception{
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa");
		Map<String, Object> map=new HashMap<String, Object>();
		String name = myfile.getName();//form表单中参数名称
		String originalFilename = myfile.getOriginalFilename();//得到上传文件的名称
		System.out.println("表单中文件参数名称 name=>"+name);
		System.out.println("上传的文件原始名称 originalfileName=>"+originalFilename);
		System.out.println("文件描述信息 desc=>"+desc);
		
		PoiUtils poiUtils = new PoiUtils();//Excel工具类
		
		List<SupplierOrCustomer> list = null;
		try {
			list = (List<SupplierOrCustomer>) poiUtils.parseExcel(SupplierOrCustomer.class, myfile.getInputStream(), originalFilename);
			
			for (SupplierOrCustomer s : list) {
				int e=supplierOrCustomerService.isExitByNameAndType(s.getsName(), stype);
				if (e>0) {
					list.remove(s);
				} 
				s.setsType(stype);
			}
		
			
			int n=supplierOrCustomerService.importSupplierOrCustomer(list);
			System.out.println("导入供应商客户------------》"+list);
			if (n>0) {
				map.put("success", true);
				map.put("message", "上传成功");
			}else{
				map.put("success", false);
				map.put("message", "上传失败");
			}
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return map;
	}
    
	

	
}

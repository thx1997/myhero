package com.hero.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.SupplierOrCustomer;
import com.hero.entity.query.SupplierOrCustomerQuery;
import com.hero.service.ProductCategoryService;
import com.hero.service.SupplierOrCustomerService;

@RestController
@RequestMapping(value="/supplierorcustomer",name="供应商客户管理")
public class SupplierOrCustomerController {
	@Autowired
	private SupplierOrCustomerService supplierOrCustomerService;
	@Autowired
	private ProductCategoryService ProductCategoryService;
	/**
	 * 多条件查询供应商客户信息(rfy)
	 * @param scquery
	 * @return
	 */
	@RequestMapping(value="/queryAllByCount")
	public Object queryAll(SupplierOrCustomerQuery scquery){
		Map<String, Object> map = new HashMap<String, Object>();
		List<SupplierOrCustomer> list=supplierOrCustomerService.selectAllByCount(scquery);
		int total=supplierOrCustomerService.selectCount(scquery);
		map.put("total", total);
		map.put("rows",list);
		return map;
	}
	/**
	 * 添加信息(rfy)
	 * @param sc
	 * @return
	 */
	@RequestMapping(value="/insert",name="新增供应商或客户")
	public Object insert(SupplierOrCustomer sc){
		System.out.println("表单序列化参数>>>>>"+sc);
		Map<String, Object> map = new HashMap<String, Object>();
		int e=supplierOrCustomerService.isExitByName(sc.getsName());
		if (e>0) {
			map.put("success", false);
			map.put("message", "该信息已存在，请勿重复添加");
		} else {
			int n=supplierOrCustomerService.insertSelective(sc);
			if (n>0) {
				map.put("success", true);
				map.put("message", "添加成功");
			} else {
				map.put("success", false);
				map.put("message", "添加失败");
			}
		}
		
		return map;
	}
	
	/**
	 * 修改信息(rfy)
	 * @param sc
	 * @return
	 */
	@RequestMapping(value="/update",name="修改供应商或客户")
	public Object update(SupplierOrCustomer sc){
		System.out.println("表单序列化参数>>>>>"+sc);
		Map<String, Object> map = new HashMap<String, Object>();
		int n=supplierOrCustomerService.updateByPrimaryKeySelective(sc);
		if (n>0) {
			map.put("success", true);
			map.put("message", "修改成功");
		} else {
			map.put("success", false);
			map.put("message", "修改失败");
		}
		return map;
	}
	
	/**
	 * 删除信息(rfy)
	 * @param sc
	 * @return
	 */
	@RequestMapping(value="/delete",name="删除供应商或客户")
	public Object delete(Integer sid){
		Map<String, Object> map = new HashMap<String, Object>();
		int n=supplierOrCustomerService.updexit(sid);
		if (n>0) {
			map.put("success", true);
			map.put("message", "删除成功");
		} else {
			map.put("success", false);
			map.put("message", "删除失败");
		}
		return map;
	}
	
	
	/**
	 * 批量修改供应商、客户的类别
	 * @param askerId
	 * @param stuId
	 * @return
	 */
	@RequestMapping(value="/batch",name="批量修改供应商或客户类别")
	public Object batchStu(int cateId,@RequestParam("sIds")List<Integer> sIds){
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("编号>>>>>>>>>>>>>>>>>>"+sIds);
		int n=supplierOrCustomerService.updBatch(cateId, sIds);
		if (n>0) {
			map.put("success", true);
			map.put("message", "修改成功");
		} else {
			map.put("success", false);
			map.put("message", "修改失败");
		}
		return map;
	}
	
	
	
	/**
	 * 多条件查询供应商客户的编号(rfy)
	 * @param scquery
	 * @return
	 */
	@RequestMapping(value="/queryIdsByquery")
	public Object queryIdsByquery(SupplierOrCustomerQuery scquery){
		Map<String, Object> map = new HashMap<String, Object>();
		List<Integer> list=supplierOrCustomerService.getIdsByQuery(scquery);
		if (list.size()>0&&list!=null) {
			map.put("success", true);
			map.put("message", list);
		}else {
			map.put("success", false);
			map.put("emessage", "导出失败");
		}
		return map;
	}
	
	/**
	 * 给供应商设置供货的商品类别时，查询商品类别信息，已拥有的选中（rfy）
	 * @param rId
	 * @return
	 */
	@RequestMapping(value="/queryProCateCheckedBySid")
	public Object queryProCateCheckedBySid(Integer sId){
		return ProductCategoryService.queryProCateChecked(sId);
		
	}
	
	
	/**
	 * 给供应商设置供货的商品类别
	 * @param 
	 * @param rId
	 * @return
	 */
	@RequestMapping(value="/setSupplierProCate")
	public Object setSupplierProCate(String procateIds,int sId){
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("procateIds>>>>"+procateIds);
		int d=0;
		if (procateIds==""||procateIds==null) {
			//如果不给供应商设置任何供货的商品类别，只执行删除功能
			d=supplierOrCustomerService.delProCateBySid(sId);
			if (d>0) {
				map.put("success", true);
				map.put("message", "保存成功");
			} else {
				map.put("success", false);
				map.put("message", "保存失败");
			}
		}else{
			String arr[]=procateIds.split(",");//把String类型的数据转成数组
			
			List<String> sidlist = new ArrayList<String>();
		    for (int i = 0; i < arr.length; i++) {
		    	sidlist.add(arr[i]);
		    }
		    
		    List<Integer> sidslist =sidlist.stream().map(Integer::parseInt).collect(Collectors.toList());
			
			//先删除
			d=supplierOrCustomerService.delProCateBySid(sId);
			
			//再添加
			int n =supplierOrCustomerService.insertSupplierProCate(sId, sidslist);
			if (n>0) {
				map.put("success", true);
				map.put("message", "保存成功");
			} else {
				map.put("success", false);
				map.put("message", "保存失败");
			}
			
		}
		
		
		
			
		return map;
	}
}

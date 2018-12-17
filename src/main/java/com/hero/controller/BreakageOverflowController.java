package com.hero.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.BreakageOverflow;
import com.hero.entity.BreakageOverflowDetail;
import com.hero.entity.Product;
import com.hero.entity.ProductCategory;
import com.hero.entity.ProductSpec;
import com.hero.entity.StoreHouse;
import com.hero.entity.query.BreakageOverflowQuery;
import com.hero.entity.query.StorehousePro;
import com.hero.service.BreakageOverflowDetailService;
import com.hero.service.BreakageOverflowServer;
import com.hero.service.ProductService;
import com.hero.service.ProductSpecService;
import com.hero.service.ProductUnitService;
import com.hero.service.StoreHouseServer;

@RestController
@RequestMapping(value="/breakageOverflow",name="库存管理")
public class BreakageOverflowController {
	@Autowired
	BreakageOverflowServer breakageOverflowServer;
	@Autowired
	StoreHouseServer storeHouseServer;
	@Autowired
	ProductService productService;
	@Autowired	
	ProductSpecService productSpecService;
	@Autowired
	ProductUnitService productUnitService;
	@Autowired
	BreakageOverflowDetailService breakageOverflowDetailService;
	/**
	 * 多条件分页查询损益单
	 * @param bofQuery 条件封装的实体
	 * @author thx
	 * @return 
	 */
	//@RequestMapping(value = "/getreakageOverflows",name="多条件查询")
	@RequestMapping(value = "/getreakageOverflows")
	public Object getreakageOverflows(BreakageOverflowQuery bofQuery,BindingResult bindingResult){
		System.out.println("查询参数"+bofQuery.toString());
		List<BreakageOverflow> rows = breakageOverflowServer.querybof(bofQuery);
		int total = breakageOverflowServer.querybofCount(bofQuery);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", total);
		map.put("rows", rows);
		System.out.println(rows);
		return map;
	}
	
	
	
	
	
	
	
	/**
	 * 添加报损报溢单
	 * @author thx
	 * @param eid 盘点员（员工）编号 
	 * @return 成功添加返回true和自增值，不成功返回false
	 */
	//@RequestMapping(value = "/insertoverflow", name = "添加报损报溢单")
	@RequestMapping(value = "/insertoverflow")
	public Map<String, Object> insertoverflow(int eid) {
		Map<String, Object> map = new HashMap<String, Object>();			
			int n = breakageOverflowServer.insertBreakageOverflow(eid);
			if (n > 0) {
				map.put("success", true);
				map.put("boid", breakageOverflowServer.selectMaxboid(eid));//返回刚刚新增的自增值
			} else {
				map.put("success", false);
			}
		return map;
	}
	/**
	 * 查询所有可用的仓库
	 * @author thx
	 * @return 可用仓库集合
	 */
	@RequestMapping(value = "/queryAllInvoicing")
	public Object queryAllInvoicing() {
		List<StoreHouse> shlist=storeHouseServer.queryAllInvoicing();			
		return shlist;
	}
	/**
	 * 根据仓库编号和商品类别编号查询商品
	 * @author thx
	 * @param storehousePro 条件封装的实体类
	 * @return
	 */
	@RequestMapping(value="/queryProBYPcidAndSid")
	public Object queryProBYPcidAndSid(StorehousePro storehousePro) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Product> list=productService.queryProBYPcidAndSid(storehousePro);
		int total=productService.queryProBYPcidAndSidCount(storehousePro);
		map.put("total", total);
		map.put("rows",list);
		System.out.println("11111111111111111111"+list);
		return map;
	}
	/**
	 * 根据商品编号查询规格
	 * @author thx
	 * @param pid 商品编号
	 * @return
	 */
	@RequestMapping(value="/querySpecBypid")
	public Object querySpecBySid(int pid) {
		ProductSpec ps=productSpecService.selectBypid(pid);		
		return ps;
	}
	
	
	/**
	 * 跟据规格单位编号查询规格单位名
	 * @author thx
	 * @param puid 规格单位编号
	 * @return
	 */
	@RequestMapping(value="/selectPuNameBypuid")
	public Object selectPuNameBypuid(int puid) {
		Map<String, Object> map = new HashMap<String, Object>();
		String PuName=productUnitService.selectPuNameBypuid(puid);	
		if(PuName != null || PuName != "") {
			map.put("success", true);
			map.put("value", PuName);
		}else {
			map.put("success",false);
		}
		
		System.out.println("单位名称```````````````"+PuName);
		return map;
	}
	/**
	 * 根据库存编号和商品编号查询该商品的库存量
	 * @param sdpid 商品编号
	 * @param sdsid 仓库编号
	 * @return
	 */
	@RequestMapping(value="/selectSdnumberBypuid")
	public Object selectSdnumberBypuid(int sdpid,int sdsid) {
		Map<String, Object> map = new HashMap<String, Object>();
		int sdnumber=breakageOverflowDetailService.selectSdnumberBypuid(sdpid, sdsid);
		if(sdnumber>0) {
			map.put("value", sdnumber);
		}else {
			map.put("value", "缺货");
		}
		
		System.out.println("库存量```````````````"+sdnumber);
		return map;
	}
	/**
	 * 添加报损报溢详情
	 * @param BOfDetail 详情实体
	 * @return
	 */
	@RequestMapping(value="/addbreakageOverflowDetail")
	public Object addbreakageOverflowDetail(BreakageOverflowDetail BOfDetail) {
		System.out.println("参数"+BOfDetail.toString());
		Map<String, Object> map = new HashMap<String, Object>();
		//添加详情
		int n=breakageOverflowDetailService.insertSelective(BOfDetail);
		
		//更新单子上报总数
		int updateNumber=BOfDetail.getBodNumber()+breakageOverflowServer.selectBoNumber(BOfDetail.getBodBoId());
		breakageOverflowServer.updateBoNumber(BOfDetail.getBodBoId(), updateNumber);
		
		
		
		if(n>0) {
			map.put("success", true);
			map.put("message", "提交成功");
		}else {
			map.put("success", false);
			map.put("message", "提交失败");
		}
		
		return map;
	}
	
}

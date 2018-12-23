package com.hero.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.BofDetail;
import com.hero.entity.BreakageOverflow;
import com.hero.entity.BreakageOverflowDetail;
import com.hero.entity.Department;
import com.hero.entity.Employee;
import com.hero.entity.InventoryControl;
import com.hero.entity.Product;
import com.hero.entity.ProductCategory;
import com.hero.entity.ProductSpec;
import com.hero.entity.Role;
import com.hero.entity.StoreHouse;
import com.hero.entity.query.BofDetailQuery;
import com.hero.entity.query.BreakageOverflowQuery;
import com.hero.entity.query.RoleQuery;
import com.hero.entity.query.StorehousePro;
import com.hero.service.BofDetailService;
import com.hero.service.BreakageOverflowDetailService;
import com.hero.service.BreakageOverflowServer;
import com.hero.service.EmployeeService;
import com.hero.service.InventoryControlService;
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
	@Autowired
	EmployeeService employeeService;
	@Autowired
	BofDetailService bofDetailService;
	@Autowired
	InventoryControlService inventoryControlService;
	/**
	 * 修改单子状态(仓库管理员)
	 * @param bodid 详情单编号
	 * @param state 状态
	 * @param boid 总单编号
	 *  @param eid 操作人编号
	 *  @param type 0：管理员核审按钮1：负责人处理按钮
	 * @return
	 */
	@RequestMapping("/updateState")
	public Object updateBodStateByBoId(Integer bodid,Integer state,Integer boid,Integer eid,int type) {
		Map<String,Object> map=new HashMap<String,Object>();
		//修改详情单状态
        int n=breakageOverflowDetailService.updateBodStateByBodId(bodid, state,eid,type);
      
        //查询到所有详情单的最小状态
        Integer minBodid=breakageOverflowDetailService.selectBodStateByBoid(boid);
          //更改主表的状态为详情表的最小状态         
         breakageOverflowServer.updateBoStateByBoId(boid,minBodid);
         
         
        if(n>0) {
        	map.put("success", true);
        	map.put("message","操作成功");
        }else {
        	map.put("success", false);
        	map.put("message","操作失败");
        }
		return map;
	}
	
	
	
	
	
	
	/**
	 * 多条件分页查询损益单
	 * @param bofQuery 条件封装的实体
	 * @author thx
	 * @return 
	 */
	//@RequestMapping(value = "/getreakageOverflows",name="多条件查询")
	@RequestMapping(value = "/getreakageOverflows")
	public Object getreakageOverflows(BreakageOverflowQuery bofQuery,Integer eid,@RequestParam("roles[]")String[] roles,BindingResult bindingResult){
		Map<String,Object> map=new HashMap<String,Object>();
		System.out.println("查询参数"+bofQuery.toString());
		for (int i = 0; i < roles.length; i++) {
			if(roles[i].equals("仓库盘点员")) {
			System.out.println("仓库盘点员查看自己的");
			bofQuery.setBoEId(eid);				
			}
	    }
		List<BreakageOverflow> rows = breakageOverflowServer.querybof(bofQuery);
		int total = breakageOverflowServer.querybofCount(bofQuery);
		map.put("total", total);
		map.put("rows", rows);
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
	/**
	 * 根据角色查询员工
	 * @author thx
	 * @return
	 */
	//@RequestMapping(value="/queryEmpByRname",name="根据角色查询员工")
	@RequestMapping(value="/queryEmpByRname")
	public Object queryEmpByRname() {
		List<Employee> empList=employeeService.selectEmpByRoleName("仓库盘点员");
		System.out.println("是仓库盘点员的有"+empList);
		return empList;
	}
	/**
	 * 多条件分页查询损益单详情
	 * @param bofdQuery 条件封装的实体
	 * @author thx
	 * @return 
	 */
	@RequestMapping(value = "/querybofd")
	public Object querybofd(BofDetailQuery bofdQuery,BindingResult bindingResult){
		System.out.println("查询参数"+bofdQuery);
		
		List<BofDetail> rows = bofDetailService.querybofd(bofdQuery);
		int total = bofDetailService.querybofdCount(bofdQuery);
		Map<String, Object> map = new HashMap<String, Object>();
		
		
		System.out.println("查询结果"+rows);
		
		map.put("total", total);
		map.put("rows", rows);
		return map;
	}
	/**
	 * 添加某仓库下某商品的上下限数量
	 * @author thx
	 * @param inc
	 * @param bindingResult
	 * @return
	 */
	@RequestMapping(value = "/addNumControl")
	public Object addNumControl(InventoryControl inc,BindingResult bindingResult){
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("添加上下限参数"+inc);
		int n=inventoryControlService.insertSelective(inc);
		if(n>0) {
			map.put("success", true);
		}else {
			map.put("success", false);
		}		
		return map;
	}
	
	
}

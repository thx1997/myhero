package com.hero.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.Employee;
import com.hero.entity.StoreHouse;
import com.hero.entity.query.StoreHouseQuery;
import com.hero.service.StoreHouseServer;


@RestController
@RequestMapping("StoreHouse")
public class StoreHouseController {

	@Autowired
	private StoreHouseServer storeHouseService;
	/**
	 * localhost:8080/invoicing/StoreHouse/selAllStoreHouse
	 * @param storeHouseQuery
	 * @return 多条件分页
	 */
	@RequestMapping("selAllStoreHouse")
	public Object selAllStoreHouse(StoreHouseQuery storeHouseQuery) {
		System.out.println("多条件=====》"+storeHouseQuery);
		Map<String, Object> map = new HashMap<String, Object>();
		List<StoreHouse> list = storeHouseService.selectByStoreHouseQuery(storeHouseQuery);
		System.out.println("list集合=====》"+list);
		int count = storeHouseService.selectCountByStoreHouseQuery(storeHouseQuery);
		System.out.println("总条数=====》"+storeHouseQuery);
		map.put("total", count);
		map.put("rows", list);
		return map;
	}
	/**
	 * localhost:8080/invoicing/StoreHouse/selEctemplByStoreHouse
	 * @param storeHouseQuery
	 * @return 查询所有仓库管理员
	 */
	@RequestMapping("selEctemplByStoreHouse")
	public Object selEctemplByStoreHouse() {
		List<Employee> list = storeHouseService.selEctemplByStoreHouse();
		return list;
	}
	/**
	 * localhost:8080/invoicing/StoreHouse/lockStoreHouse?sid=1&status=1
	 * @param 
	 * @return 锁定解锁仓库
	 */
	@RequestMapping("lockStoreHouse")
	public Object lockStoreHouse(int sid,int status) {
		Map<String, Object> map = new HashMap<String, Object>();
		int i = storeHouseService.lockStoreHouse(sid, status);
		if(i>0) {
			map.put("success", true);
			map.put("message", "修改成功");
		}else {
			map.put("success", false);
			map.put("message", "修改成功");
		}
		return map;
	}
	/**
	 * localhost:8080/invoicing/StoreHouse/addStoreHouse?sName=123&sEId=9
	 * @param 
	 * @return 添加仓库
	 */
	@RequestMapping("addStoreHouse")
	public Object addStoreHouse(StoreHouse storeHouse) {
		Map<String, Object> map = new HashMap<String, Object>();
		int i = storeHouseService.insertSelective(storeHouse);
		if(i>0) {
			map.put("success", true);
			map.put("message", "添加成功");
		}else {
			map.put("success", false);
			map.put("message", "添加成功");
		}
		return map;
	}
	/**
	 * localhost:8080/invoicing/StoreHouse/updStoreHouse?sId=11&sName=1111&sEId=9
	 * @param 
	 * @return 修改仓库
	 */
	@RequestMapping("updStoreHouse")
	public Object updStoreHouse(StoreHouse storeHouse) {
		Map<String, Object> map = new HashMap<String, Object>();
		int i = storeHouseService.updateByPrimaryKeySelective(storeHouse);
		if(i>0) {
			map.put("success", true);
			map.put("message", "修改成功");
		}else {
			map.put("success", false);
			map.put("message", "修改成功");
		}
		return map;
	}
	/**
	 * localhost:8080/invoicing/StoreHouse/delStoreHouse?sid=10
	 * @param 
	 * @return 删除仓库
	 */
	@RequestMapping("delStoreHouse")
	public Object delStoreHouse(int sid) {
		Map<String, Object> map = new HashMap<String, Object>();
		int i = storeHouseService.deleteByPrimaryKey(sid);
		if(i>0) {
			map.put("success", true);
			map.put("message", "删除成功");
		}else {
			map.put("success", false);
			map.put("message", "删除成功");
		}
		return map;
	}
}

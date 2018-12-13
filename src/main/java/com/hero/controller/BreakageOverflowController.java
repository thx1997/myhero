package com.hero.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.StoreHouse;
import com.hero.service.BreakageOverflowServer;
import com.hero.service.StoreHouseServer;

@RestController
@RequestMapping(value="/breakageOverflow",name="库存管理")
public class BreakageOverflowController {
	@Autowired
	BreakageOverflowServer breakageOverflowServer;
	@Autowired
	StoreHouseServer storeHouseServer;
	
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
	
	
	
}

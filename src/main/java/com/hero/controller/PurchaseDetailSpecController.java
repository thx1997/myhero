package com.hero.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.PurchaseDetailSpec;
import com.hero.entity.Role;
import com.hero.entity.SupplierOrCustomer;
import com.hero.entity.query.PurchaseDetailSpecQuery;
import com.hero.service.PurchaseDetailSpecService;
import com.hero.service.RoleService;
import com.hero.service.StoreHouseServer;

@RestController
@RequestMapping("/purchaseDetailSpecController")
public class PurchaseDetailSpecController {
	@Autowired
	private PurchaseDetailSpecService purchaseDetailSpecService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private StoreHouseServer storeHouseServer;
	/**
	 * 根据采购单号分页查询采购详情(rfy)
	 * @param pnid
	 * @return
	 */
	@RequestMapping("/queryByPnid")
	public Object queryByPnid(PurchaseDetailSpecQuery query,Integer suid) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Role> rlist=roleService.getRoleByEid(suid);
		List<String> rname=new ArrayList<String>();//根据用户编号获取用户拥有的角色
		for(Role r:rlist){
			rname.add(r.getrName());
		}
		System.out.println("角色名:"+rname);
		if (rname.contains("仓库负责人")) {//如果用户是仓库负责人，只能查看自己分配给自己的采购单的详情
			int sid=storeHouseServer.selSidByEid(suid);//查询仓库负责人所负责的仓库的编号
			query.setShid(sid);
		}
		List<PurchaseDetailSpec> list=purchaseDetailSpecService.queryByPurQuery(query);
		int total=purchaseDetailSpecService.queryCountByPurQuery(query);
		map.put("total", total);
		map.put("rows",list);
		return map;
		
	}
}

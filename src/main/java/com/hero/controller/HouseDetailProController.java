package com.hero.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.HouseDetailPro;
import com.hero.entity.Role;
import com.hero.entity.query.HouseDetailProQuery;
import com.hero.service.HouseDetailProService;
import com.hero.service.RoleService;

@RestController
@RequestMapping("/houseDetailProController")
public class HouseDetailProController {

	@Autowired
	private HouseDetailProService houseDetailProService;
	@Autowired
	private RoleService roleService;
	/**
	 * 多条件分页查询库存里的商品及属性(rfy)
	 * @param pquery
	 * @return
	 */
	@RequestMapping(value="/queryAllByQuery")
	public Object queryAllByQuery(HouseDetailProQuery query,Integer eeid) {
		Map<String, Object> map = new HashMap<String, Object>();	
		List<Role> rlist=roleService.getRoleByEid(eeid);
		List<String> rname=new ArrayList<String>();//根据用户编号获取用户拥有的角色
		for(Role r:rlist){
			rname.add(r.getrName());
		}
		System.out.println("角色名:"+rname);
		if (rname.contains("仓库负责人")) {//如果用户是仓库负责人，只能查看自己分配给自己的采购单的详情
			
			query.setEid(eeid);
		}
		List<HouseDetailPro> list=houseDetailProService.queryPage(query);
		int total=houseDetailProService.queryCountPage(query);
		map.put("total", total);
		map.put("rows",list);
		return map;
	}
}

package com.hero.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.ProductBrand;
import com.hero.entity.PurchasenoteDetail;
import com.hero.entity.Role;
import com.hero.service.PurchasenoteDetailService;
import com.hero.service.RoleService;

@RestController
@RequestMapping("/purchasenoteDetailController")
public class PurchasenoteDetailController {
	@Autowired
	private PurchasenoteDetailService purchasenoteDetailService;
	@Autowired
	private RoleService roleService;
	/**
	 * 多条件分页查询(rfy)
	 * @param brand
	 * @return
	 */
	@RequestMapping(value="/queryAllPage")
	public Object queryAllPage(PurchasenoteDetail query,Integer suid) {
		System.out.println("条件参数>>>>>>>"+query+suid);
		Map<String, Object> map = new HashMap<String, Object>();
		List<Role> rlist=roleService.getRoleByEid(suid);
		List<String> rname=new ArrayList<String>();//根据用户编号获取用户拥有的角色
		for(Role r:rlist){
			rname.add(r.getrName());
		}
		System.out.println("角色名:"+rname);
		if (rname.contains("采购员")) {//如果用户是采购员，只能查看自己添加过的采购单
			query.setPnEId(suid);
			
		}
		if (rname.contains("仓库管理员")) {//如果用户是仓库管理员，只能查看采购完的订单
			query.setPnStatus(1);
			
		}
		
		List<PurchasenoteDetail> list=purchasenoteDetailService.queryByQueryPage(query);
		int total=purchasenoteDetailService.queryCountByQuery(query);
		map.put("total", total);
		map.put("rows",list);
		return map;
	}
}

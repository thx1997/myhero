package com.hero.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.DeliverynoteDetail;
import com.hero.entity.PurchasenoteDetail;
import com.hero.entity.Role;
import com.hero.service.DeliverynoteDetailService;
import com.hero.service.RoleService;

@RestController
@RequestMapping("/deliverynoteDetailController")
public class DeliverynoteDetailController {
	@Autowired
	private DeliverynoteDetailService deliverynoteDetailService;
	@Autowired
	private RoleService roleService;
	
	/**
	 * 多条件分页查询(rfy)
	 * @param brand
	 * @return
	 */
	@RequestMapping(value="/queryAllPage")
	public Object queryAllPage(DeliverynoteDetail query,Integer suid) {
		System.out.println("条件参数>>>>>>>"+query+suid);
		Map<String, Object> map = new HashMap<String, Object>();
		List<Role> rlist=roleService.getRoleByEid(suid);
		List<String> rname=new ArrayList<String>();//根据用户编号获取用户拥有的角色
		for(Role r:rlist){
			rname.add(r.getrName());
		}
		System.out.println("角色名:"+rname);
		if (rname.contains("销售员")) {//如果用户是采购员，只能查看自己添加过的采购单
			query.setDnEId(suid);
			
		}
		if (rname.contains("会计")) {//如果用户是会计，只能查看已出库的销售单
			query.setDnStatus(1);
			
		}
		if (rname.contains("仓库管理员")) {//如果用户是仓库管理员，只能查看备货中的订单
			query.setDnStatus(0);
			
		}
		List<DeliverynoteDetail> list=deliverynoteDetailService.queryByQueryPage(query);
		int total=deliverynoteDetailService.queryCountByQuery(query);
		map.put("total", total);
		map.put("rows",list);
		return map;
	}
	
}

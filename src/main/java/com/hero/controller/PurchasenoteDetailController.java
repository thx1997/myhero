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
import com.hero.service.PurchaseDetailService;
import com.hero.service.PurchasenoteDetailService;
import com.hero.service.RoleService;
import com.hero.service.StoreHouseServer;

@RestController
@RequestMapping("/purchasenoteDetailController")
public class PurchasenoteDetailController {
	@Autowired
	private PurchasenoteDetailService purchasenoteDetailService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private PurchaseDetailService purchaseDetailService;
	@Autowired
	private StoreHouseServer storeHouseServer;
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
		if (rname.contains("会计")) {//如果用户是会计，只能查看审核中的采购单
			query.setPnStatus(0);
			
		}
		if (rname.contains("仓库管理员")) {//如果用户是仓库管理员，只能查看采购完的订单
			query.setPnStatus(1);
			
		}
		if (rname.contains("仓库负责人")) {//如果用户是仓库负责人，只能查看分配给自己仓库的采购单
			int sid=storeHouseServer.selSidByEid(suid);//查询仓库负责人所负责的仓库的编号
			List<String> pnids=purchaseDetailService.selPnIdsByShId(sid);//根据仓库编号，查询采购详情表中的采购单的编号
			query.setPnids(pnids);
			
		}
		
		List<PurchasenoteDetail> list=purchasenoteDetailService.queryByQueryPage(query);
		int total=purchasenoteDetailService.queryCountByQuery(query);
		map.put("total", total);
		map.put("rows",list);
		return map;
	}
}

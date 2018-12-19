package com.hero.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.PurchaseDetailSpec;
import com.hero.entity.SupplierOrCustomer;
import com.hero.entity.query.PurchaseDetailSpecQuery;
import com.hero.service.PurchaseDetailSpecService;

@RestController
@RequestMapping("/purchaseDetailSpecController")
public class PurchaseDetailSpecController {
	@Autowired
	private PurchaseDetailSpecService purchaseDetailSpecService;
	
	/**
	 * 根据采购单号分页查询采购详情(rfy)
	 * @param pnid
	 * @return
	 */
	@RequestMapping("/queryByPnid")
	public Object queryByPnid(PurchaseDetailSpecQuery query) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<PurchaseDetailSpec> list=purchaseDetailSpecService.queryByPurQuery(query);
		int total=purchaseDetailSpecService.queryCountByPurQuery(query);
		map.put("total", total);
		map.put("rows",list);
		return map;
		
	}
}

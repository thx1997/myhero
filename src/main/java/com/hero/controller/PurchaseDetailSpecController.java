package com.hero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.PurchaseDetailSpec;
import com.hero.service.PurchaseDetailSpecService;

@RestController
@RequestMapping("/purchaseDetailSpecController")
public class PurchaseDetailSpecController {
	@Autowired
	private PurchaseDetailSpecService purchaseDetailSpecService;
	
	/**
	 * 根据采购单号查询采购详情(rfy)
	 * @param pnid
	 * @return
	 */
	@RequestMapping("/queryByPnid")
	public Object queryByPnid(String pnid) {
		List<PurchaseDetailSpec> list=purchaseDetailSpecService.queryByPurId(pnid);
		return list;
	}
}

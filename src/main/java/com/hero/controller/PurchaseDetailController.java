package com.hero.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.PurchaseDetail;
import com.hero.service.PurchaseDetailService;

@RestController
@RequestMapping("/purchaseDetailController")
public class PurchaseDetailController {
	@Autowired
	private PurchaseDetailService purchaseDetailService;
	
	/**
	 * 预报存采购的商品(rfy)
	 * @param detail
	 * @return
	 */
	@RequestMapping("/insert")
	public Object insert(PurchaseDetail detail) {
		System.out.println("参数啊----"+detail.toString());
		Map<String, Object> map = new HashMap<String, Object>();
		//判断商品的采购详情是否已存在
		PurchaseDetail olddetail=purchaseDetailService.queryByPurIdAndPid(detail.getPdPnId(), detail.getPdPId(),detail.getPdPsId());
		if (olddetail!=null) {//如果存在，则修改采购的商品数量
			int num=olddetail.getPdQuantity()+detail.getPdQuantity();//原来的数量+现在的数量
			PurchaseDetail newdetail=new PurchaseDetail();
			newdetail.setPdQuantity(num);
			newdetail.setPdUnitprice(detail.getPdUnitprice());
			newdetail.setPdId(olddetail.getPdId());
			int u=purchaseDetailService.updateByPrimaryKeySelective(newdetail);//修改商品的数量
			if (u>0) {
				map.put("success", true);
				map.put("message", "预保存成功");
			} else {
				map.put("success", false);
				map.put("message", "预保存失败");
			}
		} else {//如果不存在，则添加一条新记录
			int n=purchaseDetailService.insertSelective(detail);
			if (n>0) {
				map.put("success", true);
				map.put("message", "预保存成功");
			} else {
				map.put("success", false);
				map.put("message", "预保存失败");
			}
			
		}
	
	
		return map;
	}
	
	
	
	
	
}

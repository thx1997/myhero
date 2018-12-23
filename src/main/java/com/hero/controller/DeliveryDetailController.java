package com.hero.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hpsf.Decimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.DeliveryDetail;
import com.hero.entity.PurchaseDetail;
import com.hero.service.DeliveryDetailService;

@RestController
@RequestMapping("/deliveryDetailController")
public class DeliveryDetailController {
	@Autowired
	private DeliveryDetailService deliveryDetailService;
	/**
	 * 预报存销售的商品(rfy)
	 * @param detail
	 * @return
	 */
	@RequestMapping("/insert")
	public Object insert(DeliveryDetail detail) {
		System.out.println("参数啊----"+detail.toString());
		Map<String, Object> map = new HashMap<String, Object>();
		//判断商品的销售详情是否已存在
		DeliveryDetail olddetail=deliveryDetailService.selectByDnIdAndPid(detail.getDdDnId(), detail.getDdPId());
		if (olddetail!=null) {//如果存在，则修改销售的商品数量
			int num=olddetail.getDdQuantity()+detail.getDdQuantity();//原来的数量+现在的数量
			DeliveryDetail newdetail=new DeliveryDetail();
			newdetail.setDdQuantity(num);
			newdetail.setDdUnitprice(detail.getDdUnitprice());
			newdetail.setDdId(olddetail.getDdId());
			int u=deliveryDetailService.updateByPrimaryKeySelective(newdetail);//修改商品的数量
			if (u>0) {
				map.put("success", true);
				map.put("message", "预保存成功");
			} else {
				map.put("success", false);
				map.put("message", "预保存失败");
			}
		} else {//如果不存在，则添加一条新记录
			int n=deliveryDetailService.insertSelective(detail);
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
	
	
	
	/**
	 * 修改销售详情(rfy)
	 * @param detail
	 * @return
	 */
	@RequestMapping("/update")
	public Object update(DeliveryDetail detail) {
		System.out.println("参数啊----"+detail.toString());
		Map<String, Object> map = new HashMap<String, Object>();
		int u=deliveryDetailService.updateByPrimaryKeySelective(detail);
		if (u>0) {
			map.put("success", true);
			map.put("message", "修改成功");
		} else {
			map.put("success", false);
			map.put("message", "修改失败");
		}
		return map;
	}
	
	
	/**
	 * 删除采购详情(rfy)
	 * @param pdid
	 * @return
	 */
	@RequestMapping("/delete")
	public Object delete(@RequestParam("ddIds")List<Integer> ddIds) {
		System.out.println("参数啊----"+ddIds);
		Map<String, Object> map = new HashMap<String, Object>();
		int u=deliveryDetailService.deleteByDdIdList(ddIds);
		if (u>0) {
			map.put("success", true);
			map.put("message", "删除成功");
		} else {
			map.put("success", false);
			map.put("message", "删除失败");
		}
		return map;
	}
	
	
	
}

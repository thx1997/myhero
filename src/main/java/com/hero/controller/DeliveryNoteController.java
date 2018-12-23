package com.hero.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.DeliveryDetail;
import com.hero.entity.DeliveryNote;
import com.hero.entity.PurchaseNote;
import com.hero.service.DeliveryDetailService;
import com.hero.service.DeliveryNoteService;
import com.hero.util.Result;

@RestController
@RequestMapping("/deliveryNoteController")
public class DeliveryNoteController {
	@Autowired
	private DeliveryNoteService deliveryNoteService;
	@Autowired
	private DeliveryDetailService deliveryDetailService;
	/**
	 * 新增销售单(rfy)
	 * @param note
	 * @return
	 */
	@RequestMapping("/insert")
	public Object insert(DeliveryNote note) {
		Map<String, Object> map = new HashMap<String, Object>();
		int n=deliveryNoteService.insertSelective(note);
		if (n>0) {
			map.put("success", true);
			map.put("message", "添加成功");
		} else {
			map.put("success", false);
			map.put("message", "添加失败");
		}
		return map;
	}
	
	
	
	

	/**
	 * 销售单未保存(rfy)
	 * @param pnid
	 * @return
	 */
	@RequestMapping("/cancel")
	public Object cancel(String dnid) {
		int e=deliveryDetailService.isHaveByDnid(dnid);//先查询是否已选择商品
		if (e>0) {
			deliveryDetailService.deleteByDnid(dnid);//先删除销售详情表
			deliveryNoteService.deleteByPrimaryKey(dnid);//再删除销售表
			return new Result("取消成功",1);
		} else {
			deliveryNoteService.deleteByPrimaryKey(dnid);//直接采购表
			return new Result("成功",1);
		}
	}
	
	
	
	
	/**
	 * 保存采购单时，修改商品的信息和总金额(rfy)
	 * @param note
	 * @return
	 */
	@RequestMapping("/updateAny")
	public Object updateAny(DeliveryNote note) {
		Map<String, Object> map = new HashMap<String, Object>();
		int e=deliveryDetailService.isHaveByDnid(note.getDnId());//先查询是否已选择商品
		if (e>0) {
			int u=deliveryNoteService.updateTotalMoney(note.getDnId());//先修改总金额
			int n=deliveryNoteService.updateByPrimaryKeySelective(note);//再修改销售单信息
			if (n>0&&u>0) {
				map.put("success", true);
				map.put("message", "保存成功");
			} else {
				map.put("success", false);
				map.put("message", "保存失败");
			}
		} else {
			map.put("success", false);
			map.put("message", "保存失败,请先选择商品");
		}
		
		return map;
	}
	
	
	
}

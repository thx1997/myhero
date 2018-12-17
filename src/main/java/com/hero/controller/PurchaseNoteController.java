package com.hero.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.PurchaseNote;
import com.hero.service.PurchaseDetailService;
import com.hero.service.PurchaseNoteService;
import com.hero.util.Result;

@RestController
@RequestMapping("/purchaseNoteController")
public class PurchaseNoteController {
	@Autowired
	private PurchaseNoteService purchaseNoteService;
	@Autowired
	private PurchaseDetailService purchaseDetailService;
	/**
	 * 新增采购单
	 * @param note
	 * @return
	 */
	@RequestMapping("/insert")
	public Object insert(PurchaseNote note) {
		Map<String, Object> map = new HashMap<String, Object>();
		int n=purchaseNoteService.insertSelective(note);
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
	 * 采购单未保存
	 * @param pnid
	 * @return
	 */
	@RequestMapping("/cancel")
	public Object cancel(String pnid) {
		int e=purchaseDetailService.selDetailByPid(pnid);//先查询是否已选择商品
		if (e>0) {
			purchaseDetailService.delDtailByPid(pnid);//先删除采购详情表
			purchaseNoteService.deleteByPrimaryKey(pnid);//再删除采购表
			return new Result("取消成功",1);
		} else {
			purchaseNoteService.deleteByPrimaryKey(pnid);//直接采购表
			return new Result("成功",1);
		}
	}
	
	/**
	 * 保存采购单时，修改商品的信息和总金额
	 * @param note
	 * @return
	 */
	@RequestMapping("/updateAny")
	public Object updateAny(PurchaseNote note) {
		Map<String, Object> map = new HashMap<String, Object>();
		int n=purchaseNoteService.updateByPrimaryKeySelective(note);
		int u=purchaseNoteService.updateTotalMoney(note.getPnId());
		if (n>0&&u>0) {
			map.put("success", true);
			map.put("message", "保存成功");
		} else {
			map.put("success", false);
			map.put("message", "保存失败");
		}
		return map;
	}
	
	
}

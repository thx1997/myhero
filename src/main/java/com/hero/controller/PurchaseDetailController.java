package com.hero.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.PurchaseDetail;
import com.hero.entity.PurchaseNote;
import com.hero.entity.StorehouseDetail;
import com.hero.service.PurchaseDetailService;
import com.hero.service.PurchaseNoteService;
import com.hero.service.StorehouseDetailService;

@RestController
@RequestMapping(value="/purchaseDetailController",name="采购详情管理")
public class PurchaseDetailController {
	@Autowired
	private PurchaseDetailService purchaseDetailService;
	@Autowired
	private StorehouseDetailService storehouseDetailService;
	@Autowired
	private PurchaseNoteService purchaseNoteService;
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
	
	/**
	 * 修改采购详情(rfy)
	 * @param detail
	 * @return
	 */
	@RequestMapping("/update")
	public Object update(PurchaseDetail detail) {
		System.out.println("参数啊----"+detail.toString());
		Map<String, Object> map = new HashMap<String, Object>();
		int u=purchaseDetailService.updateByPrimaryKeySelective(detail);
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
	public Object delete(@RequestParam("pdIds")List<Integer> pdIds) {
		System.out.println("参数啊----"+pdIds);
		Map<String, Object> map = new HashMap<String, Object>();
		int u=purchaseDetailService.deleteByPdIdList(pdIds);
		if (u>0) {
			map.put("success", true);
			map.put("message", "删除成功");
		} else {
			map.put("success", false);
			map.put("message", "删除失败");
		}
		return map;
	}
	
	
	
	//分配仓库
	@RequestMapping(value="/checkHouse",name="采购分配仓库")
	public Object checkHouse(StorehouseDetail detail,Integer num,Integer pdId,String pnid,Integer uid) {
		System.out.println("参数啊----"+detail+num+pdId+pnid);
		Map<String, Object> map = new HashMap<String, Object>();
		PurchaseDetail pdetail=new PurchaseDetail();
		pdetail.setPdId(pdId);
		pdetail.setPdShId(detail.getSdSId());
		PurchaseNote note=new PurchaseNote();
		note.setPnId(pnid);
		note.setPnWarehousepersonid(uid);
		note.setPnStatus(3);
		StorehouseDetail shdetail=storehouseDetailService.selByPidAndSid(detail.getSdPId(), detail.getSdSId());
			if (shdetail!=null) {//修改商品库存量
				int onum=shdetail.getSdNumber();//原来的库存量
				int nnum=onum+num;
				detail.setSdNumber(nnum);
				detail.setSdId(shdetail.getSdId());
				int ud=storehouseDetailService.updateByPrimaryKeySelective(detail);
				if(ud>0) {
					
					map.put("success", true);
					map.put("message", "分配成功");
				} else {
					map.put("success", false);
					map.put("message", "分配失败");
				}
			} else {//添加商品仓库详情
				detail.setSdNumber(num);
				int d=storehouseDetailService.insertSelective(detail);
				
				if(d>0) {
					
					map.put("success", true);
					map.put("message", "分配成功");
				} else {
					map.put("success", false);
					map.put("message", "分配失败");
				}
			}
		
		purchaseDetailService.updateByPrimaryKeySelective(pdetail);//先修改采购详情中的信息
		purchaseNoteService.updateByPrimaryKeySelective(note);//修改采购单状态
		return map;
	}
	
	
	
	
	
	
}

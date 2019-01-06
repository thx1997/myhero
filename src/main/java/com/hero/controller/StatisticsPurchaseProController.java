package com.hero.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.StatisticsPurchasePro;
import com.hero.entity.StatisticsSupplierPro;
import com.hero.service.StatisticsPurchaseProService;

@RestController
@RequestMapping("/statisticsPurchaseProController")
public class StatisticsPurchaseProController {
	@Autowired
	private StatisticsPurchaseProService statisticsPurchaseProService;
	/**
	 * 根据年份、月份查询商品采购数量(rfy)
	 * @param y
	 * @param m
	 * @return
	 */
	@RequestMapping("/purchasequeryByYearAndMonth")
	public Object purchasequeryByYearAndMonth(Integer year,Integer month) {
		System.out.println("参数啊----"+year+">>>"+month);
		Map<String, Object> map = new HashMap<String, Object>();
		List<StatisticsPurchasePro> pro=statisticsPurchaseProService.queryByYearAndMonth(year, month);
	
		
		List<String> pNames=pro.stream().map(StatisticsPurchasePro::getpName).collect(Collectors.toList());
		System.out.println("商品名称："+pNames);
		List<Integer> pNums=pro.stream().map(StatisticsPurchasePro::getPronum).collect(Collectors.toList());
		
		System.out.println("数量："+pNums);
		map.put("pname", pNames);
		map.put("pnum", pNums);
		return map;
	}
	
	
	/**
	 * 根据年份、月份查询供应商供应的商品占比(rfy)
	 * @param y
	 * @param m
	 * @return
	 */
	@RequestMapping("/supplierqueryByYearAndMonth")
	public Object supplierqueryByYearAndMonth(Integer year,Integer month) {
		System.out.println("参数啊----"+year+">>>"+month);
		List<StatisticsSupplierPro> count=statisticsPurchaseProService.supplierQueryByYearAndMonth(year,month);
		//Map<String, Object> appleMap = count.stream().collect(Collectors.toMap(StatisticsSupplierPro::getSname, StatisticsSupplierPro::getCountnum));
		
		return count;
	}
	
	
}

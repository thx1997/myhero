package com.hero.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.HousePronum;
import com.hero.entity.ProductUnit;
import com.hero.service.HousePronumService;

@RestController
@RequestMapping("/housePronumController")
public class HousePronumController {
	@Autowired
	private HousePronumService housePronumService;
	
	/**
	 * 多条件分页查询(rfy)
	 * @param pro
	 * @return
	 */
	@RequestMapping(value="/queryAllPage")
	public Object queryAllPage(HousePronum pro) {
		System.out.println("条件参数>>>>>>>"+pro);
		Map<String, Object> map = new HashMap<String, Object>();
		List<HousePronum> list=housePronumService.queryPage(pro);
		int total=housePronumService.queryCountPage(pro);
		map.put("total", total);
		map.put("rows",list);
		return map;
	}
	
}

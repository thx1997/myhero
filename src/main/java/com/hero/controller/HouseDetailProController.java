package com.hero.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.HouseDetailPro;
import com.hero.entity.ProductCategory;
import com.hero.entity.ProductCommodity;
import com.hero.entity.query.HouseDetailProQuery;
import com.hero.entity.query.ProductCommodityQuery;
import com.hero.service.HouseDetailProService;

@RestController
@RequestMapping("/houseDetailProController")
public class HouseDetailProController {

	@Autowired
	private HouseDetailProService houseDetailProService;
	/**
	 * 多条件分页查询库存里的商品及属性(rfy)
	 * @param pquery
	 * @return
	 */
	@RequestMapping(value="/queryAllByQuery")
	public Object queryAllByQuery(HouseDetailProQuery query) {
		Map<String, Object> map = new HashMap<String, Object>();	
		List<HouseDetailPro> list=houseDetailProService.queryPage(query);
		int total=houseDetailProService.queryCountPage(query);
		map.put("total", total);
		map.put("rows",list);
		return map;
	}
}

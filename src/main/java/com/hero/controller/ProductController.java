package com.hero.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.Product;
import com.hero.entity.SupplierOrCustomer;
import com.hero.entity.query.ProductQuery;
import com.hero.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	/**
	 * 多条件分页查询商品信息(rfy)
	 * @param pquery
	 * @return
	 */
	@RequestMapping(value="/queryProByQuery")
	public Object queryProByQuery(ProductQuery pquery) {
		System.out.println("条件参数>>>>>>>"+pquery);
		Map<String, Object> map = new HashMap<String, Object>();
		List<Product> list=productService.selectProByQuery(pquery);
		int total=productService.selectCountByQuery(pquery);
		map.put("total", total);
		map.put("rows",list);
		return map;
	}
	
	
}

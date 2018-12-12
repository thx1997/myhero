package com.hero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.ProductBrand;
import com.hero.service.ProductBrandService;

@RestController
@RequestMapping("/productbrand")
public class ProductBrandController {

	@Autowired
	private ProductBrandService productBrandService;
	
	@RequestMapping(value="/queryAll")
	public Object queryAll() {
		List<ProductBrand> list=productBrandService.queryAll();
		return list;
	}
	
}

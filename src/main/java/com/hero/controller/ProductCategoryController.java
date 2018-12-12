package com.hero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.ProductCategory;
import com.hero.service.ProductCategoryService;

@RestController
@RequestMapping("/productcategory")
public class ProductCategoryController {
	@Autowired
	private ProductCategoryService productCategoryService;
	
	
	/**
	 * 树形显示所有商品类别信息(rfy)
	 * @return
	 */
	@RequestMapping("/queryAllProCate")
	public Object queryAllProCate(){
		List<ProductCategory> list=productCategoryService.queryAllProCate();
		return list;
	}
}

package com.hero.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.SupplierOrCustomerCategory;
import com.hero.service.SupplierOrCustomerCategoryService;
@RestController
@RequestMapping(value="/scategory",name="供应商客户类别")
public class SupplierOrCustomerCategoryController {

	@Autowired
	private SupplierOrCustomerCategoryService supplierOrCustomerCategoryService;
	
	@RequestMapping(value="/selectAllCate")
	public Object selectAllCate(Integer stype){
		List<SupplierOrCustomerCategory> list=supplierOrCustomerCategoryService.selectAllCate(stype);
		return list;
	}
	
}

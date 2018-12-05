package com.hero.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.SupplierOrCustomer;
import com.hero.entity.query.SupplierOrCustomerQuery;
import com.hero.service.SupplierOrCustomerService;

@RestController
@RequestMapping(value="/supplierorcustomer",name="供应商客户管理")
public class SupplierOrCustomerController {
	@Autowired
	private SupplierOrCustomerService supplierOrCustomerService;
	
	/**
	 * 多条件查询供应商客户信息(rfy)
	 * @param scquery
	 * @return
	 */
	@RequestMapping(value="/queryAllByCount")
	public Object queryAll(SupplierOrCustomerQuery scquery){
		Map<String, Object> map = new HashMap<String, Object>();
		List<SupplierOrCustomer> list=supplierOrCustomerService.selectAllByCount(scquery);
		int total=supplierOrCustomerService.selectCount(scquery);
		map.put("total", total);
		map.put("rows",list);
		return map;
	}
	
	
	
}

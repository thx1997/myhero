package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.SupplierOrCustomerCategory;
import com.hero.repository.SupplierOrCustomerCategoryMapper;
import com.hero.service.SupplierOrCustomerCategoryService;
@Service
public class SupplierOrCustomerCategoryServiceImpl implements SupplierOrCustomerCategoryService {

	@Autowired
	private SupplierOrCustomerCategoryMapper supplierOrCustomerCategoryMapper;

	@Override//(rfy)
	public List<SupplierOrCustomerCategory> selectAllCate(Integer stype) {
		// TODO Auto-generated method stub
		return supplierOrCustomerCategoryMapper.selectAllCate(stype);
	}
	
	
}

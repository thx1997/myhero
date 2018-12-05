package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.SupplierOrCustomer;
import com.hero.entity.query.SupplierOrCustomerQuery;
import com.hero.repository.SupplierOrCustomerMapper;
import com.hero.service.SupplierOrCustomerService;
@Service
public class SupplierOrCustomerServiceImpl implements SupplierOrCustomerService {
	@Autowired
	private SupplierOrCustomerMapper supplierOrCustomerMapper;

	@Override
	public List<SupplierOrCustomer> selectAllByCount(SupplierOrCustomerQuery scquery) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.selectAllByCount(scquery);
	}

	@Override
	public int selectCount(SupplierOrCustomerQuery scquery) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.selectCount(scquery);
	}
	
	
}

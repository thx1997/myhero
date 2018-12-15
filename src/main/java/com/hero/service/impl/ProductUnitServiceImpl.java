package com.hero.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.repository.ProductUnitMapper;
import com.hero.service.ProductUnitService;
@Service
public class ProductUnitServiceImpl implements ProductUnitService {
	@Autowired
	ProductUnitMapper productUnitMapper;
	@Override//thx
	public String selectPuNameBypuid(Integer puId) {
		return productUnitMapper.selectPuNameBypuid(puId);
	}

}

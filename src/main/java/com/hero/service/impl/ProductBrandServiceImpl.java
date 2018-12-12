package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.ProductBrand;
import com.hero.repository.ProductBrandMapper;
import com.hero.service.ProductBrandService;
@Service
public class ProductBrandServiceImpl implements ProductBrandService {

	@Autowired
	private ProductBrandMapper productBrandMapper;

	@Override
	public List<ProductBrand> queryAll() {
		// TODO Auto-generated method stub
		return productBrandMapper.queryAll();
	}
	
}

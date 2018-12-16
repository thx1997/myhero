package com.hero.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.ProductSpec;
import com.hero.repository.ProductSpecMapper;
import com.hero.service.ProductSpecService;
@Service
public class ProductSpecServiceImpl implements ProductSpecService {
	@Autowired
	ProductSpecMapper productSpecMapper;
	@Override//thx
	public ProductSpec selectBypid(Integer pid) {
		return productSpecMapper.selectBypid(pid);
	}
	@Override//(rfy)
	public int insertSelective(ProductSpec record) {
		// TODO Auto-generated method stub
		return productSpecMapper.insertSelective(record);
	}
	@Override//(rfy)
	public int updateByPrimaryKeySelective(ProductSpec record) {
		// TODO Auto-generated method stub
		return productSpecMapper.updateByPrimaryKeySelective(record);
	}

}

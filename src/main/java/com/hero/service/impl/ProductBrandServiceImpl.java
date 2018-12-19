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

	@Override//rfy
	public List<ProductBrand> queryAll() {
		// TODO Auto-generated method stub
		return productBrandMapper.queryAll();
	}

	@Override//rfy
	public List<ProductBrand> queryALLPage(ProductBrand record) {
		// TODO Auto-generated method stub
		return productBrandMapper.queryALLPage(record);
	}

	@Override//rfy
	public int queryCountPage(ProductBrand record) {
		// TODO Auto-generated method stub
		return productBrandMapper.queryCountPage(record);
	}

	@Override//rfy
	public int insertSelective(ProductBrand record) {
		// TODO Auto-generated method stub
		return productBrandMapper.insertSelective(record);
	}

	@Override//rfy
	public int updateByPrimaryKeySelective(ProductBrand record) {
		// TODO Auto-generated method stub
		return productBrandMapper.updateByPrimaryKeySelective(record);
	}

	@Override//rfy
	public int deleteByPrimaryKey(Integer pbId) {
		// TODO Auto-generated method stub
		return productBrandMapper.deleteByPrimaryKey(pbId);
	}

	@Override
	public int isExitByName(String pbname) {
		// TODO Auto-generated method stub
		return productBrandMapper.isExitByName(pbname);
	}

	@Override
	public ProductBrand selectByPrimaryKey(Integer pbId) {
		// TODO Auto-generated method stub
		return productBrandMapper.selectByPrimaryKey(pbId);
	}
	
}

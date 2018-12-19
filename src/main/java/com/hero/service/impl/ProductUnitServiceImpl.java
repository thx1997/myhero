package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.ProductUnit;
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
	@Override//rfy
	public List<ProductUnit> queryAllUnit() {
		// TODO Auto-generated method stub
		return productUnitMapper.queryAllUnit();
	}
	@Override//rfy
	public List<ProductUnit> queryByNamePage(ProductUnit record) {
		// TODO Auto-generated method stub
		return productUnitMapper.queryByNamePage(record);
	}
	@Override//rfy
	public int queryCountByName(ProductUnit record) {
		// TODO Auto-generated method stub
		return productUnitMapper.queryCountByName(record);
	}
	@Override//rfy
	public int deleteByPrimaryKey(Integer puId) {
		// TODO Auto-generated method stub
		return productUnitMapper.deleteByPrimaryKey(puId);
	}
	@Override//rfy
	public int insertSelective(ProductUnit record) {
		// TODO Auto-generated method stub
		return productUnitMapper.insertSelective(record);
	}
	@Override//rfy
	public int updateByPrimaryKeySelective(ProductUnit record) {
		// TODO Auto-generated method stub
		return productUnitMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	public int isExitByName(String puname) {
		// TODO Auto-generated method stub
		return productUnitMapper.isExitByName(puname);
	}
	@Override
	public ProductUnit selectByPrimaryKey(Integer puId) {
		// TODO Auto-generated method stub
		return productUnitMapper.selectByPrimaryKey(puId);
	}

}

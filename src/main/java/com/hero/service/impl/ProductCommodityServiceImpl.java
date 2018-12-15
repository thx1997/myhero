package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.ProductCommodity;
import com.hero.entity.query.ProductCommodityQuery;
import com.hero.repository.ProductCommodityMapper;
import com.hero.service.ProductCommodityService;
@Service
public class ProductCommodityServiceImpl implements ProductCommodityService {
	@Autowired
	private ProductCommodityMapper productCommodityMapper;
	
	@Override//(rfy)
	public List<ProductCommodity> queryAllByQuery(ProductCommodityQuery pcquery) {
		// TODO Auto-generated method stub
		return productCommodityMapper.queryAllByQuery(pcquery);
	}

	@Override//(rfy)
	public int queryCountByQuery(ProductCommodityQuery pcquery) {
		// TODO Auto-generated method stub
		return productCommodityMapper.queryCountByQuery(pcquery);
	}

}

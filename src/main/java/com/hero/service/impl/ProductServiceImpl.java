package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.Product;
import com.hero.entity.query.ProductQuery;
import com.hero.entity.query.StorehousePro;
import com.hero.repository.ProductMapper;
import com.hero.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public List<Product> selectProByQuery(ProductQuery pquery) {
		// TODO Auto-generated method stub
		return productMapper.selectProByQuery(pquery);
	}

	@Override
	public int selectCountByQuery(ProductQuery pquery) {
		// TODO Auto-generated method stub
		return productMapper.selectCountByQuery(pquery);
	}

	@Override//thx
	public List<Product> queryProBYPcidAndSid(StorehousePro storehousePro) {
		return productMapper.queryProBYPcidAndSid(storehousePro);
	}

	@Override//thx
	public int queryProBYPcidAndSidCount(StorehousePro storehousePro) {
		return productMapper.queryProBYPcidAndSidCount(storehousePro);
	}

}

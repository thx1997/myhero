package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.DeliveryDetailSpec;
import com.hero.entity.query.DeliveryDetailSpecQuery;
import com.hero.repository.DeliveryDetailSpecMapper;
import com.hero.service.DeliveryDetailSpecService;

@Service
public class DeliveryDetailSpecServiceImpl implements DeliveryDetailSpecService {
	@Autowired
	private DeliveryDetailSpecMapper deliveryDetailSpecMapper;

	@Override//(rfy)
	public List<DeliveryDetailSpec> queryAllByPage(DeliveryDetailSpecQuery query) {
		// TODO Auto-generated method stub
		return deliveryDetailSpecMapper.queryAllByPage(query);
	}

	@Override//(rfy)
	public int queryCount(DeliveryDetailSpecQuery query) {
		// TODO Auto-generated method stub
		return deliveryDetailSpecMapper.queryCount(query);
	}
	
}

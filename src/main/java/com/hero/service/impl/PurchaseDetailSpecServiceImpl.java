package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.PurchaseDetailSpec;
import com.hero.entity.query.PurchaseDetailSpecQuery;
import com.hero.repository.PurchaseDetailSpecMapper;
import com.hero.service.PurchaseDetailSpecService;
@Service
public class PurchaseDetailSpecServiceImpl implements PurchaseDetailSpecService {
	@Autowired
	private PurchaseDetailSpecMapper purchaseDetailSpecMapper;

	@Override
	public List<PurchaseDetailSpec> queryByPurQuery(PurchaseDetailSpecQuery query) {
		// TODO Auto-generated method stub
		return purchaseDetailSpecMapper.queryByPurQuery(query);
	}

	@Override
	public int queryCountByPurQuery(PurchaseDetailSpecQuery query) {
		// TODO Auto-generated method stub
		return purchaseDetailSpecMapper.queryCountByPurQuery(query);
	}
	

}

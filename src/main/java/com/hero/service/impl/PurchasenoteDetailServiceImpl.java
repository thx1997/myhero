package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.PurchasenoteDetail;
import com.hero.entity.query.PurchasenoteDetailQuery;
import com.hero.repository.PurchasenoteDetailMapper;
import com.hero.service.PurchasenoteDetailService;
@Service
public class PurchasenoteDetailServiceImpl implements PurchasenoteDetailService {
	@Autowired
	private PurchasenoteDetailMapper purchasenoteDetailMapper;

	@Override
	public List<PurchasenoteDetail> queryByQueryPage(PurchasenoteDetail query) {
		// TODO Auto-generated method stub
		return purchasenoteDetailMapper.queryByQueryPage(query);
	}

	@Override
	public int queryCountByQuery(PurchasenoteDetail query) {
		// TODO Auto-generated method stub
		return purchasenoteDetailMapper.queryCountByQuery(query);
	}

	

	@Override
	public List<PurchasenoteDetail> queryByPage(PurchasenoteDetailQuery query) {
		// TODO Auto-generated method stub
		return purchasenoteDetailMapper.queryByPage(query);
	}

	@Override
	public int queryCountByPage(PurchasenoteDetailQuery query) {
		// TODO Auto-generated method stub
		return purchasenoteDetailMapper.queryCountByPage(query);
	}
	
	
}

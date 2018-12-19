package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.BofDetail;
import com.hero.entity.query.BofDetailQuery;
import com.hero.repository.BofDetailMapper;
import com.hero.service.BofDetailService;
@Service
public class BofDetailServiceImpl implements BofDetailService {
	@Autowired
	BofDetailMapper bofDetailMapper;
	@Override//thx
	public List<BofDetail> querybofd(BofDetailQuery bofdQuery) {
		return bofDetailMapper.querybofd(bofdQuery);
	}

	@Override//thx
	public int querybofdCount(BofDetailQuery bofdQuery) {
		return bofDetailMapper.querybofdCount(bofdQuery);
	}

}

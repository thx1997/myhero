package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.Profit;
import com.hero.repository.ProfitMapper;
import com.hero.service.ProfitService;
@Service
public class ProfitServiceImpl implements ProfitService {
	@Autowired
	ProfitMapper profitMapper;
	@Override//thx
	public List<Profit> queryProfit() {
		return profitMapper.queryProfit();
	}

}

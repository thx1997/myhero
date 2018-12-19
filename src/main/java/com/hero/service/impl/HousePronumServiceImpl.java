package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.HousePronum;
import com.hero.repository.HousePronumMapper;
import com.hero.service.HousePronumService;
@Service
public class HousePronumServiceImpl implements HousePronumService {
	@Autowired
	private HousePronumMapper housePronumMapper;
	@Override//(rfy)
	public List<HousePronum> queryPage(HousePronum record) {
		// TODO Auto-generated method stub
		return housePronumMapper.queryPage(record);
	}

	@Override//(rfy)
	public int queryCountPage(HousePronum record) {
		// TODO Auto-generated method stub
		return housePronumMapper.queryCountPage(record);
	}

}

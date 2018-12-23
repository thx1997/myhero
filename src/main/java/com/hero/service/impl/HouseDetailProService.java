package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.HouseDetailPro;
import com.hero.entity.query.HouseDetailProQuery;
import com.hero.repository.HouseDetailProMapper;

@Service
public class HouseDetailProService implements com.hero.service.HouseDetailProService {

	@Autowired
	private HouseDetailProMapper HouseDetailProMapper;
	@Override
	public List<HouseDetailPro> queryPage(HouseDetailProQuery query) {
		// TODO Auto-generated method stub
		return HouseDetailProMapper.queryPage(query);
	}

	@Override
	public int queryCountPage(HouseDetailProQuery query) {
		// TODO Auto-generated method stub
		return HouseDetailProMapper.queryCountPage(query);
	}

}

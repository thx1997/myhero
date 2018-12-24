package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.HouseDetailPro;
import com.hero.entity.query.HouseDetailProQuery;
import com.hero.entity.query.HouseDetailProQuery1;
import com.hero.repository.HouseDetailProMapper;

@Service
public class HouseDetailProServiceImpl implements com.hero.service.HouseDetailProService {

	@Autowired
	private HouseDetailProMapper houseDetailProMapper;
	@Override
	public List<HouseDetailPro> queryPage(HouseDetailProQuery query) {
		// TODO Auto-generated method stub
		return houseDetailProMapper.queryPage(query);
	}

	@Override
	public int queryCountPage(HouseDetailProQuery query) {
		// TODO Auto-generated method stub
		return houseDetailProMapper.queryCountPage(query);
	}

	@Override//thx
	public List<HouseDetailPro> queryProBYPcidAndSid(HouseDetailProQuery1 query) {
		// TODO Auto-generated method stub
		return houseDetailProMapper.queryProBYPcidAndSid(query);
	}

	@Override//thx
	public int queryProBYPcidAndSidCount(HouseDetailProQuery1 query) {
		// TODO Auto-generated method stub
		return houseDetailProMapper.queryProBYPcidAndSidCount(query);
	}

}

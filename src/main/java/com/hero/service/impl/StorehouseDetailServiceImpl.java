package com.hero.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.StoreHouse;
import com.hero.entity.StorehouseDetail;
import com.hero.repository.StorehouseDetailMapper;
import com.hero.service.StorehouseDetailService;

@Service
public class StorehouseDetailServiceImpl implements StorehouseDetailService {

	@Autowired
	private StorehouseDetailMapper storehouseDetailMapper;
	@Override//rfy
	public int insertSelective(StorehouseDetail record) {
		// TODO Auto-generated method stub
		return storehouseDetailMapper.insertSelective(record);
	}

	@Override//rfy
	public int updateByPrimaryKeySelective(StorehouseDetail record) {
		// TODO Auto-generated method stub
		return storehouseDetailMapper.updateByPrimaryKey(record);
	}

	@Override//rfy
	public StorehouseDetail selByPidAndSid(Integer pid, Integer sid) {
		// TODO Auto-generated method stub
		return storehouseDetailMapper.selByPidAndSid(pid, sid);
	}

	@Override//thx
	public int updateNumBysidpid(Integer sid, Integer pid, Integer num) {
		// TODO Auto-generated method stub
		return storehouseDetailMapper.updateNumBysidpid(sid, pid, num);
	}

}

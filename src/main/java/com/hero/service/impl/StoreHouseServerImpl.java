package com.hero.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.Employee;
import com.hero.entity.StoreHouse;
import com.hero.entity.query.StoreHouseQuery;
import com.hero.repository.StoreHouseMapper;
import com.hero.service.StoreHouseServer;
@Service
public class StoreHouseServerImpl implements StoreHouseServer {
	@Autowired
	StoreHouseMapper storeHouseMapper;
	@Override//thx
	public List<StoreHouse> queryAllInvoicing() {
		return storeHouseMapper.queryAllInvoicing();
	}
	@Override
	public int deleteByPrimaryKey(Integer sId) {
		// TODO Auto-generated method stub
		return storeHouseMapper.deleteByPrimaryKey(sId);
	}

	@Override
	public int insertSelective(StoreHouse record) {
		// TODO Auto-generated method stub
		record.setsCreatetime(new Date());
		record.setsStatus(0);
		return storeHouseMapper.insertSelective(record);
	}

	@Override
	public StoreHouse selectByPrimaryKey(Integer sId) {
		// TODO Auto-generated method stub
		return storeHouseMapper.selectByPrimaryKey(sId);
	}

	@Override
	public int updateByPrimaryKeySelective(StoreHouse record) {
		// TODO Auto-generated method stub
		return storeHouseMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<StoreHouse> selectByStoreHouseQuery(StoreHouseQuery storeHouseQuery) {
		// TODO Auto-generated method stub
		return storeHouseMapper.selectByStoreHouseQuery(storeHouseQuery);
	}

	@Override
	public int selectCountByStoreHouseQuery(StoreHouseQuery storeHouseQuery) {
		// TODO Auto-generated method stub
		return storeHouseMapper.selectCountByStoreHouseQuery(storeHouseQuery);
	}

	@Override
	public List<Employee> selEctemplByStoreHouse() {
		// TODO Auto-generated method stub
		return storeHouseMapper.selEctemplByStoreHouse();
	}

	@Override
	public int lockStoreHouse(int sid, int status) {
		// TODO Auto-generated method stub
		return storeHouseMapper.lockStoreHouse(sid, status);
	}
	@Override//thx
	public StoreHouse selectSHByeid(Integer eid) {
		return storeHouseMapper.selectSHByeid(eid);
	}
}

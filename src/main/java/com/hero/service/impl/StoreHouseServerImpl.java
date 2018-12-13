package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.StoreHouse;
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

}

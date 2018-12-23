package com.hero.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.InventoryControl;
import com.hero.repository.InventoryControlMapper;
import com.hero.service.InventoryControlService;
@Service
public class InventoryControlServiceImpl implements InventoryControlService {
	@Autowired
	InventoryControlMapper inventoryControlMapper;
	@Override//thx
	public int insertSelective(InventoryControl record) {
		return inventoryControlMapper.insertSelective(record);
	}

}

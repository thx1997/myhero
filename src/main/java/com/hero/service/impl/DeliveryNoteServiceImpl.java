package com.hero.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.DeliveryNote;
import com.hero.repository.DeliveryNoteMapper;
import com.hero.service.DeliveryNoteService;
@Service
public class DeliveryNoteServiceImpl implements DeliveryNoteService{
	@Autowired
	private DeliveryNoteMapper deliveryNoteMapper;

	@Override//(rfy)
	public int insertSelective(DeliveryNote record) {
		// TODO Auto-generated method stub
		return deliveryNoteMapper.insertSelective(record);
	}

	@Override//(rfy)
	public int deleteByPrimaryKey(String dnId) {
		// TODO Auto-generated method stub
		return deliveryNoteMapper.deleteByPrimaryKey(dnId);
	}

	@Override//(rfy)
	public int updateByPrimaryKeySelective(DeliveryNote record) {
		// TODO Auto-generated method stub
		return deliveryNoteMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateTotalMoney(String dnid) {
		// TODO Auto-generated method stub
		return deliveryNoteMapper.updateTotalMoney(dnid);
	}
	
	
}

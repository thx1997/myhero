package com.hero.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.PurchaseNote;
import com.hero.repository.PurchaseNoteMapper;
import com.hero.service.PurchaseNoteService;
@Service
public class PurchaseNoteServiceImpl implements PurchaseNoteService {

	@Autowired
	private PurchaseNoteMapper purchaseNoteMapper;
	@Override//(rfy)
	public int insertSelective(PurchaseNote record) {
		// TODO Auto-generated method stub
		return purchaseNoteMapper.insertSelective(record);
	}
	@Override//(rfy)
	public int deleteByPrimaryKey(String pnId) {
		// TODO Auto-generated method stub
		return purchaseNoteMapper.deleteByPrimaryKey(pnId);
	}

}

package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.PurchaseDetailSpec;
import com.hero.repository.PurchaseDetailSpecMapper;
import com.hero.service.PurchaseDetailSpecService;
@Service
public class PurchaseDetailSpecServiceImpl implements PurchaseDetailSpecService {
	@Autowired
	private PurchaseDetailSpecMapper purchaseDetailSpecMapper;
	@Override//(rfy)
	public List<PurchaseDetailSpec> queryByPurId(String pnid) {
		// TODO Auto-generated method stub
		return purchaseDetailSpecMapper.queryByPurId(pnid);
	}

}

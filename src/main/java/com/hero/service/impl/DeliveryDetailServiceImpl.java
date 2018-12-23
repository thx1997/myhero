package com.hero.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.DeliveryDetail;
import com.hero.repository.DeliveryDetailMapper;
import com.hero.service.DeliveryDetailService;
@Service
public class DeliveryDetailServiceImpl implements DeliveryDetailService{
	@Autowired
	private DeliveryDetailMapper deliveryDetailMapper;

	@Override//(rfy)
	public int insertSelective(DeliveryDetail record) {
		// TODO Auto-generated method stub
		return deliveryDetailMapper.insertSelective(record);
	}

	@Override//(rfy)
	public DeliveryDetail selectByDnIdAndPid(String dnid, Integer pid) {
		// TODO Auto-generated method stub
		return deliveryDetailMapper.selectByDnIdAndPid(dnid, pid);
	}

	@Override//(rfy)
	public int updateByPrimaryKeySelective(DeliveryDetail record) {
		// TODO Auto-generated method stub
		return deliveryDetailMapper.updateByPrimaryKeySelective(record);
	}

	@Override//(rfy)
	public int deleteByDnid(String dnid) {
		// TODO Auto-generated method stub
		return deliveryDetailMapper.deleteByDnid(dnid);
	}

	@Override//(rfy)
	public int deleteByDdIdList(List<Integer> ddid) {
		// TODO Auto-generated method stub
		return deliveryDetailMapper.deleteByDdIdList(ddid);
	}

	@Override
	public int isHaveByDnid(String dnid) {
		// TODO Auto-generated method stub
		return deliveryDetailMapper.isHaveByDnid(dnid);
	}

	
	
	

}

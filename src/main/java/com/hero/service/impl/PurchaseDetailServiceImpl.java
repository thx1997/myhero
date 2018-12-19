package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.PurchaseDetail;
import com.hero.repository.PurchaseDetailMapper;
import com.hero.service.PurchaseDetailService;
@Service
public class PurchaseDetailServiceImpl implements PurchaseDetailService {

	@Autowired
	private PurchaseDetailMapper purchaseDetailMapper;
	@Override//(rfy)
	public int selDetailByPid(String pid) {
		// TODO Auto-generated method stub
		return purchaseDetailMapper.selDetailByPid(pid);
	}
	@Override//(rfy)
	public int delDtailByPid(String pid) {
		// TODO Auto-generated method stub
		return purchaseDetailMapper.delDtailByPid(pid);
	}
	@Override//(rfy)
	public int insertSelective(PurchaseDetail record) {
		// TODO Auto-generated method stub
		return purchaseDetailMapper.insertSelective(record);
	}
	
	@Override//(rfy)
	public int updateByPrimaryKeySelective(PurchaseDetail record) {
		// TODO Auto-generated method stub
		return purchaseDetailMapper.updateByPrimaryKeySelective(record);
	}
	@Override//(rfy)
	public PurchaseDetail queryByPurIdAndPid(String pnid, Integer pid, Integer psid) {
		// TODO Auto-generated method stub
		return purchaseDetailMapper.queryByPurIdAndPid(pnid, pid, psid);
	}
	@Override//(rfy)
	public int deleteByPrimaryKey(Integer pdId) {
		// TODO Auto-generated method stub
		return purchaseDetailMapper.deleteByPrimaryKey(pdId);
	}
	@Override//(rfy)
	public int deleteByPdIdList(List<Integer> pdid) {
		// TODO Auto-generated method stub
		return purchaseDetailMapper.deleteByPdIdList(pdid);
	}
	
	

}

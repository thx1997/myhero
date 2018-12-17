package com.hero.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.BreakageOverflowDetail;
import com.hero.repository.BreakageOverflowDetailMapper;
import com.hero.service.BreakageOverflowDetailService;
@Service
public class BreakageOverflowDetailServiceImpl implements BreakageOverflowDetailService {
	@Autowired
	BreakageOverflowDetailMapper breakageOverflowDetailMapper;
	@Override//thx
	public int selectSdnumberBypuid(Integer sdpid, Integer sdsid) {
		return breakageOverflowDetailMapper.selectSdnumberBypuid(sdpid, sdsid);
	}
	@Override//thx
	public int insertSelective(BreakageOverflowDetail record) {
		return breakageOverflowDetailMapper.insertSelective(record);
	}

}

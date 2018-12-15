package com.hero.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.repository.BreakageOverflowDetailMapper;
import com.hero.service.BreakageOverflowDetailService;
@Service
public class BreakageOverflowDetailServiceImpl implements BreakageOverflowDetailService {
	@Autowired
	BreakageOverflowDetailMapper breakageOverflowDetailMapper;
	@Override
	public int selectSdnumberBypuid(Integer sdpid, Integer sdsid) {
		return breakageOverflowDetailMapper.selectSdnumberBypuid(sdpid, sdsid);
	}

}

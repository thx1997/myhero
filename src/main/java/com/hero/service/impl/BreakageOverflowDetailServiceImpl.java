package com.hero.service.impl;

import java.util.List;

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
	@Override//thx
	public int updateBodStateByBodId(Integer bodId, Integer state, Integer eid, Integer type) {
			return breakageOverflowDetailMapper.updateBodStateByBodId(bodId, state, eid, type);
	}
	@Override//thx
	public Integer selectBodStateByBoid(Integer boid) {
		return breakageOverflowDetailMapper.selectBodStateByBoid(boid);
	}
	

}

package com.hero.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.repository.BreakageOverflowMapper;
import com.hero.service.BreakageOverflowServer;
@Service
public class BreakageOverflowServerImpl implements BreakageOverflowServer {
	@Autowired
	BreakageOverflowMapper breakageOverflowMapper;
	@Override//thx
	public int insertBreakageOverflow(int eid) {
		return breakageOverflowMapper.insertBreakageOverflow(eid);
	}
	@Override//thx
	public int selectMaxboid(int eid) {
		return breakageOverflowMapper.selectMaxboid(eid);
	}

}

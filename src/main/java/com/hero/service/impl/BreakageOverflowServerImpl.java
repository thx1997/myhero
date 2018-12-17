package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.BreakageOverflow;
import com.hero.entity.query.BreakageOverflowQuery;
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
	@Override//thx
	public int selectBoNumber(Integer boId) {
		return breakageOverflowMapper.selectBoNumber(boId);
	}
	@Override//thx
	public int updateBoNumber(Integer boId, Integer number) {
		return breakageOverflowMapper.updateBoNumber(boId, number);
	}
	@Override//thx
	public List<BreakageOverflow> querybof(BreakageOverflowQuery bofQuery) {
		return breakageOverflowMapper.querybof(bofQuery);
	}
	@Override//thx
	public int querybofCount(BreakageOverflowQuery bofQuery) {
		return breakageOverflowMapper.querybofCount(bofQuery);
	}

}

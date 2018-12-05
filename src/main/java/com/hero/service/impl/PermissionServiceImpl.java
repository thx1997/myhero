package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.repository.PermissionMapper;
@Service
public class PermissionServiceImpl implements com.hero.service.PermissionService {

	@Autowired
	private PermissionMapper permissionMapper;
	@Override//rfy
	public List<String> getPermissionValueByEid(int eid) {
		// TODO Auto-generated method stub
		return permissionMapper.getPermissionValueByEid(eid);
	}

}

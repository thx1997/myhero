package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.Role;
import com.hero.repository.RoleMapper;
import com.hero.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper roleMapper;
	@Override//rfy
	public List<Integer> getRoleIdByeid(int eid) {
		// TODO Auto-generated method stub
		return roleMapper.getRoleIdByeid(eid);
	}
	@Override//rfy
	public List<Role> getRoleByEid(int eid) {
		// TODO Auto-generated method stub
		return roleMapper.getRoleByEid(eid);
	}

}

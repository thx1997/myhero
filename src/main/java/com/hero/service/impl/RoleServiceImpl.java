package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.Role;
import com.hero.entity.query.RoleQuery;
import com.hero.repository.RoleMapper;
import com.hero.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper roleMapper;

	@Override // rfy
	public List<Integer> getRoleIdByeid(int eid) {
		return roleMapper.getRoleIdByeid(eid);
	}

	@Override // rfy
	public List<Role> getRoleByEid(int eid) {
		return roleMapper.getRoleByEid(eid);
	}

	@Override//wxk
	public int updateByPrimaryKeySelective(Role record) {
		return roleMapper.updateByPrimaryKeySelective(record);
	}

	@Override//wxk
	public int insertSelective(Role record) {
		return roleMapper.insertSelective(record);
	}

	@Override//wxk
	public List<Role> queryRole(RoleQuery roleQuery) {
		return roleMapper.queryRole(roleQuery);
	}

	@Override//wxk
	public int queryRoleCount(RoleQuery roleQuery) {
		return roleMapper.queryRoleCount(roleQuery);
	}

	@Override//wxk
	public int delRoleByrid(int rid) {
		return roleMapper.delRoleByrid(rid);
	}

	@Override
	public List<Role> queryAllRoles() {
		return roleMapper.queryAllRoles();
	}

}

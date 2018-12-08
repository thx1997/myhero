package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.Role;
import com.hero.entity.query.QueryBase;
import com.hero.entity.query.RoleQuery;
import com.hero.repository.RoleMapper;
import com.hero.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper roleMapper;
	@Override//thx
	public List<Role> queryRole(RoleQuery roleQuery) {
		return roleMapper.queryRole(roleQuery);
	}

	@Override//thx
	public int queryRoleCount(RoleQuery roleQuery) {
		return roleMapper.queryRoleCount(roleQuery);
	}
	@Override // rfy
	public List<Integer> getRoleIdByeid(int eid) {
		return roleMapper.getRoleIdByeid(eid);
	}

	@Override // rfy
	public List<Role> getRoleByEid(int eid) {
		return roleMapper.getRoleByEid(eid);
	}
	@Override//thx
	public List<Role> queryAllRole(QueryBase queryBase) {
		return roleMapper.queryAllRole(queryBase);
	}
	@Override//thx
	public int queryAllRoleCount(QueryBase queryBase) {
		return roleMapper.queryAllRoleCount(queryBase);
	}
	@Override//thx
	public int delRoleModule(int rid) {
		return roleMapper.delRoleModule(rid);
	}

	@Override//thx
	public int addRoleModule(int rid, List<Integer> mids) {
		return roleMapper.addRoleModule(rid, mids);
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
	public int delRoleByrid(int rid) {
		return roleMapper.delRoleByrid(rid);
	}

	@Override
	public List<Role> queryAllRoles() {
		return roleMapper.queryAllRoles();
	}

	

}

package com.hero.service;

import java.util.List;

import com.hero.entity.Role;

public interface RoleService {
	//根据用户编号查询用户的角色编号(rfy)
  	public List<Integer> getRoleIdByeid(int eid);
  	//根据用户编号查询查询用户所拥有的角色(rfy)
  	public List<Role> getRoleByEid(int eid);
}

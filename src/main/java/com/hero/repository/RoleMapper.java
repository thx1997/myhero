package com.hero.repository;

import java.util.List;

import com.hero.entity.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer rId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer rId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    //根据用户编号查询用户的角色编号(rfy)
  	public List<Integer> getRoleIdByeid(int eid);
  	//根据用户编号查询查询用户所拥有的角色(rfy)
  	public List<Role> getRoleByEid(int eid);
}
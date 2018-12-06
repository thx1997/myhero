package com.hero.repository;

import java.util.List;

import com.hero.entity.Role;
import com.hero.entity.query.QueryBase;

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
  	/**
  	 * 查询所有角色
  	 * @author thx
  	 * @param queryBase 分页条件
  	 * @return 角色集合
  	 */  	
  	public List<Role> queryAllRole(QueryBase queryBase);
  	/**
  	 * 查询所有角色
  	 * @author thx
  	 * @param queryBase 分页条件
  	 * @return 角色集合总条数
  	 */  
  	public int queryAllRoleCount(QueryBase queryBase);
  	
}
package com.hero.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hero.entity.Permission;

public interface PermissionMapper {
    int deleteByPrimaryKey(Integer perId);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer perId);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
    
    //根据用户Id查询出该用户的所有权限(rfy)
  	public List<String> getPermissionValueByEid(int eid);
  	
    //查询所有权限集合(rfy)
  	public List<String> queryAll();
  	//批量插入权限数据(rfy)
  	public int batchInsert(@Param("list")List<Permission> pList);
  	//清除权限(rfy)
  	public int delPermission();
  	
}
package com.hero.service;

import java.util.List;

public interface PermissionService {
	//根据用户Id查询出该用户的所有权限(rfy)
  	public List<String> getPermissionValueByEid(int eid);
}

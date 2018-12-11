package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.Node;
import com.hero.entity.Permission;
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
	@Override//rfy
	public List<String> queryAll() {
		// TODO Auto-generated method stub
		return permissionMapper.queryAll();
	}
	@Override//rfy
	public int batchInsert(List<Permission> pList) {
		// TODO Auto-generated method stub
		return permissionMapper.batchInsert(pList);
	}
	@Override//rfy
	public int delPermission() {
		// TODO Auto-generated method stub
		return permissionMapper.delPermission();
	}
	
	
	@Override//thx
	public List<Node> queryNode() {
		return permissionMapper.queryNode();
	}
	@Override//thx
	public List<Integer> queryPermissionIdsByRoleIds(List<Integer> roleIds) {
		return permissionMapper.queryPermissionIdsByRoleIds(roleIds);

	}
	@Override//thx
	public List<Node> queryNodeChecked(List<Integer> rid) {
		List<Node> rootList=this.queryNode();
		List<Integer> pId=this.queryPermissionIdsByRoleIds(rid);
		
		//把角色拥有的权限树设置为选中
		this.setPermissionTreeChecked(rootList, pId);
		return rootList;
	}
	/**
	 * 把角色拥有的权限树设置为选中
	 * @param permissionTree
	 * @param permissionIds
	 */
	private void setPermissionTreeChecked(List<Node> permissionTree,List<Integer> permissionIds){
		for(Node module:permissionTree){//遍历出所有权限所属模块
			for(Node p:module.getChildren()){//遍历出所有权限节点
				if(permissionIds.contains(p.getId()))
					p.setChecked(true);//角色拥有的权限勾选中				
			}
			
		}
	}

}

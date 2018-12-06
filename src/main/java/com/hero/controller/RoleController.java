package com.hero.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hero.entity.Role;
import com.hero.entity.query.RoleQuery;
import com.hero.service.RoleService;
import com.hero.util.ResultConst;

public class RoleController {
	@Autowired
	private RoleService rService;

	/**
	 * 查询所有角色信息 http://localhost:8080/invoicing/role/getRoles
	 * 
	 * @return 所有角色集合
	 * @throws Exception
	 */
	@RequestMapping(value = "/getRoles")
	public Object getRoletbsList(RoleQuery rQuery) throws Exception {
		List<Role> rows = rService.queryRole(rQuery);
		int total = rService.queryRoleCount(rQuery);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", total);
		map.put("rows", rows);
		return map;
	}

	/**
	 * 添加角色 http://localhost:8080/invoicing/role/insertRole?rName=aa
	 * 
	 * @param request
	 * @param response
	 * @return 受影响的行数
	 */
	@RequestMapping(value = "/insertRole", name = "角色新增")
	public Map<String, Object> insertRole(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> map = new HashMap<String, Object>();
		Role roletb = new Role();
		String roleName = request.getParameter("roleName");
		roletb.setrName(roleName);
		;
		int n = rService.insertSelective(roletb);
		if (n > 0) {
			map.put("success", true);
			map.put("message", ResultConst.SUCCESS_PUT);
		} else {
			map.put("success", false);
			map.put("message", ResultConst.NULL_ENTITY_PUT);
		}

		return map;
	}

	/**
	 * 更新角色 http://localhost:8080/invoicing/role/updateRole
	 * 
	 * @param request
	 * @param response
	 * @return 受影响的行数
	 */
	@RequestMapping(value = "/updateRole", name = "角色修改")
	public Map<String, Object> updateRole(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> map = new HashMap<String, Object>();
		Role roletb = new Role();
		String rName = request.getParameter("name");
		int roleId = Integer.parseInt(request.getParameter("roleId"));
		List<Role> list = rService.queryAllRoles();
		for (Role role : list) {
			if (role.getrName().equals(rName) && role.getrId() != roleId) {
				map.put("success", false);
				map.put("message", "该角色已存在，请重新填写");
				return map;
			}
		}
		roletb.setrName(rName);
		roletb.setrId(roleId);
		int n = rService.updateByPrimaryKeySelective(roletb);
		if (n > 0) {
			map.put("success", true);
			map.put("message", ResultConst.SUCCESS_POST);
		} else {
			map.put("success", false);
			map.put("message", ResultConst.NULL_ENTITY_POST);
		}
		return map;

	}
	/**
	 * 根据角色Id删除角色
	 * @param request
	 * @return Map集合
	 */
	@RequestMapping(value="/delRole",name="角色删除")
	public Map<String, Object> deleteRole(HttpServletRequest request){
		Map<String, Object> map=new HashMap<String, Object>();
		int roleId=Integer.parseInt(request.getParameter("roleId"));
		if (rService.delRoleByrid(roleId)>0) {
			map.put("success", true);
			map.put("message","删除成功");
		}else {
			map.put("success", false);
			map.put("message", "该角色和用户或模块有关联，暂不能删除");
		}
		return map;
		
	}
}

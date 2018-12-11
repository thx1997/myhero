package com.hero.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.Role;
import com.hero.entity.query.RoleQuery;
import com.hero.service.PermissionService;
import com.hero.service.RoleService;
import com.hero.util.ResultConst;
@RestController
@RequestMapping(value="/role",name="角色管理")
public class RoleController {
	@Autowired
	private RoleService roleService;
	@Autowired
	private PermissionService permissionService;   
	 // @RequestMapping("/insertPermissionGiveRole",name="给角色分配权限")
	@RequestMapping("/insertPermissionGiveRole")
	public Object setPermissioninsertPermissionGiveRole(String premisstionis,
			Integer rId) {

		System.out.println("角色编号==》" + rId + ":权限编号集合==》" + premisstionis);

		Map<String, Object> map = new HashMap<String, Object>();
	/*	String arr[]=moduleIds.split(",");//把String类型的数据转成数组
		
		List<String> midlist = new ArrayList<String>();
	    for (int i = 0; i < arr.length; i++) {
	    	midlist.add(arr[i]);
	    }
	    List<Integer> mids =midlist.stream().map(Integer::parseInt).collect(Collectors.toList());
	    System.out.println("最终参数>>>>>>>"+mids);*/
		
		if(premisstionis==null) {
			//清空该角色的所有权限
			 try {
				int c=roleService.deletePermission(rId);
				if (c>0) {
					map.put("success", true);
					map.put("message", "清空成功");
				} else {
					map.put("success", false);
					map.put("message", "清空失败");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				map.put("success", false);
				map.put("message", "清空失败");
			}
			
		}else {
			//先删除
			roleService.deletePermission(rId);
			//再添加
			String arr[]=premisstionis.split(",");//把String类型的数据转成数组
			
			List<String> premisstionilist = new ArrayList<String>();
		    for (int i = 0; i < arr.length; i++) {
		    	premisstionilist.add(arr[i]);
		    }
		    List<Integer> midspremisstionilists =premisstionilist.stream().map(Integer::parseInt).collect(Collectors.toList());
		    System.out.println("最终参数>>>>>>>"+midspremisstionilists);
		    
		    
			int n2 = roleService.insertPermissionGiveRole(midspremisstionilists, rId);

			if (n2 > 0) {
				map.put("success", true);
				map.put("message", "设置权限成功");
				
			} else {
				map.put("success", false);
				map.put("message", "设置权限失败");
			}
		}
		return map;

	}
	/**
	 * 查询角色权限信息,已有权限选中状态
	 * @author thx
	 * @param rId 角色编号
	 * @return 
	 */
	@RequestMapping(value="/queryNode")
	public Object queryNode(Integer rId){
		List<Integer> rids=new ArrayList<Integer>();
		rids.add(rId);
		return permissionService.queryNodeChecked(rids);
	}
	/**
	 * 多条件分页查询角色
	 * @param rQuery 条件封装的实体
	 * @author thx
	 * @return 
	 */
	//@RequestMapping(value = "/getRoles",name="多条件查询")
	@RequestMapping(value = "/getRoles")
	public Object getRoles(RoleQuery rQuery,BindingResult bindingResult){
		System.out.println("查询参数"+rQuery);
		List<Role> rows = roleService.queryRole(rQuery);
		int total = roleService.queryRoleCount(rQuery);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", total);
		map.put("rows", rows);
		return map;
	}
	/**
	 * 修改角色名称 
	 * @author thx
	 * @param role 条件封装的实体
	 * @return 受影响的行数
	 */
	@RequestMapping(value = "/updateRole", name = "角色修改")
	//@RequestMapping(value = "/updateRole")
	public Map<String, Object> updateRole(Role role) {
		Map<String, Object> map = new HashMap<String, Object>();
		//System.out.println("jjjjjjjjjjjjjjjj"+role.getrName());
		try {
			int n = roleService.updateByPrimaryKeySelective(role);
			if (n > 0) {
				map.put("success", true);
				map.put("message", "修改成功");
			} else {
				map.put("success", false);
				map.put("message", "修改失败");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			map.put("success", false);
			map.put("message", "操作失败,角色名已存在");
		}
		
		return map;

	}
	/**
	 * 添加新角色 
	 * @author thx
	 * @param role 条件封装的实体
	 * @return 受影响的行数
	 */
	@RequestMapping(value = "/insertRole", name = "角色新增")
	//@RequestMapping(value = "/insertRole")
	public Map<String, Object> insertRole(Role role) {
		Map<String, Object> map = new HashMap<String, Object>();		
		try {
			int n = roleService.insertSelective(role);
			if (n > 0) {
				map.put("success", true);
				map.put("message","新增成功");
			} else {
				map.put("success", false);
				map.put("message", "新增失败");
			}
		} catch (Exception e) {
			map.put("success", false);
			map.put("message", "操作失败,角色名已存在");
		}

		return map;
	}

	/**
	 * 根据角色编号删除角色
	 * @author thx
	 * @param rid 角色编号
	 * @return
	 */
	@RequestMapping(value="/delRole",name="角色删除")
	//@RequestMapping(value="/delRole")
	public Map<String, Object> deleteRole(int rid){
		Map<String, Object> map=new HashMap<String, Object>();
		try {
			int n=roleService.delRoleByrid(rid);
			if (n>0) {
				map.put("success", true);
				map.put("message","删除成功");
			}else {
				map.put("success", false);
				map.put("message", "删除失败");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("success", false);
			map.put("message", "该角色与用户或模块有关联，暂不能删除");
		}
		return map;
		
	}
	
	/**
	 * 给角色设置模块
	 * @param request
	 * @param rId
	 * @return
	 */
	//@RequestMapping(value="/setRoleModule",name="设置角色的模块")
	@RequestMapping(value="/setRoleModule")
	public Object setRoleModule(String moduleIds,int rId){
		System.out.println("参数>>>>>>>"+moduleIds+":"+rId);
	    Map<String, Object> map = new HashMap<String, Object>();
	   if (moduleIds==null) {
			//如果不给角色设置任何模块，只执行删除功能
			int d;
			try {
				d = roleService.delRoleModule(rId);
				if (d>0) {
					map.put("success", true);
					map.put("message", "清空成功");
				} else {
					map.put("success", false);
					map.put("message", "清空失败");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				map.put("success", false);
				map.put("message", "清空失败");
			}
			
		}else{
			
			String arr[]=moduleIds.split(",");//把String类型的数据转成数组
			
			List<String> midlist = new ArrayList<String>();
		    for (int i = 0; i < arr.length; i++) {
		    	midlist.add(arr[i]);
		    }
		    List<Integer> mids =midlist.stream().map(Integer::parseInt).collect(Collectors.toList());
		    System.out.println("最终参数>>>>>>>"+mids);
			
			//先删除
			roleService.delRoleModule(rId);
			//再添加
			int n=roleService.addRoleModule(rId,mids);
			
			if (n>0) {
				map.put("success", true);
				map.put("message", "设置成功");
			} else {
				map.put("success", false);
				map.put("message", "设置失败");
			}
		}
		return map;
	}
}

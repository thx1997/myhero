package com.hero.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.Employee;
import com.hero.entity.Role;
import com.hero.entity.query.EmployeeQuery;
import com.hero.service.EmployeeService;
import com.hero.util.PasswordEncoder;
/**
 * 员工管理控制层
 * @author thx
 *
 */
@RestController
@RequestMapping(value="/employee",name="员工管理")
public class EmployeeController {
	@Autowired
	public EmployeeService employeeService;
	
	/**
	 * 多条件分页查询员工
	 * @author thx
	 * http://localhost:8080/invoicing/employee/queryEmp?eIslockout=0&eIdcard=410
	 * @param employeeQuery 条件封装的实体对象
	 * @return 
	 */
	@RequestMapping(value="/queryEmp",name="多条件查询员工")
	public Object queryEmp(EmployeeQuery employeeQuery) {
		System.out.println("查询条件==》"+employeeQuery.toString());
		Map<String, Object> map = new HashMap<String, Object>();
		List<Employee> empList=employeeService.queryEmp(employeeQuery);
		Integer total=employeeService.queryEmpCount(employeeQuery);	
		System.out.println("查询结果==》集合："+empList+"总条数："+total);	
		map.put("total", total);
		map.put("rows", empList);
		return map;
	}
	/**
	 * 添加新员工
	 * http://localhost:8080/invoicing/employee/addEmp?eName=aa&ePwd=123
	 * @author thx
	 * @param emp 参数封装的员工实体
	 * @return
	 */
	@RequestMapping(value="/addEmp",name="添加新员工")
	public Object addEmp(Employee emp) {
		Map<String, Object> map = new HashMap<String, Object>();
		Integer n=employeeService.insertSelective(emp);
		if(n>0) {
		     map.put("success", true);
		     map.put("message", "添加成功");     
		}else {
			 map.put("success", false);
			 map.put("message", "添加失败"); 
		}
		return map;
	}
	/**
	 * 修改员工资料
	 * http://localhost:8080/invoicing/employee/updateEmp?eId=2&eName=bb&ePwd=ysd123&eDeptid=1
	 * @author thx
	 * @param emp 参数封装的员工实体
	 * @return
	 */
	@RequestMapping(value="/updateEmp",name="修改员工资料")
	public Object updateEmp(@ModelAttribute Employee emp) {
		System.out.println("修改参数==》"+emp);
		Map<String, Object> map = new HashMap<String, Object>();
		Integer n=employeeService.updateByPrimaryKeySelective(emp);
		if(n>0) {
		     map.put("success", true);
		     map.put("message", "修改成功");     
		}else {
			 map.put("success", false);
			 map.put("message", "修改失败"); 
		}
		return map;
	}
	/**
	 * 根据编号删除某个员工
	 * http://localhost:8080/invoicing/employee/delEmp?eId=1
	 * @author thx
	 * @param emp 参数封装的员工实体
	 * @return
	 */
	String rname="";
	@RequestMapping(value="/delEmp",name="根据编号某个员工")
	public Object updateEmp(int eId) {
		Map<String, Object> map = new HashMap<String, Object>();
		//先判断该员工是否拥有某些角色
		List<Role> rlist=employeeService.queryEmpHaveRole(eId);
		
		if(rlist.size()>0) {
			for (Role role : rlist) {
				rname+=role.getrName()+"、";
			}
			map.put("success", false);
			map.put("message", "该用户拥有"+rname+"角色,请先移除它们"); 
		}else {
		Integer n=employeeService.delEmpByeid(eId);
		if(n>0) {
		     map.put("success", true);
		     map.put("message", "刪除成功");     
		}else {
			 map.put("success", false);
			 map.put("message", "删除失败"); 
		}
		}
		return map;
	}
	/**
	 * 重置员工密码
	 * @param eId 员工编号
	 * @param eLoginname 员工的登录名
	 * @return
	 */
	@RequestMapping(value="/resetPwd",name="重置员工密码")
	public Object resetPwd(int eId,String eLoginname) {
		System.out.println("重置参数==》"+eId+eLoginname);
		Map<String, Object> map = new HashMap<String, Object>();
		//将用户输入的密码加密
		PasswordEncoder yanzhi=new PasswordEncoder(eLoginname,"Md5");		
		String pwd=yanzhi.encode("ysd123", 5);
		Integer n=employeeService.resetPwd(pwd, eId);
		if(n>0) {
		     map.put("success", true);
		     map.put("message", "重置成功");     
		}else {
			 map.put("success", false);
			 map.put("message", "重置失败"); 
		}
		return map;
	}
	
}

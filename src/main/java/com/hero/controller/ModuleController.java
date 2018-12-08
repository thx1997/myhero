package com.hero.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.Module;
import com.hero.entity.ModuleQer;
import com.hero.entity.Token;
import com.hero.service.ModuleService;
import com.hero.service.impl.ModuleServiceImpl;
import com.hero.util.JwtToken;
/**
 * 
 * @author xkt
 *
 */
@RestController
@RequestMapping(value="/module",name="模块管理")
public class ModuleController {

	@Autowired
	private ModuleService moduleService;
	
	private List<Module> list = new ArrayList<Module>();
//	@Autowired
//	private ModuleServiceImpl moduleService;
	/**
	 * 查询角色所拥有的模块,加载左侧菜单树(rfy)
	 * @param request
	 * @return 
	 * @throws Exception
	 */
	@RequestMapping("/queryByRid")
	public Object queryModuleTreeByRid(@RequestParam("rids[]")String[] rids){
		System.out.println("参数>>>>>>>"+rids);
		List<String> ridlist = new ArrayList<String>();
	    for (int i = 0; i < rids.length; i++) {
	    	ridlist.add(rids[i]);
	    }
	    
	    List<Integer> ridslist =ridlist.stream().map(Integer::parseInt).collect(Collectors.toList());
		List<Module> mList=moduleService.queryModuleTreeByRid(ridslist);
		System.out.println("mList==>"+mList);
		return mList;
	}
	/**
	 * localhost:8080/invoicing/module/selall?rownumbers=1 &modulename=员工
	 * 
	 * @return
	 */
	@RequestMapping("selall")
	public Object selall(ModuleQer moduleQer,Integer rownumbers) {
		list.clear();
		moduleQer.setIndexpage(rownumbers);
		moduleQer.setRows(10);
		Map<String, Object> map = new HashMap<String, Object>();
		List<Module> list = new ArrayList<Module>();
		List<Module> list1 = new ArrayList<Module>();
		// ModuleListAdd mdao = new ModuleListAdd();
		// ConcurrentHashMap list2 = new ConcurrentHashMap<>();
		list = moduleService.selModulByPage(moduleQer);
		int count = moduleService.selModulCountByPage(moduleQer);
//		System.out.println(list.size()+"查到的模块"+list);
		// 遍历查询父节点
		for (Module module : list) {
			if (module.getmParentid() != 0) {
				list1 = this.selparent(module); // this.selparent(module);
			}
		}
//		System.out.println(list1.size()+"所有父模块"+list1);
		for (Module module : list1) {
			if (!list.contains(module)) {
				list.add(module);
			}
		}
		map.put("total", list.size());
		map.put("rows", list);
		map.put("count", count);
		return map;
	}

	/**
	 * localhost:8080/invoicing/module/selparent?mParentid=2 遍历查询父节点
	 * 
	 * @param module
	 */
	
	public List<Module> selparent(Module module) {
//		List<Module> list = new ArrayList<Module>();
		int mid = module.getmParentid();
//		System.out.println("---------"+module);
		if (mid != 0) {
			Module modules = moduleService.selectByPrimaryKey(mid);
			if(!list.contains(modules)) {
				list.add(modules);
			}
			this.selparent(modules);
		}
		return list;
	}

	/**
	 * localhost:8080/invoicing/module/delModulById?mid=1
	 * 
	 * @param mid
	 * @return
	 */
	@RequestMapping("delModulById")
	public Object delModulById(int mid) {
		Map<String, Object> map = new HashMap<String, Object>();
		int i = moduleService.selmodul(mid);
		if (i > 0) {
			map.put("success", false);
			map.put("message", "该模块已被占用，无法删除");
		} else {
			if (this.sel(mid)) {
				int y = moduleService.deleteByPrimaryKey(mid);
				if (y > 0) {
					map.put("success", true);
					map.put("message", "删除成功");
				} else {
					map.put("success", false);
					map.put("message", "删除时出错");
				}
			} else {
				map.put("success", false);
				map.put("message", "删除子模块时出错");
			}

		}
		return map;
	}

	/**
	 * 遍历查询子模块
	 * 
	 * @param module
	 */
	public boolean sel(int mid) {
		// List<Module> list = null;
		List<Module> list = moduleService.selmodulByParentid(mid);
		System.out.println("该模块下的子模块" + list);
		if (list != null) {
			for (Module module : list) {
				int i = module.getmId();
				int y = moduleService.deleteByPrimaryKey(i);
				if (y < 0) {
					return false;
				}
				this.sel(i);
			}
		}
		return true;

	}

	/**
	 * localhost:8080/invoicing/module/insertModul?mName=123&mParentid=0
	 * 
	 * @param mid
	 * @return
	 */
	@RequestMapping("insertModul")
	public Object insertModul(Module module) {
		Map<String, Object> map = new HashMap<String, Object>();
		// SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		// System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		module.setmCreatetime(new Date());
		int i = moduleService.selModuleByParentAndName(module);
		if (i > 0) {
			map.put("success", false);
			map.put("message", "父模块下已有同名称模块，无法添加");
		} else {
			int y = moduleService.insertSelective(module);
			if (y > 0) {
				map.put("success", true);
				map.put("message", "添加成功");
			} else {
				map.put("success", false);
				map.put("message", "添加时出错");
			}
		}
		return map;
	}

	/**
	 * localhost:8080/invoicing/module/updateModul?mId=4&mName=123&mParentid=0
	 * 
	 * @param mid
	 * @return
	 */
	@RequestMapping("updateModul")
	public Object updateModul(Module module) {
		Map<String, Object> map = new HashMap<String, Object>();
		// SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		// System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		module.setmUpdatetime(new Date());
		int i = moduleService.selModuleByParentAndName(module);
		if (i > 0) {
			map.put("success", false);
			map.put("message", "父模块下已有同名称模块，无法修改");
		} else {
			int y = moduleService.updateByPrimaryKeySelective(module);
			if (y > 0) {
				map.put("success", true);
				map.put("message", "修改成功");
			} else {
				map.put("success", false);
				map.put("message", "修改时出错");
			}
		}
		return map;
	}
	
	/**
	 * 给角色设置模块时，查询模块信息，角色已拥有模块选中
	 * @author thx
	 * @param rId 角色编号
	 * @return
	 */
	@RequestMapping(value="/queryCheckedByRid",name="设置角色模块")
	@ResponseBody
	public Object queryModuleChecked(@RequestParam(value="rId",required=true)List<Integer> rId){
		return moduleService.queryModuleChecked(rId);		
	}
}

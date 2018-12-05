package com.hero.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
import com.hero.entity.Token;
import com.hero.service.ModuleService;
import com.hero.util.JwtToken;

@RestController
@RequestMapping(value="/module",name="模块管理")
public class ModuleController {

	@Autowired
	private ModuleService moduleService;
	
	
	
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
}

package com.hero.service;

import java.util.List;

import com.hero.entity.Module;

public interface ModuleService {
	 //根据父id和角色id查询角色拥有的模块信息(rfy)
    public List<Module> queryModuleByPidRid(int pid,List<Integer> rids);
    //查询左侧菜单树(rfy)
    public List<Module> queryModuleTreeByRid(List<Integer> rids);
}

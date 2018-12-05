package com.hero.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hero.entity.Module;

public interface ModuleMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(Module record);

    int insertSelective(Module record);

    Module selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Module record);

    int updateByPrimaryKey(Module record);
    
    //根据父id和角色id查询角色拥有的模块信息(rfy)
    public List<Module> queryModuleByPidRid(@Param("pid") int pid,@Param("rids") List<Integer> rids);
}
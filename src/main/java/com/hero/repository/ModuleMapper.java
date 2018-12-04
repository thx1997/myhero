package com.hero.repository;

import com.hero.entity.Module;

public interface ModuleMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(Module record);

    int insertSelective(Module record);

    Module selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Module record);

    int updateByPrimaryKey(Module record);
}
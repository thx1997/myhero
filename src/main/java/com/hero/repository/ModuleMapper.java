package com.hero.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hero.entity.Module;
import com.hero.entity.ModuleQer;

public interface ModuleMapper {
	
	
	//删除
    int deleteByPrimaryKey(Integer mId);
    //查询该模块能否删除
    int selmodul(Integer mId);
    //根据parentid查询模块(rfy&thx)
    List<Module> selmodulByParentid(Integer mId);
    /**
     * 根据角色编号查询出所拥有的模块编号
     * @author thx
     * @param rid 角色编号集合
     * @return 模块编号集合
     */
  	public List<Integer> selectMidByRid(@Param("list")List<Integer> rid);
    //添加
    int insertSelective(Module record);
    //根据id查询
    Module selectByPrimaryKey(Integer mId);
    //修改
    int updateByPrimaryKeySelective(Module record);
    
    Module selParentById(Integer mid);
    //多条件分页
    List<Module> selModulByPage(ModuleQer moduleQer);
    //多条件分页总记录数
    int selModulCountByPage(ModuleQer moduleQer);
    //查询相同父id下名称是否重复
    int selModuleByParentAndName(Module module);
    //根据父id和角色id查询角色拥有的模块信息(rfy)
    public List<Module> queryModuleByPidRid(@Param("pid") int pid,@Param("rids") List<Integer> rids);
}
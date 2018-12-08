package com.hero.service;

import java.util.List;

import com.hero.entity.Module;
import com.hero.entity.ModuleQer;

public interface ModuleService {
	
	/**
	 * 给角色设置模块，已拥有角色处选中状态
	 * @author thx
	 * @param rid 角色编号
	 * @return
	 */
	public 	List<Module> queryModuleChecked(List<Integer> rid);
	
	/**
	 * 根据父ID查询出所有孩子
	 * @author thx
	 * @param parentId
	 * @return
	 */
	public List<Module> queryChildrenById(Integer parentId);
	/**
	 * 根据角色编号查询出所拥有的模块编号
	 * @author thx
	 * @param rid 角色编号集合
	 * @return 模块编号集合
	 */
	public List<Integer> selectMidByRid(List<Integer> rid);
	
	// 根据父id和角色id查询角色拥有的模块信息(rfy)
	public List<Module> queryModuleByPidRid(int pid, List<Integer> rids);
	// 查询左侧菜单树(rfy)
	public List<Module> queryModuleTreeByRid(List<Integer> rids);

	int deleteByPrimaryKey(Integer mId);

	int selmodul(Integer mId);

	List<Module> selmodulByParentid(Integer mId);

	int insertSelective(Module record);

	Module selectByPrimaryKey(Integer mId);

	int updateByPrimaryKeySelective(Module record);

	Module selParentById(Integer mid);

	List<Module> selModulByPage(ModuleQer moduleQer);
	//多条件分页总记录数
    int selModulCountByPage(ModuleQer moduleQer);

	int selModuleByParentAndName(Module module);
}

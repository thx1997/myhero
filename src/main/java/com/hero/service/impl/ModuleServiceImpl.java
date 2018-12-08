package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.Module;
import com.hero.entity.ModuleQer;
import com.hero.repository.ModuleMapper;
import com.hero.service.ModuleService;
@Service
public class ModuleServiceImpl implements ModuleService {

	@Autowired
	private ModuleMapper moduleMapper;
	//<<<<<<<<<<<<<<<左侧菜单树(rfy)>>>>>>>>>>>>>>>>>>>>>
		@Override//(rfy)
		public List<Module> queryModuleByPidRid(int pid,List<Integer> rids) {
			
			return moduleMapper.queryModuleByPidRid(pid, rids);
		}

		@Override//(rfy)
		public List<Module> queryModuleTreeByRid(List<Integer> rids) {
			//查询出所有根菜单
			List<Module> rootList = this.queryModuleByPidRid(0, rids);
			//递归设置子菜单
			this.setChildrenTree(rootList,rids);
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^最终得到的菜单列表=>"+rootList);
			return rootList;
		}
		//(rfy)
		private void setChildrenTree(List<Module> parentList,List<Integer> rids){
			for(Module m:parentList){
				//mids.contains(m.getmid);
				//查询出子菜单
				List<Module> childrenList = this.queryModuleByPidRid(m.getmId(),rids);
				System.out.println("*****************************************************设置子菜单=>"+m.getmName());
				//如果没有子菜单则递归结束
				if( childrenList !=null && !childrenList.isEmpty() ){//有子菜单
					//设置子菜单
					System.out.println("设置的子菜单是=>"+childrenList);
					m.setChildren(childrenList);
					//如果有子菜单则继续递归设置子菜单
					this.setChildrenTree(childrenList,rids);
				}
			}
		}
		@Override
		public int deleteByPrimaryKey(Integer mId) {
			// TODO Auto-generated method stub
			return moduleMapper.deleteByPrimaryKey(mId);
		}

		@Override
		public int insertSelective(Module record) {
			// TODO Auto-generated method stub
			return moduleMapper.insertSelective(record);
		}

		@Override
		public Module selectByPrimaryKey(Integer mId) {
			// TODO Auto-generated method stub
			return moduleMapper.selectByPrimaryKey(mId);
		}

		@Override
		public int updateByPrimaryKeySelective(Module record) {
			// TODO Auto-generated method stub
			return moduleMapper.updateByPrimaryKeySelective(record);
		}

		@Override
		public Module selParentById(Integer mid) {
			// TODO Auto-generated method stub
			return moduleMapper.selParentById(mid);
		}

		@Override
		public List<Module> selModulByPage(ModuleQer moduleQer) {
			// TODO Auto-generated method stub
			return moduleMapper.selModulByPage(moduleQer);
		}

		@Override
		public int selmodul(Integer mId) {
			// TODO Auto-generated method stub
			return moduleMapper.selmodul(mId);
		}

		@Override
		public List<Module> selmodulByParentid(Integer mId) {
			// TODO Auto-generated method stub
			return moduleMapper.selmodulByParentid(mId);
		}

		@Override
		public int selModuleByParentAndName(Module module) {
			// TODO Auto-generated method stub
			return moduleMapper.selModuleByParentAndName(module);
		}

		@Override
		public int selModulCountByPage(ModuleQer moduleQer) {
			// TODO Auto-generated method stub
			return moduleMapper.selModulCountByPage(moduleQer);
		}

		@Override//thx
		public List<Module> queryModuleChecked(List<Integer> rid) {
			//查询出所有根菜单
			List<Module> rootList = moduleMapper.selmodulByParentid(0);
			//查询出角色已拥有的模块的编号
			List<Integer> midList=moduleMapper.selectMidByRid(rid);
			//递归设置子菜单
			this.setChildrensChecked(rootList,midList);
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^最终得到的菜单列表=>"+rootList);
			return rootList;
			
		}
		/**
		 * 给菜单模块 设置孩子
		 * @author thx
		 * @param parentList 目标模块集合
		 */
		private void setChildrensChecked(List<Module> parentList,List<Integer> mList){
			for(Module m:parentList){
				//查询出子菜单
				List<Module> childrenList = this.queryChildrenById(m.getmId());
				System.out.println("*****************************************************设置子菜单=>"+m.getmName());
				//如果没有子菜单则递归结束
				if( childrenList !=null && !childrenList.isEmpty() ){//有子菜单
					
					//设置子菜单
					System.out.println("设置的子菜单是=>"+childrenList);
					m.setChildren(childrenList);
					//如果有子菜单则继续递归设置子菜单
					this.setChildrensChecked(childrenList,mList);
				}else{
					if (mList.contains(m.getmId())) {
						m.setChecked(true);
					} 
				}
			}
		}
		//查询角色已拥有的模块的编号
		@Override
		public List<Integer> selectMidByRid(List<Integer> rid) {
			return moduleMapper.selectMidByRid(rid);
		}
		@Override//thx(根据父ID查询出所有孩子)
		public List<Module> queryChildrenById(Integer parentId) {
			return moduleMapper.selmodulByParentid(parentId);
		}
}

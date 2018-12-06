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
}

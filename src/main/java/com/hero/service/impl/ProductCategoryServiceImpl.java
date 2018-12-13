package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.Module;
import com.hero.entity.ProductCategory;
import com.hero.repository.ProductCategoryMapper;
import com.hero.service.ProductCategoryService;
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

	@Autowired
	private ProductCategoryMapper productCategoryMapper;
	

	@Override//(rfy)
	public List<Integer> selectPcidBySid(Integer sid) {
		// TODO Auto-generated method stub
		return productCategoryMapper.selectPcidBySid(sid);
	}

	@Override//(rfy)
	public List<ProductCategory> queryChildrenById(Integer parentId) {
		// TODO Auto-generated method stub
		return productCategoryMapper.queryChildrenById(parentId);
	}
	
	
	/*****************************给供应商设置商品分类，已拥有为选中状态**********************************/
	@Override//(rfy)
	public List<ProductCategory> queryProCateChecked(Integer sid) {
		//查询出所有根菜单
		List<ProductCategory> rootList = this.queryChildrenById(0);
		//查询出供应商已拥有的商品分类的编号
		List<Integer> midList=this.selectPcidBySid(sid);
		//递归设置子菜单
		this.setChildrensChecked(rootList,midList);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^最终得到的菜单列表=>"+rootList);
		return rootList;
	}

	/**
	 * 给商品类别 设置孩子
	 * @param parentList
	 */
	private void setChildrensChecked(List<ProductCategory> parentList,List<Integer> sList){
		for(ProductCategory m:parentList){
			//查询出子菜单
			List<ProductCategory> childrenList = this.queryChildrenById(m.getPcId());
			System.out.println("*****************************************************设置子菜单=>"+m.getPcName());
			//如果没有子菜单则递归结束
			if( childrenList !=null && !childrenList.isEmpty() ){//有子菜单
				
				//设置子菜单
				System.out.println("设置的子菜单是=>"+childrenList);
				m.setChildren(childrenList);
				//如果有子菜单则继续递归设置子菜单
				this.setChildrensChecked(childrenList,sList);
			}else{
				if (sList.contains(m.getPcId())) {
					m.setChecked(true);
				} 
			}
		}
	}

	
	/*********************************树形显示所有商品类别*****************************************/
	@Override//(rfy)
	public List<ProductCategory> queryAllProCate() {
		//查询出所有根菜单
		List<ProductCategory> rootList = this.queryChildrenById(0);
		//递归设置子菜单
		this.setChildren(rootList);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^最终得到的菜单列表=>"+rootList);
		return rootList;
	}
	//(rfy)
	private void setChildren(List<ProductCategory> parentList){
		for(ProductCategory p:parentList){
			//mids.contains(m.getmid);
			//查询出子菜单
			List<ProductCategory> childrenList = this.queryChildrenById(p.getPcId());
			System.out.println("*****************************************************设置子菜单=>"+p.getPcName());
			//如果没有子菜单则递归结束
			if( childrenList !=null && !childrenList.isEmpty() ){//有子菜单
				//设置子菜单
				System.out.println("设置的子菜单是=>"+childrenList);
				p.setChildren(childrenList);
				//如果有子菜单则继续递归设置子菜单
				this.setChildren(childrenList);
			}
		}
	}

	@Override//(rfy)
	public int insertSelective(ProductCategory record) {
		// TODO Auto-generated method stub
		return productCategoryMapper.insertSelective(record);
	}

	@Override//(rfy)
	public int isExitByPcnameAndPid(String pcname, Integer pid) {
		// TODO Auto-generated method stub
		return productCategoryMapper.isExitByPcnameAndPid(pcname, pid);
	}

	@Override//(rfy)
	public ProductCategory selectByPrimaryKey(Integer pcId) {
		// TODO Auto-generated method stub
		return productCategoryMapper.selectByPrimaryKey(pcId);
	}

	@Override//(rfy)
	public int updateByPrimaryKeySelective(ProductCategory record) {
		// TODO Auto-generated method stub
		return productCategoryMapper.updateByPrimaryKeySelective(record);
	}

	@Override//(rfy)
	public int deleteByPrimaryKey(Integer pcId) {
		// TODO Auto-generated method stub
		return productCategoryMapper.deleteByPrimaryKey(pcId);
	}

	@Override//(rfy)
	public int isExitProById(Integer pcId) {
		// TODO Auto-generated method stub
		return productCategoryMapper.isExitProById(pcId);
	}

	@Override//(rfy)
	public List<Integer> getChildrenIdByPid(Integer pid) {
		// TODO Auto-generated method stub
		return productCategoryMapper.getChildrenIdByPid(pid);
	}

	@Override//(rfy)
	public int delProCate(Integer pcId) {
		int n=0;
		 int e=this.isExitProById(pcId);//判断是否存在角色关联
			if (e>0) {
				System.out.println("当前类别被引用");
			} else {
				System.out.println("当前类mei别被引用");
				//根据模块id查询子模块
				List<ProductCategory> childList=this.queryChildrenById(pcId);
				System.out.println("孩子>>>>>"+childList);
				if (childList!=null && !childList.isEmpty()) {
					n=this.delChildrens(childList);	
					//再次判断当前类别有无子类别
					List<ProductCategory> childList1=this.queryChildrenById(pcId);
					if(childList1==null ||childList1.isEmpty()) {
						System.out.println("hhhhhhhhhhhhhhhhhhhhhh");
						n=this.deleteByPrimaryKey(pcId);//直接删除
					}
				}else {
					System.out.println("无关联无孩子");
					n=this.deleteByPrimaryKey(pcId);//直接删除
				}		
			}
		
			return n;
	}
	private int delChildrens(List<ProductCategory> parentList){
		int n=0;
		for(ProductCategory m:parentList){
			
			//查询出子菜单
			List<ProductCategory> childrenList = this.queryChildrenById(m.getPcId());
//			System.out.println("*****************************************************设置子菜单=>"+m.getModuleName());
			//如果没有子菜单则递归结束
			if( childrenList !=null && !childrenList.isEmpty() ){//有子菜单
				int e=this.isExitProById(m.getPcId());//判断是否存在角色关联
				if (e>0) {
					System.out.println("子zi类被引用");
				} else {
					System.out.println("子zi类mei被引用");
					n=this.deleteByPrimaryKey(m.getPcId());//直接删除
					//this.delChildrens(childrenList);
				}
				this.delChildrens(childrenList);
			}else {
				int e=this.isExitProById(m.getPcId());//判断是否存在角色关联
				if (e>0) {
					System.out.println("子类被引用");
				} else {
					System.out.println("子类mei被引用");
					try {
						n=this.deleteByPrimaryKey(m.getPcId());//直接删除
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						this.delSuProCateByPCid(m.getPcId());
						n=this.deleteByPrimaryKey(m.getPcId());//再删除
					}
					
					//this.delChildrens(childrenList);
				}
			}
			
		}
		return n;
	}

	@Override//(rfy)
	public int delSuProCateByPCid(Integer pcid) {
		// TODO Auto-generated method stub
		return productCategoryMapper.delSuProCateByPCid(pcid);
	}
	

}

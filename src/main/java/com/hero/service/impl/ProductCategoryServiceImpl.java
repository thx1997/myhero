package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	
	

}

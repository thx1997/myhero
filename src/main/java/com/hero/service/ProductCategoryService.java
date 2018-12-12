package com.hero.service;

import java.util.List;

import com.hero.entity.ProductCategory;

public interface ProductCategoryService {
	//给供应商设置供货的商品分类，已拥有分类选中状态
  	public 	List<ProductCategory> queryProCateChecked(Integer sid);
  	//根据供应商编号查询出所拥有的商品分类编号
  	public List<Integer> selectPcidBySid(Integer sid);
    //查询出父模块对应的子模块(rfy)
  	public List<ProductCategory> queryChildrenById(Integer parentId);
  	//查询所有商品类别(rfy)
  	public List<ProductCategory> queryAllProCate();
}

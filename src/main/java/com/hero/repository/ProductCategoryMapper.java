package com.hero.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hero.entity.ProductCategory;

public interface ProductCategoryMapper {
    int deleteByPrimaryKey(Integer pcId);

    int insert(ProductCategory record);

    int insertSelective(ProductCategory record);

    ProductCategory selectByPrimaryKey(Integer pcId);

    int updateByPrimaryKeySelective(ProductCategory record);

    int updateByPrimaryKey(ProductCategory record);
    //查询出父模块对应的子模块(rfy)
  	public List<ProductCategory> queryChildrenById(Integer parentId);
    //根据供应商编号查询出所拥有的商品分类编号(rfy)
  	public List<Integer> selectPcidBySid(Integer sid);
}
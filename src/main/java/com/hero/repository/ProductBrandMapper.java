package com.hero.repository;

import java.util.List;

import com.hero.entity.ProductBrand;

public interface ProductBrandMapper {
    int deleteByPrimaryKey(Integer pbId);

    int insert(ProductBrand record);

    int insertSelective(ProductBrand record);

    ProductBrand selectByPrimaryKey(Integer pbId);

    int updateByPrimaryKeySelective(ProductBrand record);

    int updateByPrimaryKey(ProductBrand record);
    //查询所有品牌(rfy)
    public List<ProductBrand> queryAll();
}
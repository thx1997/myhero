package com.hero.repository;

import java.util.List;

import com.hero.entity.ProductBrand;

public interface ProductBrandMapper {
	//删除品牌(rfy)
    int deleteByPrimaryKey(Integer pbId);

    int insert(ProductBrand record);
    //添加品牌(rfy)
    int insertSelective(ProductBrand record);
    //根据id查询品牌(rfy)
    ProductBrand selectByPrimaryKey(Integer pbId);
    //修改品牌(rfy)
    int updateByPrimaryKeySelective(ProductBrand record);

    int updateByPrimaryKey(ProductBrand record);
    //查询所有品牌(rfy)
    public List<ProductBrand> queryAll();
    
    //多条件分页查询(rfy)
    public List<ProductBrand> queryALLPage(ProductBrand record);
    //查询总条数(rfy)
    public int queryCountPage(ProductBrand record);
    //根据名称判断是否存在(rfy)
    public int isExitByName(String pbname);
    
}
package com.hero.repository;

import java.util.List;

import com.hero.entity.SupplierOrCustomerCategory;

public interface SupplierOrCustomerCategoryMapper {
    int deleteByPrimaryKey(Integer scId);

    int insert(SupplierOrCustomerCategory record);

    int insertSelective(SupplierOrCustomerCategory record);

    SupplierOrCustomerCategory selectByPrimaryKey(Integer scId);

    int updateByPrimaryKeySelective(SupplierOrCustomerCategory record);

    int updateByPrimaryKey(SupplierOrCustomerCategory record);
    //根据stype查询所有类别信息(rfy)
    public List<SupplierOrCustomerCategory> selectAllCate(Integer stype);
}
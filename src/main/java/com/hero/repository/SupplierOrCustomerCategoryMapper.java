package com.hero.repository;

import com.hero.entity.SupplierOrCustomerCategory;

public interface SupplierOrCustomerCategoryMapper {
    int deleteByPrimaryKey(Integer scId);

    int insert(SupplierOrCustomerCategory record);

    int insertSelective(SupplierOrCustomerCategory record);

    SupplierOrCustomerCategory selectByPrimaryKey(Integer scId);

    int updateByPrimaryKeySelective(SupplierOrCustomerCategory record);

    int updateByPrimaryKey(SupplierOrCustomerCategory record);
}
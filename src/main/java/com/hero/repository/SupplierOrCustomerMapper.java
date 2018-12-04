package com.hero.repository;

import com.hero.entity.SupplierOrCustomer;

public interface SupplierOrCustomerMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(SupplierOrCustomer record);

    int insertSelective(SupplierOrCustomer record);

    SupplierOrCustomer selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(SupplierOrCustomer record);

    int updateByPrimaryKey(SupplierOrCustomer record);
}
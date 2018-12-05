package com.hero.repository;

import java.util.List;

import com.hero.entity.SupplierOrCustomer;
import com.hero.entity.query.SupplierOrCustomerQuery;

public interface SupplierOrCustomerMapper {
    int deleteByPrimaryKey(Integer sId);
    
    int insert(SupplierOrCustomer record);
    //添加（rfy）
    int insertSelective(SupplierOrCustomer record);

    SupplierOrCustomer selectByPrimaryKey(Integer sId);
    //修改（rfy）
    int updateByPrimaryKeySelective(SupplierOrCustomer record);

    int updateByPrimaryKey(SupplierOrCustomer record);
    
    //多条件分页查询供应商客户信息(rfy)
    public List<SupplierOrCustomer> selectAllByCount(SupplierOrCustomerQuery scquery);
    //查询分页总记录数(rfy)
    public int selectCount(SupplierOrCustomerQuery scquery);
    //软删（rfy）
    public int updexit(Integer sId);
    
}
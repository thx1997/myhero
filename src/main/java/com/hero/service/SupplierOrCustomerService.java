package com.hero.service;

import java.util.List;

import com.hero.entity.SupplierOrCustomer;
import com.hero.entity.query.SupplierOrCustomerQuery;

public interface SupplierOrCustomerService {
	//多条件分页查询供应商客户信息(rfy)
    public List<SupplierOrCustomer> selectAllByCount(SupplierOrCustomerQuery scquery);
    //查询分页总记录数(rfy)
    public int selectCount(SupplierOrCustomerQuery scquery);
}

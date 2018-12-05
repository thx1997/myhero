package com.hero.service;

import java.util.List;

import com.hero.entity.SupplierOrCustomerCategory;

public interface SupplierOrCustomerCategoryService {
	//根据stype查询所有类别信息(rfy)
    public List<SupplierOrCustomerCategory> selectAllCate(Integer stype);
}

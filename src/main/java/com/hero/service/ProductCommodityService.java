package com.hero.service;

import java.util.List;

import com.hero.entity.ProductCommodity;
import com.hero.entity.query.ProductCommodityQuery;

public interface ProductCommodityService {
	//多条件分页查询(rfy)
	public List<ProductCommodity> queryAllByQuery(ProductCommodityQuery pcquery);
	//总条数(rfy)
	public int queryCountByQuery(ProductCommodityQuery pcquery);
}

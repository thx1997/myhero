package com.hero.repository;

import java.util.List;

import com.hero.entity.PurchaseDetailSpec;
import com.hero.entity.query.PurchaseDetailSpecQuery;

public interface PurchaseDetailSpecMapper {
	//根据采购单号分页查询采购详情(rfy)
    public List<PurchaseDetailSpec> queryByPurQuery(PurchaseDetailSpecQuery query);
	//查询总条数(rfy)
    public int queryCountByPurQuery(PurchaseDetailSpecQuery query);
	
}
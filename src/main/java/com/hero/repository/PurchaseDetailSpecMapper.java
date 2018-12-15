package com.hero.repository;

import java.util.List;

import com.hero.entity.PurchaseDetailSpec;

public interface PurchaseDetailSpecMapper {
	//根据采购单号查询采购详情(rfy)
    public List<PurchaseDetailSpec> queryByPurId(String pnid);
	
	
}
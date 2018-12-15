package com.hero.repository;

import com.hero.entity.PurchaseNote;

public interface PurchaseNoteMapper {
	//删除采购单(rfy)
    int deleteByPrimaryKey(String pnId);

    int insert(PurchaseNote record);
    //新增订单(rfy)
    int insertSelective(PurchaseNote record);

    PurchaseNote selectByPrimaryKey(String pnId);

    int updateByPrimaryKeySelective(PurchaseNote record);

    int updateByPrimaryKey(PurchaseNote record);
}
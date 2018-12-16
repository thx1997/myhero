package com.hero.repository;

import com.hero.entity.PurchaseNote;

public interface PurchaseNoteMapper {
	//删除采购单(rfy)
    int deleteByPrimaryKey(String pnId);

    int insert(PurchaseNote record);
    //新增订单(rfy)
    int insertSelective(PurchaseNote record);

    PurchaseNote selectByPrimaryKey(String pnId);
    //修改采购单(rfy)
    int updateByPrimaryKeySelective(PurchaseNote record);
    //修改总金额(rfy)
    int updateTotalMoney(String pnid);
    
    int updateByPrimaryKey(PurchaseNote record);
}
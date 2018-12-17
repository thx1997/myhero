package com.hero.service;

import com.hero.entity.PurchaseNote;

public interface PurchaseNoteService {
	//新增订单(rfy)
    int insertSelective(PurchaseNote record);
    //删除采购单(rfy)
    int deleteByPrimaryKey(String pnId);
    //修改采购单(rfy)
    int updateByPrimaryKeySelective(PurchaseNote record);
    //修改总金额(rfy)
    int updateTotalMoney(String pnid);
}

package com.hero.service;

import com.hero.entity.DeliveryNote;

public interface DeliveryNoteService {
	//新增订单(rfy)
    int insertSelective(DeliveryNote record);
    //删除(rfy)
    int deleteByPrimaryKey(String dnId);
    //修改销售单(rfy)
    int updateByPrimaryKeySelective(DeliveryNote record);
    //修改总金额(rfy)
    int updateTotalMoney(String dnid);
}

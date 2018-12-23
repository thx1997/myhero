package com.hero.repository;

import com.hero.entity.DeliveryNote;

public interface DeliveryNoteMapper {
	//删除(rfy)
    int deleteByPrimaryKey(String dnId);

    int insert(DeliveryNote record);
    //新增订单(rfy)
    int insertSelective(DeliveryNote record);

    DeliveryNote selectByPrimaryKey(String dnId);
    //修改销售单(rfy)
    int updateByPrimaryKeySelective(DeliveryNote record);
    //修改总金额(rfy)
    int updateTotalMoney(String dnid);
    
    int updateByPrimaryKey(DeliveryNote record);
}
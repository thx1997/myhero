package com.hero.repository;

import java.util.List;

import com.hero.entity.DeliveryDetailSpec;
import com.hero.entity.query.DeliveryDetailSpecQuery;

public interface DeliveryDetailSpecMapper {
    int insert(DeliveryDetailSpec record);

    int insertSelective(DeliveryDetailSpec record);
    //多条件分页查询(rfy)
    public List<DeliveryDetailSpec> queryAllByPage(DeliveryDetailSpecQuery query);
    //查询总条数(rfy)
    public int queryCount(DeliveryDetailSpecQuery query);
    
}
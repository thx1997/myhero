package com.hero.service;

import java.util.List;

import com.hero.entity.DeliveryDetailSpec;
import com.hero.entity.query.DeliveryDetailSpecQuery;

public interface DeliveryDetailSpecService {
	//多条件分页查询(rfy)
    public List<DeliveryDetailSpec> queryAllByPage(DeliveryDetailSpecQuery query);
    //查询总条数(rfy)
    public int queryCount(DeliveryDetailSpecQuery query);
}

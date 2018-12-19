package com.hero.service;

import java.util.List;

import com.hero.entity.PurchasenoteDetail;

public interface PurchasenoteDetailService {
	//多条件分页查询(rfy)
    public List<PurchasenoteDetail> queryByQueryPage(PurchasenoteDetail query);
    //查询总条数
    public int queryCountByQuery(PurchasenoteDetail query);
}

package com.hero.service;

import java.util.List;

import com.hero.entity.PurchasenoteDetail;
import com.hero.entity.query.PurchasenoteDetailQuery;

public interface PurchasenoteDetailService {
	//多条件分页查询(rfy)
    public List<PurchasenoteDetail> queryByQueryPage(PurchasenoteDetail query);
    //查询总条数
    public int queryCountByQuery(PurchasenoteDetail query);
    
  //多条件分页查询(rfy)
    public List<PurchasenoteDetail> queryByPage(PurchasenoteDetailQuery query);
    //查询总条数
    public int queryCountByPage(PurchasenoteDetailQuery query);
}

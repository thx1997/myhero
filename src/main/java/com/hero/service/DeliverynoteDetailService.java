package com.hero.service;

import java.util.List;

import com.hero.entity.DeliverynoteDetail;

public interface DeliverynoteDetailService {
	//多条件分页查询(rfy)
    public List<DeliverynoteDetail> queryByQueryPage(DeliverynoteDetail query);
    //查询总条数
    public int queryCountByQuery(DeliverynoteDetail query);
}

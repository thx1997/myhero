package com.hero.service;

import java.util.List;

import com.hero.entity.HouseDetailPro;
import com.hero.entity.query.HouseDetailProQuery;

public interface HouseDetailProService {
	//多条件分页查询(rfy)
    public List<HouseDetailPro> queryPage(HouseDetailProQuery query);
    //查询总条数(rfy)
    public int queryCountPage(HouseDetailProQuery query);
}

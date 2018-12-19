package com.hero.repository;

import java.util.List;

import com.hero.entity.HousePronum;

public interface HousePronumMapper {
    int insert(HousePronum record);

    int insertSelective(HousePronum record);
    
    //分页查询(rfy)
    List<HousePronum> queryPage(HousePronum record);
    //查询总条数(rfy)
    int queryCountPage(HousePronum record);
    
    
}
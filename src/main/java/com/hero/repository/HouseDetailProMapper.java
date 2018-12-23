package com.hero.repository;

import com.hero.entity.HouseDetailPro;

public interface HouseDetailProMapper {
    int insert(HouseDetailPro record);

    int insertSelective(HouseDetailPro record);
}
package com.hero.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hero.entity.StatisticsPurchasePro;
import com.hero.entity.StatisticsSupplierPro;

public interface StatisticsPurchaseProMapper {
    int insert(StatisticsPurchasePro record);

    int insertSelective(StatisticsPurchasePro record);
    //根据年份和月份查询商品采购数量(rfy)
    List<StatisticsPurchasePro> queryByYearAndMonth(@Param("year")int y,@Param("month")int m);


    //根据年份和月份查询供应商供应的商品占比(rfy)
    List<StatisticsSupplierPro> supplierQueryByYearAndMonth(@Param("year")int y,@Param("month")int m);
    
    
    
}
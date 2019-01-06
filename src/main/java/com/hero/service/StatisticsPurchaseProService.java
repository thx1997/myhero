package com.hero.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hero.entity.StatisticsPurchasePro;
import com.hero.entity.StatisticsSupplierPro;

public interface StatisticsPurchaseProService {
	//根据年份和月份查询商品采购数量(rfy)
    List<StatisticsPurchasePro> queryByYearAndMonth(int y,int m);
    //根据年份和月份查询供应商供应的商品占比(rfy)
    List<StatisticsSupplierPro> supplierQueryByYearAndMonth(int y,int m);
    //根据年份和月份查询商品销售数量(rfy)
    List<StatisticsPurchasePro> queryDeliveryByYearAndMonth(int y,int m);

    //根据年份和月份查询客户拿货的商品占比(rfy)
    List<StatisticsSupplierPro> customerQueryByYearAndMonth(int y,int m);
    
}

package com.hero.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hero.entity.DeliveryDetail;

public interface DeliveryDetailService {
	//添加销售详情(rfy)
    int insertSelective(DeliveryDetail record);
    //根据销售单号和商品编号查询详情(rfy)
    DeliveryDetail selectByDnIdAndPid(String dnid,Integer pid);
    //修改销售详情(rfy)
    int updateByPrimaryKeySelective(DeliveryDetail record);
    //根据销售单号删除销售详情(rfy)
    int deleteByDnid(String dnid);
    //批量删除销售信息(rfy)
    int deleteByDdIdList(@Param("list")List<Integer> ddid);
    //根据销售单号判断是否存在详情(rfy)
    int isHaveByDnid(String dnid);
}

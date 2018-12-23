package com.hero.repository;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hero.entity.DeliveryDetail;

public interface DeliveryDetailMapper {
    int deleteByPrimaryKey(Integer ddId);

    int insert(DeliveryDetail record);

    //添加销售详情(rfy)
    int insertSelective(DeliveryDetail record);

    DeliveryDetail selectByPrimaryKey(Integer ddId);
    //修改销售详情(rfy)
    int updateByPrimaryKeySelective(DeliveryDetail record);

    int updateByPrimaryKey(DeliveryDetail record);
    
    //根据销售单号和商品编号查询详情(rfy)
    DeliveryDetail selectByDnIdAndPid(@Param("dnid")String dnid,@Param("pid")Integer pid);
    //根据销售单号删除销售详情(rfy)
    int deleteByDnid(String dnid);
    
    //批量删除销售信息(rfy)
    int deleteByDdIdList(@Param("list")List<Integer> ddid);
    //根据销售单号判断是否存在详情(rfy)
    int isHaveByDnid(String dnid);

}
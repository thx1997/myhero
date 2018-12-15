package com.hero.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hero.entity.PurchaseDetail;

public interface PurchaseDetailService {
	//根据采购单号查询是否包含商品详情(rfy)
    public int selDetailByPid(String pid);
    //根据采购单号删除详情信息(rfy)
    public int delDtailByPid(String pid);
    
    //添加采购详情(rfy)
    int insertSelective(PurchaseDetail record);
    //根据采购单号、商品编号、商品规格编号查询该条详情记录(rfy)
    public PurchaseDetail queryByPurIdAndPid(@Param("pnid")String pnid,@Param("pid")Integer pid,@Param("psid")Integer psid);
    //修改采购详情(rfy)
    int updateByPrimaryKeySelective(PurchaseDetail record);
  








}

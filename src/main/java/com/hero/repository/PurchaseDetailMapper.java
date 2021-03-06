package com.hero.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hero.entity.PurchaseDetail;

public interface PurchaseDetailMapper {
	//删除采购信息(rfy)
    int deleteByPrimaryKey(Integer pdId);

    int insert(PurchaseDetail record);
    //添加采购详情(rfy)
    int insertSelective(PurchaseDetail record);

    PurchaseDetail selectByPrimaryKey(Integer pdId);
    //修改采购详情(rfy)
    int updateByPrimaryKeySelective(PurchaseDetail record);

    int updateByPrimaryKey(PurchaseDetail record);
    
    
    //根据采购单号查询是否包含商品详情(rfy)
    public int selDetailByPid(String pid);
    //根据采购单号删除详情信息(rfy)
    public int delDtailByPid(String pid);
    
    //根据采购单号、商品编号、商品规格编号查询该条详情记录(rfy)
    public PurchaseDetail queryByPurIdAndPid(@Param("pnid")String pnid,@Param("pid")Integer pid,@Param("psid")Integer psid);
    
    //批量删除采购信息(rfy)
    int deleteByPdIdList(@Param("list")List<Integer> pdid);
    
    //根据仓库编号查询采购单编号(rfy)
    public List<String> selPnIdsByShId(Integer shid);
    
    
}
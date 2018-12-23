package com.hero.repository;

import org.apache.ibatis.annotations.Param;

import com.hero.entity.StoreHouse;
import com.hero.entity.StorehouseDetail;

public interface StorehouseDetailMapper {
	/**
	 * 减某个仓库某件商品的库存量
	 * @author thx
	 * @param sid 仓库编号
	 * @param pid 商品编号
	 * @param num 目标减数
	 * @return
	 */
	int updateNumBysidpid(@Param("sid")Integer sid,@Param("pid")Integer pid,@Param("num")Integer num);
	
    int deleteByPrimaryKey(Integer sdId);

    int insert(StorehouseDetail record);
    //添加(rfy)
    int insertSelective(StorehouseDetail record);

    StorehouseDetail selectByPrimaryKey(Integer sdId);
    //修改(rfy)
    int updateByPrimaryKeySelective(StorehouseDetail record);

    int updateByPrimaryKey(StorehouseDetail record);
    
    //根据商品编号和仓库编号查询仓库详情信息(rfy)
    public StorehouseDetail selByPidAndSid(@Param("pid")Integer pid,@Param("sid")Integer sid);
}
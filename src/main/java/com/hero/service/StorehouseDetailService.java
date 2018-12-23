package com.hero.service;

import org.apache.ibatis.annotations.Param;

import com.hero.entity.StoreHouse;
import com.hero.entity.StorehouseDetail;

public interface StorehouseDetailService {
	/**
	 * 减某个仓库某件商品的库存量
	 * @author thx
	 * @param sid 仓库编号
	 * @param pid 商品编号
	 * @param num 目标减数
	 * @return
	 */
	int updateNumBysidpid(Integer sid,Integer pid,Integer num);
	
	//添加(rfy)
    int insertSelective(StorehouseDetail record);
    //修改(rfy)
    int updateByPrimaryKeySelective(StorehouseDetail record);
    //根据商品编号和仓库编号查询仓库详情信息(rfy)
    public StorehouseDetail selByPidAndSid(@Param("pid")Integer pid,@Param("sid")Integer sid);
}

package com.hero.repository;

import java.util.List;

import com.hero.entity.StoreHouse;

public interface StoreHouseMapper {
	/**
	 * 查询所有正常的仓库（除去停用的）
	 * @return 可用仓库集合
	 */
	List<StoreHouse> queryAllInvoicing();
	
	
	
    int deleteByPrimaryKey(Integer sId);

    int insert(StoreHouse record);

    int insertSelective(StoreHouse record);

    StoreHouse selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(StoreHouse record);

    int updateByPrimaryKey(StoreHouse record);
}
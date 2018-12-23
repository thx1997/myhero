package com.hero.repository;

import com.hero.entity.InventoryControl;

public interface InventoryControlMapper {
	
	/**
	 * 添加某仓库下某商品的上下限数量
	 * @author thx
	 * @param record 封装的条件
	 * @return
	 */
	 int insertSelective(InventoryControl record);
	 
	 
	 
    int deleteByPrimaryKey(Integer icId);

    int insert(InventoryControl record);

   

    InventoryControl selectByPrimaryKey(Integer icId);

    int updateByPrimaryKeySelective(InventoryControl record);

    int updateByPrimaryKey(InventoryControl record);
}
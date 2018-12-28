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
    /**
     * 修改某仓库下某商品的上下限数量
     * @author thx
	 * @param record 封装的条件
     * @return
     */
    int updateByPrimaryKeySelective(InventoryControl record);

    int updateByPrimaryKey(InventoryControl record);
    /**
     * 根据商品id和仓库id判断该仓库下的商品是否设置了上下限
     * @author thx
     * @param pid
     * @param sid
     * @return
     */
    int selByPidAndSid(Integer pid,Integer sid);
}
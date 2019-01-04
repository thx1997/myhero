package com.hero.service;

import org.apache.ibatis.annotations.Param;

import com.hero.entity.InventoryControl;

public interface InventoryControlService {
	/**
     * 根据商品id和仓库id判断该仓库下的商品是否设置了上下限
     * @author thx
     * @param pid 商品编号
     * @param sid 仓库编号
     * @return 总条数
     */
    int IsExitControlByPidAndSid(@Param("pid")Integer pid,@Param("sid")Integer sid);
	
	/**
	 * 添加某仓库下某商品的上下限数量
	 * @author thx
	 * @param record 封装的条件
	 * @return
	 */
	 int insertSelective(InventoryControl record);
	 
	  /**
	     * 修改某仓库下某商品的上下限数量
	     * @author thx
		 * @param record 封装的条件
	     * @return
	     */
	    int updateByPrimaryKeySelective(InventoryControl record);
	 
}

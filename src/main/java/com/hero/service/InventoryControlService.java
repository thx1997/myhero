package com.hero.service;

import com.hero.entity.InventoryControl;

public interface InventoryControlService {
	/**
	 * 添加某仓库下某商品的上下限数量
	 * @author thx
	 * @param record 封装的条件
	 * @return
	 */
	 int insertSelective(InventoryControl record);
	 
}

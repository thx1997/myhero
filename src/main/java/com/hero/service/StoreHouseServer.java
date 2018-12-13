package com.hero.service;

import java.util.List;

import com.hero.entity.StoreHouse;

public interface StoreHouseServer {
	/**
	 * 查询所有正常的仓库（除去停用的）
	 * @return 可用仓库集合
	 */
	List<StoreHouse> queryAllInvoicing();
}

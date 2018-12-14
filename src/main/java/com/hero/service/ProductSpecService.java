package com.hero.service;

import com.hero.entity.ProductSpec;

public interface ProductSpecService {
	/**
	 * 根据商品编号查询规格
	 * @author thx
	 * @param pid 商品编号
	 * @return 规格对象
	 */
	ProductSpec selectBypid(Integer pid);
}

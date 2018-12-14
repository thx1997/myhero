package com.hero.repository;

import com.hero.entity.ProductSpec;

public interface ProductSpecMapper {
	/**
	 * 根据商品编号查询规格
	 * @author thx
	 * @param pid 商品编号
	 * @return 规格对象
	 */
	ProductSpec selectBypid(Integer pid);
	
    int deleteByPrimaryKey(Integer psId);

    int insert(ProductSpec record);

    int insertSelective(ProductSpec record);
    
    ProductSpec selectByPrimaryKey(Integer psId);

    int updateByPrimaryKeySelective(ProductSpec record);

    int updateByPrimaryKey(ProductSpec record);
}
package com.hero.repository;

import com.hero.entity.ProductUnit;

public interface ProductUnitMapper {
	/**
	 * 跟据规格单位编号查询规格单位名
	 * @author thx
	 * @param puId 规格单位编号
	 * @return
	 */	
	String selectPuNameBypuid(Integer puId);
	
	
    int deleteByPrimaryKey(Integer puId);

    int insert(ProductUnit record);

    int insertSelective(ProductUnit record);

    ProductUnit selectByPrimaryKey(Integer puId);

    int updateByPrimaryKeySelective(ProductUnit record);

    int updateByPrimaryKey(ProductUnit record);
}
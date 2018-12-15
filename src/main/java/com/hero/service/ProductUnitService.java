package com.hero.service;

public interface ProductUnitService {
	/**
	 * 跟据规格单位编号查询规格单位名
	 * @author thx
	 * @param puId 规格单位编号
	 * @return
	 */	
	String selectPuNameBypuid(Integer puId);
}

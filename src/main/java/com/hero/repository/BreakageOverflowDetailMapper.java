package com.hero.repository;

import org.apache.ibatis.annotations.Param;

import com.hero.entity.BreakageOverflowDetail;

public interface BreakageOverflowDetailMapper {
	
	/**
	 *根据库存编号和商品编号查询该商品的库存量
	 * @param sdpid 商品编号
	 * @param sdsid 仓库编号
	 * @return 库存量
	 */
	int selectSdnumberBypuid(@Param("sdpid")Integer sdpid,@Param("sdsid")Integer sdsid);
	
	
    int deleteByPrimaryKey(Integer bodId);

    int insert(BreakageOverflowDetail record);

    int insertSelective(BreakageOverflowDetail record);

    BreakageOverflowDetail selectByPrimaryKey(Integer bodId);

    int updateByPrimaryKeySelective(BreakageOverflowDetail record);

    int updateByPrimaryKey(BreakageOverflowDetail record);
}
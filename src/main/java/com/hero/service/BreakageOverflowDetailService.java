package com.hero.service;

import org.apache.ibatis.annotations.Param;

import com.hero.entity.BreakageOverflowDetail;

public interface BreakageOverflowDetailService {
	/**
	 *根据库存编号和商品编号查询该商品的库存量
	 * @param sdpid 商品编号
	 * @param sdsid 仓库编号
	 * @return 库存量
	 */
	int selectSdnumberBypuid(@Param("sdpid")Integer sdpid,@Param("sdsid")Integer sdsid);
	/**
	 * 添加报损报溢详情
	 * @param record 条件封装的实体(bofdetail)
	 * @return 受影响的行数
	 */
	int insertSelective(BreakageOverflowDetail record);
}

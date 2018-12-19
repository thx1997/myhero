package com.hero.service;

import java.util.List;

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
	/**
	 * 更改单子状态（（0：上报中1：已审核2：已处理））
	 * @author thx
	 * @param bodId 详情单子编号
	 * @param state 状态
	 * @param eid 操作人编号
	 * @param type 0：管理员核审按钮1：负责人处理按钮
	 * @return
	 */
	int updateBodStateByBodId(Integer bodId,Integer state,Integer eid,Integer type);
	
	/**
	 * 查询一个总单的所有详情单的状态
	 * @param boid 总单编号
	 * @return
	 */
     Integer selectBodStateByBoid(Integer boid);
}

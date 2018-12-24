package com.hero.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hero.entity.BreakageOverflow;
import com.hero.entity.query.BreakageOverflowQuery;

public interface BreakageOverflowMapper {
	
	
	
	/**
     * 添加报损报溢单
     * @author thx
     * @param eid 盘点员（员工）编号 
     * @return 受影响的行数
     */
    int insertBreakageOverflow(int eid);
    /**
     * 查询上次执行报损报报溢自增值
     * @author thx
     *@param eid 盘点员（员工）编号 
     * @return 最大编号
     */
    int selectMaxboid(int eid);
    /**
     * 根据单子编号查询单子的上报总数量
     * @author thx
     * @param boId 单子编号
     * @return 单子的上报总数量
     */
    int selectBoNumber(Integer boId);
    /**
     * 根据单子编号更新单子的上报总数量
     * @author thx
     * @param boId 单子编号
     * @return 受影响的行数
     */
    int updateBoNumber(@Param("boId")Integer boId,@Param("number")Integer number);
    
    /**
 	 * 多条件分页查询损益单
 	 * @author thx
 	 * @param bofQuery 条件封装成的实体
 	 * @return 满足条件的单子集合
 	 */
 	public List<BreakageOverflow> querybof(BreakageOverflowQuery bofQuery);
 	/**
 	 * 多条件分页查询角色
 	 * @author thx
 	 * @param bofQuery 条件封装成的实体
 	 * @return 满足条件的单子集合的总条数
 	 */
 	public int querybofCount(BreakageOverflowQuery bofQuery);
    /**
     * 清除损溢单的无效信息
     * @author thx
     * @return 受影响的行数
     */
    int deleteByNumberZero();
    
   
    /**
     *  更改单子状态（（0：上报中1：已审核2：已处理）
     *  @author thx
     * @param boId 单子编号
     * @param state 状态
     * @return 受影响的行数
     */
	int updateBoStateByBoId(@Param("boId")Integer boId,@Param("state")Integer state);
	
    
    
    
    
    
    int deleteByPrimaryKey(Integer boId);

    int insert(BreakageOverflow record);

    int insertSelective(BreakageOverflow record);

    BreakageOverflow selectByPrimaryKey(Integer boId);

    int updateByPrimaryKeySelective(BreakageOverflow record);

    int updateByPrimaryKey(BreakageOverflow record);
}
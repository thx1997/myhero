package com.hero.repository;

import com.hero.entity.BreakageOverflow;

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
     *@param eid 盘点员（员工）编号 
     * @return 最大编号
     */
    int selectMaxboid(int eid);
    
    
    int deleteByPrimaryKey(Integer boId);

    int insert(BreakageOverflow record);

    int insertSelective(BreakageOverflow record);

    BreakageOverflow selectByPrimaryKey(Integer boId);

    int updateByPrimaryKeySelective(BreakageOverflow record);

    int updateByPrimaryKey(BreakageOverflow record);
}
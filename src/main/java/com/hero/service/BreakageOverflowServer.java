package com.hero.service;

public interface BreakageOverflowServer {
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
}

package com.hero.repository;

import java.util.List;

import com.hero.entity.BofDetail;
import com.hero.entity.query.BofDetailQuery;

public interface BofDetailMapper {
	/**
 	 * 多条件分页查询损益单详情
 	 * @author thx
 	 * @param bofdQuery 条件封装成的实体
 	 * @return 满足条件的详情单子集合
 	 */
 	public List<BofDetail> querybofd(BofDetailQuery bofdQuery);
 	/**
 	 * 多条件分页查询损益单详情
 	 * @author thx
 	 * @param bofdQuery 条件封装成的实体
 	 * @return 满足条件的详情单子集合的总条数
 	 */
 	public int querybofdCount(BofDetailQuery bofdQuery);
	
 	
 	
 	
 	
	
    int insert(BofDetail record);

    int insertSelective(BofDetail record);
}
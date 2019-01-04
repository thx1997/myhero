package com.hero.repository;

import java.util.List;

import com.hero.entity.Profit;

public interface ProfitMapper {
	/**
	 * 查询毛利润
	 * @author thx
	 * @return
	 */
      List<Profit> queryProfit();
}

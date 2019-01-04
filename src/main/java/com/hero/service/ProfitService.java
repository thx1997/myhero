package com.hero.service;

import java.util.List;

import com.hero.entity.Profit;

public interface ProfitService {
	/**
	 * 查询毛利润
	 * @author thx
	 * @return
	 */
      List<Profit> queryProfit();
}

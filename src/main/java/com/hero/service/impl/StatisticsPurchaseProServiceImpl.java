package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.StatisticsPurchasePro;
import com.hero.entity.StatisticsSupplierPro;
import com.hero.repository.StatisticsPurchaseProMapper;
import com.hero.service.StatisticsPurchaseProService;
@Service
public class StatisticsPurchaseProServiceImpl implements StatisticsPurchaseProService {
	@Autowired
	private StatisticsPurchaseProMapper statisticsPurchaseProMapper;
	@Override//(rfy)
	public List<StatisticsPurchasePro> queryByYearAndMonth(int y, int m) {
		// TODO Auto-generated method stub
		return statisticsPurchaseProMapper.queryByYearAndMonth(y, m);
	}
	@Override//(rfy)
	public List<StatisticsSupplierPro> supplierQueryByYearAndMonth(int y, int m) {
		// TODO Auto-generated method stub
		return statisticsPurchaseProMapper.supplierQueryByYearAndMonth(y, m);
	}
	@Override//(rfy)
	public List<StatisticsPurchasePro> queryDeliveryByYearAndMonth(int y, int m) {
		// TODO Auto-generated method stub
		return statisticsPurchaseProMapper.queryDeliveryByYearAndMonth(y, m);
	}
	@Override//(rfy)
	public List<StatisticsSupplierPro> customerQueryByYearAndMonth(int y, int m) {
		// TODO Auto-generated method stub
		return statisticsPurchaseProMapper.customerQueryByYearAndMonth(y, m);
	}

}

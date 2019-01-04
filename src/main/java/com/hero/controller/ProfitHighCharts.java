package com.hero.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.Profit;
import com.hero.service.ProfitService;

@RestController
@RequestMapping(value="/charts")
public class ProfitHighCharts {
	@Autowired
	ProfitService profitService;
	
	
	
	/**
	 * 查询毛利
	 * @return
	 */
	@RequestMapping(value="/queryProfit")
	public Object updateNumBysidpid() {		
		Map<String,Object> map=new HashMap<String,Object>();
        List<Profit> n=profitService.queryProfit();      
        if(n.size()>0) {
        	map.put("code", 1);
        	map.put("msg","操作成功");
        	List<Integer> dat=new ArrayList<Integer>();
        	for (Profit profit : n) {
        		dat.add(profit.getProfit());
			}
        	map.put("data",dat );
        }else {
        	map.put("code", 0);
        	map.put("msg","操作失败");
        	
        }
        System.out.println(map);
        
		return map;
	}
	
	
}

package com.hero.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Profit {
	
	  private Integer profit;
	 
	 @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
	    private Date times;

	public Integer getProfit() {
		return profit;
	}

	public void setProfit(Integer profit) {
		this.profit = profit;
	}

	public Date getTimes() {
		return times;
	}

	public void setTimes(Date times) {
		this.times = times;
	}

	@Override
	public String toString() {
		return "Profit [profit=" + profit + ", times=" + times + "]";
	}
	 
}

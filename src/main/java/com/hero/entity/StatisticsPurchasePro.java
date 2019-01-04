package com.hero.entity;


import java.util.Date;

public class StatisticsPurchasePro {
    private String pName;

    private Integer pronum;
    
	public StatisticsPurchasePro(String pName, Integer pronum) {
		super();
		this.pName = pName;
		this.pronum = pronum;
	}

	public StatisticsPurchasePro() {
		super();
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Integer getPronum() {
		return pronum;
	}

	public void setPronum(Integer pronum) {
		this.pronum = pronum;
	}


	@Override
	public String toString() {
		return "StatisticsPurchasePro [pName=" + pName + ", pronum=" + pronum + "]";
	}


	
	

 
    
   
    
}
package com.hero.entity.query;

public class PurchaseDetailSpecQuery extends QueryBase{

	private String pnid;//采购单号
	private Integer shid;//仓库编号
	

	public PurchaseDetailSpecQuery(String pnid, Integer shid) {
		super();
		this.pnid = pnid;
		this.shid = shid;
	}

	public PurchaseDetailSpecQuery() {
		
	}

	public String getPnid() {
		return pnid;
	}

	public void setPnid(String pnid) {
		this.pnid = pnid;
	}

	public Integer getShid() {
		return shid;
	}

	public void setShid(Integer shid) {
		this.shid = shid;
	}

	@Override
	public String toString() {
		return "PurchaseDetailSpecQuery [pnid=" + pnid + ", shid=" + shid + "]";
	}

	
	
	
	
}

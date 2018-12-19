package com.hero.entity.query;

public class PurchaseDetailSpecQuery extends QueryBase{

	private String pnid;//采购单号

	public PurchaseDetailSpecQuery(String pnid) {
		super();
		this.pnid = pnid;
	}

	public PurchaseDetailSpecQuery() {
		
	}

	public String getPnid() {
		return pnid;
	}

	public void setPnid(String pnid) {
		this.pnid = pnid;
	}

	@Override
	public String toString() {
		return "PurchaseDetailSpecQuery [pnid=" + pnid + "]";
	}
	
	
	
}

package com.hero.entity.query;

public class DeliveryDetailSpecQuery extends QueryBase{
	private String dnid;//销售单号
	private Integer shid;//仓库编号
	public DeliveryDetailSpecQuery(String dnid, Integer shid) {
		super();
		this.dnid = dnid;
		this.shid = shid;
	}
	public DeliveryDetailSpecQuery() {
		super();
	}
	public String getDnid() {
		return dnid;
	}
	public void setDnid(String dnid) {
		this.dnid = dnid;
	}
	public Integer getShid() {
		return shid;
	}
	public void setShid(Integer shid) {
		this.shid = shid;
	}
	@Override
	public String toString() {
		return "DeliveryDetailSpecQuery [dnid=" + dnid + ", shid=" + shid + "]";
	}
	
	
}

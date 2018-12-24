package com.hero.entity.query;

public class HouseDetailProQuery1  extends QueryBase{
	private Integer pcId;//类别编号
	 private Integer sdSId;//仓库编号
	 private String pName;//商品名模糊查询
	public Integer getPcId() {
		return pcId;
	}
	public void setPcId(Integer pcId) {
		this.pcId = pcId;
	}
	public Integer getSdSId() {
		return sdSId;
	}
	public void setSdSId(Integer sdSId) {
		this.sdSId = sdSId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public HouseDetailProQuery1(Integer pcId, Integer sdSId, String pName) {
		super();
		this.pcId = pcId;
		this.sdSId = sdSId;
		this.pName = pName;
	}
	public HouseDetailProQuery1() {
		super();
	}
	@Override
	public String toString() {
		return "HouseDetailProQuery1 [pcId=" + pcId + ", sdSId=" + sdSId + ", pName=" + pName + "]";
	}
	 
	
}

package com.hero.entity.query;

public class HouseDetailProQuery extends QueryBase{

	private Integer sid;//仓库编号
	private Integer spid;//位置中间表编号
	private Integer eid;//员工编号
	private String pname;//商品名称
	
	public HouseDetailProQuery(Integer sid, Integer spid, Integer eid, String pname) {
		super();
		this.sid = sid;
		this.spid = spid;
		this.eid = eid;
		this.pname = pname;
	}
	public HouseDetailProQuery() {
		super();
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public Integer getSpid() {
		return spid;
	}
	public void setSpid(Integer spid) {
		this.spid = spid;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
}

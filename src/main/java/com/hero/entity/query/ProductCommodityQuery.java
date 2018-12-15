package com.hero.entity.query;

public class ProductCommodityQuery extends QueryBase{
	private String pname;//商品名称
	private String pcid;//类别编号
	private Integer pbid;//品牌编号
	private Integer sid;//供应商编号
	private Integer scid;//供应商类别编号
	
	
	public ProductCommodityQuery(String pname, String pcid, Integer pbid, Integer sid, Integer scid) {
		super();
		this.pname = pname;
		this.pcid = pcid;
		this.pbid = pbid;
		this.sid = sid;
		this.scid = scid;
	}
	public ProductCommodityQuery() {
		super();
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcid() {
		return pcid;
	}
	public void setPcid(String pcid) {
		this.pcid = pcid;
	}
	public Integer getPbid() {
		return pbid;
	}
	public void setPbid(Integer pbid) {
		this.pbid = pbid;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public Integer getScid() {
		return scid;
	}
	public void setScid(Integer scid) {
		this.scid = scid;
	}
	
	
}

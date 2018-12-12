package com.hero.entity.query;

public class ProductQuery extends QueryBase{
	private String spname;//名称
	private Integer spcid;//类别id
	private Integer spbid;//品牌id
	private String orderby;//排序方式
	
	
	
	public ProductQuery(String spname, Integer spcid, Integer spbid, String orderby) {
		super();
		this.spname = spname;
		this.spcid = spcid;
		this.spbid = spbid;
		this.orderby = orderby;
	}

	public ProductQuery() {
		super();
	}

	public String getSpname() {
		return spname;
	}
	public void setSpname(String spname) {
		this.spname = spname;
	}
	public Integer getSpcid() {
		return spcid;
	}
	public void setSpcid(Integer spcid) {
		this.spcid = spcid;
	}
	public String getOrderby() {
		return orderby;
	}
	public void setOrderby(String orderby) {
		this.orderby = orderby;
	}

	public Integer getSpbid() {
		return spbid;
	}

	public void setSpbid(Integer spbid) {
		this.spbid = spbid;
	}
	
	
}

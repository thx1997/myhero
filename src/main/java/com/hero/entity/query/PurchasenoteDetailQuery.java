package com.hero.entity.query;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class PurchasenoteDetailQuery extends QueryBase{
	private String pnId;
	@DateTimeFormat( pattern = "yyyy-MM-dd")
	private Date beginsCreatetime;
	@DateTimeFormat( pattern = "yyyy-MM-dd")
	private Date endsCreatetime;
	private Integer pnAccountantid;
	public PurchasenoteDetailQuery(String pnId, Date beginsCreatetime, Date endsCreatetime, Integer pnAccountantid) {
		super();
		this.pnId = pnId;
		this.beginsCreatetime = beginsCreatetime;
		this.endsCreatetime = endsCreatetime;
		this.pnAccountantid = pnAccountantid;
	}
	public PurchasenoteDetailQuery() {
		super();
	}
	public String getPnId() {
		return pnId;
	}
	public void setPnId(String pnId) {
		this.pnId = pnId;
	}
	public Date getBeginsCreatetime() {
		return beginsCreatetime;
	}
	public void setBeginsCreatetime(Date beginsCreatetime) {
		this.beginsCreatetime = beginsCreatetime;
	}
	public Date getEndsCreatetime() {
		return endsCreatetime;
	}
	public void setEndsCreatetime(Date endsCreatetime) {
		this.endsCreatetime = endsCreatetime;
	}
	public Integer getPnAccountantid() {
		return pnAccountantid;
	}
	public void setPnAccountantid(Integer pnAccountantid) {
		this.pnAccountantid = pnAccountantid;
	}
	
	
}

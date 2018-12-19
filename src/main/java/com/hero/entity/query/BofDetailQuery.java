package com.hero.entity.query;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BofDetailQuery extends QueryBase{
	 private Integer boId;//总单编号	 
	 //详情单的创建时间段
	    @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date beginBodCreatetime;
	    @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date endBodCreatetime;
	    
	 private Integer bodType;//单子类型
	 private Integer bodState;//单子状态
	public Integer getBoId() {
		return boId;
	}
	public void setBoId(Integer boId) {
		this.boId = boId;
	}
	public Date getBeginBodCreatetime() {
		return beginBodCreatetime;
	}
	public void setBeginBodCreatetime(Date beginBodCreatetime) {
		this.beginBodCreatetime = beginBodCreatetime;
	}
	public Date getEndBodCreatetime() {
		return endBodCreatetime;
	}
	public void setEndBodCreatetime(Date endBodCreatetime) {
		this.endBodCreatetime = endBodCreatetime;
	}
	public Integer getBodType() {
		return bodType;
	}
	public void setBodType(Integer bodType) {
		this.bodType = bodType;
	}
	public Integer getBodState() {
		return bodState;
	}
	public void setBodState(Integer bodState) {
		this.bodState = bodState;
	}
	public BofDetailQuery(Integer boId, Date beginBodCreatetime, Date endBodCreatetime, Integer bodType,
			Integer bodState) {
		super();
		this.boId = boId;
		this.beginBodCreatetime = beginBodCreatetime;
		this.endBodCreatetime = endBodCreatetime;
		this.bodType = bodType;
		this.bodState = bodState;
	}
	public BofDetailQuery() {
		super();
	}
	@Override
	public String toString() {
		return "BofDetailQuery [boId=" + boId + ", beginBodCreatetime=" + beginBodCreatetime + ", endBodCreatetime="
				+ endBodCreatetime + ", bodType=" + bodType + ", bodState=" + bodState + "]";
	}
	 
	 
}

package com.hero.entity;

import java.util.Date;

public class BreakageOverflowDetail {
    private Integer bodId;

    private Integer bodPId;

    private Integer bodBoId;

    private Boolean bodType;

    private Integer bodSId;

    private Date bodCreatetime;

    private Integer bodNumber;

    private Integer bodGlEid;
    
    private Integer bodFzEid;
    
    private Integer bodState;

    private String bodRemark;

    public Integer getBodGlEid() {
		return bodGlEid;
	}

	public void setBodGlEid(Integer bodGlEid) {
		this.bodGlEid = bodGlEid;
	}

	public Integer getBodFzEid() {
		return bodFzEid;
	}

	public void setBodFzEid(Integer bodFzEid) {
		this.bodFzEid = bodFzEid;
	}

	public Integer getBodId() {
        return bodId;
    }

    public void setBodId(Integer bodId) {
        this.bodId = bodId;
    }

    public Integer getBodPId() {
        return bodPId;
    }

    public void setBodPId(Integer bodPId) {
        this.bodPId = bodPId;
    }

    public Integer getBodBoId() {
        return bodBoId;
    }

    public void setBodBoId(Integer bodBoId) {
        this.bodBoId = bodBoId;
    }

    public Boolean getBodType() {
        return bodType;
    }

    public void setBodType(Boolean bodType) {
        this.bodType = bodType;
    }

    public Integer getBodSId() {
        return bodSId;
    }

    public void setBodSId(Integer bodSId) {
        this.bodSId = bodSId;
    }

    public Date getBodCreatetime() {
        return bodCreatetime;
    }

    public void setBodCreatetime(Date bodCreatetime) {
        this.bodCreatetime = bodCreatetime;
    }

    public Integer getBodNumber() {
        return bodNumber;
    }

    public void setBodNumber(Integer bodNumber) {
        this.bodNumber = bodNumber;
    }

    public Integer getBodState() {
        return bodState;
    }

    public void setBodState(Integer bodState) {
        this.bodState = bodState;
    }

    public String getBodRemark() {
        return bodRemark;
    }

    public void setBodRemark(String bodRemark) {
        this.bodRemark = bodRemark == null ? null : bodRemark.trim();
    }

	

	@Override
	public String toString() {
		return "BreakageOverflowDetail [bodId=" + bodId + ", bodPId=" + bodPId + ", bodBoId=" + bodBoId + ", bodType="
				+ bodType + ", bodSId=" + bodSId + ", bodCreatetime=" + bodCreatetime + ", bodNumber=" + bodNumber
				+ ", bodGlEid=" + bodGlEid + ", bodFzEid=" + bodFzEid + ", bodState=" + bodState + ", bodRemark="
				+ bodRemark + "]";
	}

	public BreakageOverflowDetail(Integer bodId, Integer bodPId, Integer bodBoId, Boolean bodType, Integer bodSId,
			Date bodCreatetime, Integer bodNumber, Integer bodGlEid, Integer bodFzEid, Integer bodState,
			String bodRemark) {
		super();
		this.bodId = bodId;
		this.bodPId = bodPId;
		this.bodBoId = bodBoId;
		this.bodType = bodType;
		this.bodSId = bodSId;
		this.bodCreatetime = bodCreatetime;
		this.bodNumber = bodNumber;
		this.bodGlEid = bodGlEid;
		this.bodFzEid = bodFzEid;
		this.bodState = bodState;
		this.bodRemark = bodRemark;
	}

	public BreakageOverflowDetail() {
		super();
	}

	
    
    
}
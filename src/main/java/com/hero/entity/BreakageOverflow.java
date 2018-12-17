package com.hero.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class BreakageOverflow {
    private Integer boId;

    private Integer boEId;

    private Date boCreatetime;

    private Integer boNumber;

    private Integer boState;

    private String boRemark;
    @JsonUnwrapped
    private Employee  employee;
    
    public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Integer getBoId() {
        return boId;
    }

    public void setBoId(Integer boId) {
        this.boId = boId;
    }

    public Integer getBoEId() {
        return boEId;
    }

    public void setBoEId(Integer boEId) {
        this.boEId = boEId;
    }

    public Date getBoCreatetime() {
        return boCreatetime;
    }

    public void setBoCreatetime(Date boCreatetime) {
        this.boCreatetime = boCreatetime;
    }

    public Integer getBoNumber() {
        return boNumber;
    }

    public void setBoNumber(Integer boNumber) {
        this.boNumber = boNumber;
    }

    public Integer getBoState() {
        return boState;
    }

    public void setBoState(Integer boState) {
        this.boState = boState;
    }

    public String getBoRemark() {
        return boRemark;
    }

    public void setBoRemark(String boRemark) {
        this.boRemark = boRemark == null ? null : boRemark.trim();
    }

	public BreakageOverflow(Integer boId, Integer boEId, Date boCreatetime, Integer boNumber, Integer boState,
			String boRemark) {
		super();
		this.boId = boId;
		this.boEId = boEId;
		this.boCreatetime = boCreatetime;
		this.boNumber = boNumber;
		this.boState = boState;
		this.boRemark = boRemark;
	}

	public BreakageOverflow() {
		super();
	}

	@Override
	public String toString() {
		return "BreakageOverflow [boId=" + boId + ", boEId=" + boEId + ", boCreatetime=" + boCreatetime + ", boNumber="
				+ boNumber + ", boState=" + boState + ", boRemark=" + boRemark + ", employee=" + employee + "]";
	}

	
}
package com.hero.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class StoreHouse {
    private Integer sId;

    private String sName;

    private Integer sEId;

    private String sAddress;

    private String sPhone;

    private Date sCreatetime;

    private Integer sStatus;

    private Date sUpdatetime;

    private String sRemark;
    @JsonUnwrapped
    private Employee employee;

	public StoreHouse(Integer sId, String sName, Integer sEId, String sAddress, String sPhone, Date sCreatetime,
			Integer sStatus, Date sUpdatetime, String sRemark) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sEId = sEId;
		this.sAddress = sAddress;
		this.sPhone = sPhone;
		this.sCreatetime = sCreatetime;
		this.sStatus = sStatus;
		this.sUpdatetime = sUpdatetime;
		this.sRemark = sRemark;
	}

	public StoreHouse() {
		super();
	}

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Integer getsEId() {
		return sEId;
	}

	public void setsEId(Integer sEId) {
		this.sEId = sEId;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public String getsPhone() {
		return sPhone;
	}

	public void setsPhone(String sPhone) {
		this.sPhone = sPhone;
	}

	public Date getsCreatetime() {
		return sCreatetime;
	}

	public void setsCreatetime(Date sCreatetime) {
		this.sCreatetime = sCreatetime;
	}

	public Integer getsStatus() {
		return sStatus;
	}

	public void setsStatus(Integer sStatus) {
		this.sStatus = sStatus;
	}

	public Date getsUpdatetime() {
		return sUpdatetime;
	}

	public void setsUpdatetime(Date sUpdatetime) {
		this.sUpdatetime = sUpdatetime;
	}

	public String getsRemark() {
		return sRemark;
	}

	public void setsRemark(String sRemark) {
		this.sRemark = sRemark;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "StoreHouse [sId=" + sId + ", sName=" + sName + ", sEId=" + sEId + ", sAddress=" + sAddress + ", sPhone="
				+ sPhone + ", sCreatetime=" + sCreatetime + ", sStatus=" + sStatus + ", sUpdatetime=" + sUpdatetime
				+ ", sRemark=" + sRemark + "]";
	}

    
}
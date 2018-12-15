package com.hero.entity.query;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


public class StoreHouseQuery extends QueryBase {

	private String sName;

	private Integer sEId;

	private String sAddress;

	private String sPhone;

	@DateTimeFormat( pattern = "yyyy-MM-dd")
	private Date beginsCreatetime;
	@DateTimeFormat( pattern = "yyyy-MM-dd")
	private Date endsCreatetime;
	
	private Integer sStatus;

	public StoreHouseQuery(String sName, Integer sEId, String sAddress, String sPhone, Date beginsCreatetime,
			Date endsCreatetime, Integer sStatus) {
		super();
		this.sName = sName;
		this.sEId = sEId;
		this.sAddress = sAddress;
		this.sPhone = sPhone;
		this.beginsCreatetime = beginsCreatetime;
		this.endsCreatetime = endsCreatetime;
		this.sStatus = sStatus;
	}

	public StoreHouseQuery() {
		super();
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

	public Integer issStatus() {
		return sStatus;
	}

	public void setsStatus(Integer sStatus) {
		this.sStatus = sStatus;
	}

	@Override
	public String toString() {
		return "StoreHouseQuery [sName=" + sName + ", sEId=" + sEId + ", sAddress=" + sAddress + ", sPhone=" + sPhone
				+ ", beginsCreatetime=" + beginsCreatetime + ", endsCreatetime=" + endsCreatetime + ", sStatus="
				+ sStatus + "]";
	}

	
}

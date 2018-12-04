package com.hero.entity;

import java.util.Date;

public class SupplierOrCustomer {
    private Integer sId;

    private String sName;

    private String sFax;

    private Integer sScId;

    private String sConstacperson;

    private String sConstacphone;

    private String sAddress;

    private String sDescription;

    private String sIsexit;

    private String sTallage;

    private Date sCreatetime;

    private Date sUpdatetime;

    private String sRemark;

    private Boolean sType;

    @Override
	public String toString() {
		return "SupplierOrCustomer [sId=" + sId + ", sName=" + sName + ", sFax=" + sFax + ", sScId=" + sScId
				+ ", sConstacperson=" + sConstacperson + ", sConstacphone=" + sConstacphone + ", sAddress=" + sAddress
				+ ", sDescription=" + sDescription + ", sIsexit=" + sIsexit + ", sTallage=" + sTallage
				+ ", sCreatetime=" + sCreatetime + ", sUpdatetime=" + sUpdatetime + ", sRemark=" + sRemark + ", sType="
				+ sType + "]";
	}

	public SupplierOrCustomer() {
		super();
	}

	public SupplierOrCustomer(Integer sId, String sName, String sFax, Integer sScId, String sConstacperson,
			String sConstacphone, String sAddress, String sDescription, String sIsexit, String sTallage,
			Date sCreatetime, Date sUpdatetime, String sRemark, Boolean sType) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sFax = sFax;
		this.sScId = sScId;
		this.sConstacperson = sConstacperson;
		this.sConstacphone = sConstacphone;
		this.sAddress = sAddress;
		this.sDescription = sDescription;
		this.sIsexit = sIsexit;
		this.sTallage = sTallage;
		this.sCreatetime = sCreatetime;
		this.sUpdatetime = sUpdatetime;
		this.sRemark = sRemark;
		this.sType = sType;
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
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsFax() {
        return sFax;
    }

    public void setsFax(String sFax) {
        this.sFax = sFax == null ? null : sFax.trim();
    }

    public Integer getsScId() {
        return sScId;
    }

    public void setsScId(Integer sScId) {
        this.sScId = sScId;
    }

    public String getsConstacperson() {
        return sConstacperson;
    }

    public void setsConstacperson(String sConstacperson) {
        this.sConstacperson = sConstacperson == null ? null : sConstacperson.trim();
    }

    public String getsConstacphone() {
        return sConstacphone;
    }

    public void setsConstacphone(String sConstacphone) {
        this.sConstacphone = sConstacphone == null ? null : sConstacphone.trim();
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress == null ? null : sAddress.trim();
    }

    public String getsDescription() {
        return sDescription;
    }

    public void setsDescription(String sDescription) {
        this.sDescription = sDescription == null ? null : sDescription.trim();
    }

    public String getsIsexit() {
        return sIsexit;
    }

    public void setsIsexit(String sIsexit) {
        this.sIsexit = sIsexit == null ? null : sIsexit.trim();
    }

    public String getsTallage() {
        return sTallage;
    }

    public void setsTallage(String sTallage) {
        this.sTallage = sTallage == null ? null : sTallage.trim();
    }

    public Date getsCreatetime() {
        return sCreatetime;
    }

    public void setsCreatetime(Date sCreatetime) {
        this.sCreatetime = sCreatetime;
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
        this.sRemark = sRemark == null ? null : sRemark.trim();
    }

    public Boolean getsType() {
        return sType;
    }

    public void setsType(Boolean sType) {
        this.sType = sType;
    }
}
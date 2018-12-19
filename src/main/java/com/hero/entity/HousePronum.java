package com.hero.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.hero.entity.query.QueryBase;

public class HousePronum extends QueryBase{
    private Integer sId;

    private String sName;

    private Integer sEId;

    private String sAddress;

    private String sPhone;

    private Date sCreatetime;

    private Boolean sStatus;

    private Date sUpdatetime;

    private String sRemark;

    private String eName;

    private Long proNum;

    private BigDecimal proTotal;

    
    public HousePronum() {
		super();
	}

	public HousePronum(Integer sId, String sName, Integer sEId, String sAddress, String sPhone, Date sCreatetime,
			Boolean sStatus, Date sUpdatetime, String sRemark, String eName, Long proNum, BigDecimal proTotal) {
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
		this.eName = eName;
		this.proNum = proNum;
		this.proTotal = proTotal;
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
        this.sAddress = sAddress == null ? null : sAddress.trim();
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone == null ? null : sPhone.trim();
    }

    public Date getsCreatetime() {
        return sCreatetime;
    }

    public void setsCreatetime(Date sCreatetime) {
        this.sCreatetime = sCreatetime;
    }

    public Boolean getsStatus() {
        return sStatus;
    }

    public void setsStatus(Boolean sStatus) {
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
        this.sRemark = sRemark == null ? null : sRemark.trim();
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName == null ? null : eName.trim();
    }

    public Long getProNum() {
        return proNum;
    }

    public void setProNum(Long proNum) {
        this.proNum = proNum;
    }

    public BigDecimal getProTotal() {
        return proTotal;
    }

    public void setProTotal(BigDecimal proTotal) {
        this.proTotal = proTotal;
    }

	@Override
	public String toString() {
		return "HousePronum [sId=" + sId + ", sName=" + sName + ", sEId=" + sEId + ", sAddress=" + sAddress
				+ ", sPhone=" + sPhone + ", sCreatetime=" + sCreatetime + ", sStatus=" + sStatus + ", sUpdatetime="
				+ sUpdatetime + ", sRemark=" + sRemark + ", eName=" + eName + ", proNum=" + proNum + ", proTotal="
				+ proTotal + "]";
	}
    
    
}
package com.hero.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BofDetail {
    private Integer boId;

    private Date boCreatetime;

    private Integer boNumber;

    private Integer boState;

    private Integer bodId;

    private Integer bodPId;

    private Integer bodType;

    private Date bodCreatetime;

    private Integer bodNumber;

    private Integer bodState;

    private Integer sId;

    private String sName;

    private Integer eId;

    private String eName;

    private Integer pId;

    private String pName;

    private Integer pcId;

    private String pcName;

    private Integer pbId;

    private String pbName;

    private BigDecimal psWeight;

    private String psWeightunit;

    private String psSize;

    private String psSizeunit;

    private BigDecimal psDia;

    private String psDiaunit;

    private BigDecimal psDensity;

    private String psDensityunit;

    
    private String glName;
     private String fzName;
     
    public String getGlName() {
		return glName;
	}

	public void setGlName(String glName) {
		this.glName = glName;
	}

	public String getFzName() {
		return fzName;
	}

	public void setFzName(String fzName) {
		this.fzName = fzName;
	}

	public BofDetail(Integer boId, Date boCreatetime, Integer boNumber, Integer boState, Integer bodId, Integer bodPId,
			Integer bodType, Date bodCreatetime, Integer bodNumber, Integer bodState, Integer sId, String sName,
			Integer eId, String eName, Integer pId, String pName, Integer pcId, String pcName, Integer pbId,
			String pbName, BigDecimal psWeight, String psWeightunit, String psSize, String psSizeunit, BigDecimal psDia,
			String psDiaunit, BigDecimal psDensity, String psDensityunit, String glName, String fzName) {
		super();
		this.boId = boId;
		this.boCreatetime = boCreatetime;
		this.boNumber = boNumber;
		this.boState = boState;
		this.bodId = bodId;
		this.bodPId = bodPId;
		this.bodType = bodType;
		this.bodCreatetime = bodCreatetime;
		this.bodNumber = bodNumber;
		this.bodState = bodState;
		this.sId = sId;
		this.sName = sName;
		this.eId = eId;
		this.eName = eName;
		this.pId = pId;
		this.pName = pName;
		this.pcId = pcId;
		this.pcName = pcName;
		this.pbId = pbId;
		this.pbName = pbName;
		this.psWeight = psWeight;
		this.psWeightunit = psWeightunit;
		this.psSize = psSize;
		this.psSizeunit = psSizeunit;
		this.psDia = psDia;
		this.psDiaunit = psDiaunit;
		this.psDensity = psDensity;
		this.psDensityunit = psDensityunit;
		this.glName = glName;
		this.fzName = fzName;
	}

	public Integer getBoId() {
        return boId;
    }

    public void setBoId(Integer boId) {
        this.boId = boId;
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

    public Integer getBodType() {
        return bodType;
    }

    public void setBodType(Integer bodType) {
        this.bodType = bodType;
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

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName == null ? null : eName.trim();
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public Integer getPcId() {
        return pcId;
    }

    public void setPcId(Integer pcId) {
        this.pcId = pcId;
    }

    public String getPcName() {
        return pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName == null ? null : pcName.trim();
    }

    public Integer getPbId() {
        return pbId;
    }

    public void setPbId(Integer pbId) {
        this.pbId = pbId;
    }

    public String getPbName() {
        return pbName;
    }

    public void setPbName(String pbName) {
        this.pbName = pbName == null ? null : pbName.trim();
    }

    public BigDecimal getPsWeight() {
        return psWeight;
    }

    public void setPsWeight(BigDecimal psWeight) {
        this.psWeight = psWeight;
    }

    public String getPsWeightunit() {
        return psWeightunit;
    }

    public void setPsWeightunit(String psWeightunit) {
        this.psWeightunit = psWeightunit == null ? null : psWeightunit.trim();
    }

    public String getPsSize() {
        return psSize;
    }

    public void setPsSize(String psSize) {
        this.psSize = psSize == null ? null : psSize.trim();
    }

    public String getPsSizeunit() {
        return psSizeunit;
    }

    public void setPsSizeunit(String psSizeunit) {
        this.psSizeunit = psSizeunit == null ? null : psSizeunit.trim();
    }

    public BigDecimal getPsDia() {
        return psDia;
    }

    public void setPsDia(BigDecimal psDia) {
        this.psDia = psDia;
    }

    public String getPsDiaunit() {
        return psDiaunit;
    }

    public void setPsDiaunit(String psDiaunit) {
        this.psDiaunit = psDiaunit == null ? null : psDiaunit.trim();
    }

    public BigDecimal getPsDensity() {
        return psDensity;
    }

    public void setPsDensity(BigDecimal psDensity) {
        this.psDensity = psDensity;
    }

    public String getPsDensityunit() {
        return psDensityunit;
    }

    public void setPsDensityunit(String psDensityunit) {
        this.psDensityunit = psDensityunit == null ? null : psDensityunit.trim();
    }

	
	public BofDetail() {
		super();
	}

	@Override
	public String toString() {
		return "BofDetail [boId=" + boId + ", boCreatetime=" + boCreatetime + ", boNumber=" + boNumber + ", boState="
				+ boState + ", bodId=" + bodId + ", bodPId=" + bodPId + ", bodType=" + bodType + ", bodCreatetime="
				+ bodCreatetime + ", bodNumber=" + bodNumber + ", bodState=" + bodState + ", sId=" + sId + ", sName="
				+ sName + ", eId=" + eId + ", eName=" + eName + ", pId=" + pId + ", pName=" + pName + ", pcId=" + pcId
				+ ", pcName=" + pcName + ", pbId=" + pbId + ", pbName=" + pbName + ", psWeight=" + psWeight
				+ ", psWeightunit=" + psWeightunit + ", psSize=" + psSize + ", psSizeunit=" + psSizeunit + ", psDia="
				+ psDia + ", psDiaunit=" + psDiaunit + ", psDensity=" + psDensity + ", psDensityunit=" + psDensityunit
				+ ", glName=" + glName + ", fzName=" + fzName + "]";
	}

    
}
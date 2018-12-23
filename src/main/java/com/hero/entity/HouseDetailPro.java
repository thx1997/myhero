package com.hero.entity;

import java.math.BigDecimal;

public class HouseDetailPro {
    private Integer sdSId;

    private Integer sdNumber;

    private Integer sdSspId;

    private Integer sEId;

    private Integer pId;

    private String pName;

    private Integer pcId;

    private String pcName;

    private Integer pbId;

    private String pbName;

    private String puName;

    private Integer psId;

    private BigDecimal psWeight;

    private String weightName;

    private String psSize;

    private String sizeName;

    private BigDecimal psDia;

    private String diaName;

    private BigDecimal psDensity;

    private String densityName;

    private Integer icTopnum;

    private Integer icDownnum;

    private Integer icGoodnum;

    
    public HouseDetailPro() {
		super();
	}

	public HouseDetailPro(Integer sdSId, Integer sdNumber, Integer sdSspId, Integer sEId, Integer pId, String pName,
			Integer pcId, String pcName, Integer pbId, String pbName, String puName, Integer psId, BigDecimal psWeight,
			String weightName, String psSize, String sizeName, BigDecimal psDia, String diaName, BigDecimal psDensity,
			String densityName, Integer icTopnum, Integer icDownnum, Integer icGoodnum) {
		super();
		this.sdSId = sdSId;
		this.sdNumber = sdNumber;
		this.sdSspId = sdSspId;
		this.sEId = sEId;
		this.pId = pId;
		this.pName = pName;
		this.pcId = pcId;
		this.pcName = pcName;
		this.pbId = pbId;
		this.pbName = pbName;
		this.puName = puName;
		this.psId = psId;
		this.psWeight = psWeight;
		this.weightName = weightName;
		this.psSize = psSize;
		this.sizeName = sizeName;
		this.psDia = psDia;
		this.diaName = diaName;
		this.psDensity = psDensity;
		this.densityName = densityName;
		this.icTopnum = icTopnum;
		this.icDownnum = icDownnum;
		this.icGoodnum = icGoodnum;
	}

	public Integer getSdSId() {
        return sdSId;
    }

    public void setSdSId(Integer sdSId) {
        this.sdSId = sdSId;
    }

    public Integer getSdNumber() {
        return sdNumber;
    }

    public void setSdNumber(Integer sdNumber) {
        this.sdNumber = sdNumber;
    }

    public Integer getSdSspId() {
        return sdSspId;
    }

    public void setSdSspId(Integer sdSspId) {
        this.sdSspId = sdSspId;
    }

    public Integer getsEId() {
        return sEId;
    }

    public void setsEId(Integer sEId) {
        this.sEId = sEId;
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

    public String getPuName() {
        return puName;
    }

    public void setPuName(String puName) {
        this.puName = puName == null ? null : puName.trim();
    }

    public Integer getPsId() {
        return psId;
    }

    public void setPsId(Integer psId) {
        this.psId = psId;
    }

    public BigDecimal getPsWeight() {
        return psWeight;
    }

    public void setPsWeight(BigDecimal psWeight) {
        this.psWeight = psWeight;
    }

    public String getWeightName() {
        return weightName;
    }

    public void setWeightName(String weightName) {
        this.weightName = weightName == null ? null : weightName.trim();
    }

    public String getPsSize() {
        return psSize;
    }

    public void setPsSize(String psSize) {
        this.psSize = psSize == null ? null : psSize.trim();
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName == null ? null : sizeName.trim();
    }

    public BigDecimal getPsDia() {
        return psDia;
    }

    public void setPsDia(BigDecimal psDia) {
        this.psDia = psDia;
    }

    public String getDiaName() {
        return diaName;
    }

    public void setDiaName(String diaName) {
        this.diaName = diaName == null ? null : diaName.trim();
    }

    public BigDecimal getPsDensity() {
        return psDensity;
    }

    public void setPsDensity(BigDecimal psDensity) {
        this.psDensity = psDensity;
    }

    public String getDensityName() {
        return densityName;
    }

    public void setDensityName(String densityName) {
        this.densityName = densityName == null ? null : densityName.trim();
    }

    public Integer getIcTopnum() {
        return icTopnum;
    }

    public void setIcTopnum(Integer icTopnum) {
        this.icTopnum = icTopnum;
    }

    public Integer getIcDownnum() {
        return icDownnum;
    }

    public void setIcDownnum(Integer icDownnum) {
        this.icDownnum = icDownnum;
    }

    public Integer getIcGoodnum() {
        return icGoodnum;
    }

    public void setIcGoodnum(Integer icGoodnum) {
        this.icGoodnum = icGoodnum;
    }

	@Override
	public String toString() {
		return "HouseDetailPro [sdSId=" + sdSId + ", sdNumber=" + sdNumber + ", sdSspId=" + sdSspId + ", sEId=" + sEId
				+ ", pId=" + pId + ", pName=" + pName + ", pcId=" + pcId + ", pcName=" + pcName + ", pbId=" + pbId
				+ ", pbName=" + pbName + ", puName=" + puName + ", psId=" + psId + ", psWeight=" + psWeight
				+ ", weightName=" + weightName + ", psSize=" + psSize + ", sizeName=" + sizeName + ", psDia=" + psDia
				+ ", diaName=" + diaName + ", psDensity=" + psDensity + ", densityName=" + densityName + ", icTopnum="
				+ icTopnum + ", icDownnum=" + icDownnum + ", icGoodnum=" + icGoodnum + "]";
	}
    
}
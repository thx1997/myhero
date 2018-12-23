package com.hero.entity;

import java.math.BigDecimal;

public class PurchaseDetailSpec {
    private Integer pdId;

    private String pdPnId;

    private Integer pdShId;
    
    private Integer pdPId;

    private Integer pdPsId;

    private Integer pdQuantity;

    private BigDecimal pdUnitprice;

    private Integer pdSId;

    private BigDecimal pdAmount;
    
    private Integer pdState;
    
    private Integer pId;

    private String pName;

    private String sName;

    private String pcName;

    private String pbName;

    private BigDecimal psWeight;

    private String weightName;

    private String psSize;

    private String sizeName;

    private BigDecimal psDia;

    private String diaName;

    private BigDecimal psDensity;

    private String densityName;
    private String shName;
    
    

    
    
	



	

	public PurchaseDetailSpec(Integer pdId, String pdPnId, Integer pdShId, Integer pdPId, Integer pdPsId,
			Integer pdQuantity, BigDecimal pdUnitprice, Integer pdSId, BigDecimal pdAmount, Integer pdState,
			Integer pId, String pName, String sName, String pcName, String pbName, BigDecimal psWeight,
			String weightName, String psSize, String sizeName, BigDecimal psDia, String diaName, BigDecimal psDensity,
			String densityName, String shName) {
		super();
		this.pdId = pdId;
		this.pdPnId = pdPnId;
		this.pdShId = pdShId;
		this.pdPId = pdPId;
		this.pdPsId = pdPsId;
		this.pdQuantity = pdQuantity;
		this.pdUnitprice = pdUnitprice;
		this.pdSId = pdSId;
		this.pdAmount = pdAmount;
		this.pdState = pdState;
		this.pId = pId;
		this.pName = pName;
		this.sName = sName;
		this.pcName = pcName;
		this.pbName = pbName;
		this.psWeight = psWeight;
		this.weightName = weightName;
		this.psSize = psSize;
		this.sizeName = sizeName;
		this.psDia = psDia;
		this.diaName = diaName;
		this.psDensity = psDensity;
		this.densityName = densityName;
		this.shName = shName;
	}



	public PurchaseDetailSpec() {
		super();
	}



	public Integer getPdId() {
        return pdId;
    }

    public void setPdId(Integer pdId) {
        this.pdId = pdId;
    }

    public String getPdPnId() {
        return pdPnId;
    }

    public void setPdPnId(String pdPnId) {
        this.pdPnId = pdPnId == null ? null : pdPnId.trim();
    }

    public Integer getPdPId() {
        return pdPId;
    }

    public void setPdPId(Integer pdPId) {
        this.pdPId = pdPId;
    }

    public Integer getPdPsId() {
        return pdPsId;
    }

    public void setPdPsId(Integer pdPsId) {
        this.pdPsId = pdPsId;
    }

    public Integer getPdQuantity() {
        return pdQuantity;
    }

    public void setPdQuantity(Integer pdQuantity) {
        this.pdQuantity = pdQuantity;
    }

    public BigDecimal getPdUnitprice() {
        return pdUnitprice;
    }

    public void setPdUnitprice(BigDecimal pdUnitprice) {
        this.pdUnitprice = pdUnitprice;
    }

    public Integer getPdSId() {
        return pdSId;
    }

    public void setPdSId(Integer pdSId) {
        this.pdSId = pdSId;
    }

    public BigDecimal getPdAmount() {
        return pdAmount;
    }

    public void setPdAmount(BigDecimal pdAmount) {
        this.pdAmount = pdAmount;
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

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getPcName() {
        return pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName == null ? null : pcName.trim();
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

    

	public Integer getPdShId() {
		return pdShId;
	}



	public void setPdShId(Integer pdShId) {
		this.pdShId = pdShId;
	}



	public String getShName() {
		return shName;
	}



	public void setShName(String shName) {
		this.shName = shName;
	}



	public Integer getPdState() {
		return pdState;
	}



	public void setPdState(Integer pdState) {
		this.pdState = pdState;
	}



	@Override
	public String toString() {
		return "PurchaseDetailSpec [pdId=" + pdId + ", pdPnId=" + pdPnId + ", pdShId=" + pdShId + ", pdPId=" + pdPId
				+ ", pdPsId=" + pdPsId + ", pdQuantity=" + pdQuantity + ", pdUnitprice=" + pdUnitprice + ", pdSId="
				+ pdSId + ", pdAmount=" + pdAmount + ", pdState=" + pdState + ", pId=" + pId + ", pName=" + pName
				+ ", sName=" + sName + ", pcName=" + pcName + ", pbName=" + pbName + ", psWeight=" + psWeight
				+ ", weightName=" + weightName + ", psSize=" + psSize + ", sizeName=" + sizeName + ", psDia=" + psDia
				+ ", diaName=" + diaName + ", psDensity=" + psDensity + ", densityName=" + densityName + ", shName="
				+ shName + "]";
	}





	

	
    
    
}
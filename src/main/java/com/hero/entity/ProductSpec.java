package com.hero.entity;

import java.math.BigDecimal;

public class ProductSpec {
    private Integer psId;

    private Integer psPId;

    private BigDecimal psWeight;

    private Integer psWeightunit;

    private String psSize;

    private Integer psSizeunit;

    private BigDecimal psDia;

    private Integer psDiaunit;

    private BigDecimal psDensity;

    private Integer psDensityunit;

    private String psRemark;

    public Integer getPsId() {
        return psId;
    }

    public void setPsId(Integer psId) {
        this.psId = psId;
    }

    public Integer getPsPId() {
        return psPId;
    }

    public void setPsPId(Integer psPId) {
        this.psPId = psPId;
    }

    public BigDecimal getPsWeight() {
        return psWeight;
    }

    public void setPsWeight(BigDecimal psWeight) {
        this.psWeight = psWeight;
    }

    public Integer getPsWeightunit() {
        return psWeightunit;
    }

    public void setPsWeightunit(Integer psWeightunit) {
        this.psWeightunit = psWeightunit;
    }

    public String getPsSize() {
        return psSize;
    }

    public void setPsSize(String psSize) {
        this.psSize = psSize == null ? null : psSize.trim();
    }

    public Integer getPsSizeunit() {
        return psSizeunit;
    }

    public void setPsSizeunit(Integer psSizeunit) {
        this.psSizeunit = psSizeunit;
    }

    public BigDecimal getPsDia() {
        return psDia;
    }

    public void setPsDia(BigDecimal psDia) {
        this.psDia = psDia;
    }

    public Integer getPsDiaunit() {
        return psDiaunit;
    }

    public void setPsDiaunit(Integer psDiaunit) {
        this.psDiaunit = psDiaunit;
    }

    public BigDecimal getPsDensity() {
        return psDensity;
    }

    public void setPsDensity(BigDecimal psDensity) {
        this.psDensity = psDensity;
    }

    public Integer getPsDensityunit() {
        return psDensityunit;
    }

    public void setPsDensityunit(Integer psDensityunit) {
        this.psDensityunit = psDensityunit;
    }

    public String getPsRemark() {
        return psRemark;
    }

    public void setPsRemark(String psRemark) {
        this.psRemark = psRemark == null ? null : psRemark.trim();
    }

	public ProductSpec(Integer psId, Integer psPId, BigDecimal psWeight, Integer psWeightunit, String psSize,
			Integer psSizeunit, BigDecimal psDia, Integer psDiaunit, BigDecimal psDensity, Integer psDensityunit,
			String psRemark) {
		super();
		this.psId = psId;
		this.psPId = psPId;
		this.psWeight = psWeight;
		this.psWeightunit = psWeightunit;
		this.psSize = psSize;
		this.psSizeunit = psSizeunit;
		this.psDia = psDia;
		this.psDiaunit = psDiaunit;
		this.psDensity = psDensity;
		this.psDensityunit = psDensityunit;
		this.psRemark = psRemark;
	}

	public ProductSpec() {
		super();
	}

	@Override
	public String toString() {
		return "ProductSpec [psId=" + psId + ", psPId=" + psPId + ", psWeight=" + psWeight + ", psWeightunit="
				+ psWeightunit + ", psSize=" + psSize + ", psSizeunit=" + psSizeunit + ", psDia=" + psDia
				+ ", psDiaunit=" + psDiaunit + ", psDensity=" + psDensity + ", psDensityunit=" + psDensityunit
				+ ", psRemark=" + psRemark + "]";
	}
    
}
package com.hero.entity;

import java.math.BigDecimal;

public class ProductSpec {
    private Integer psId;

    private Integer psPId;

    private BigDecimal psWeight;

    private String psWeightunit;

    private BigDecimal psSize;

    private String psSizeunit;

    private BigDecimal psDia;

    private String psDiaunit;

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

    public String getPsWeightunit() {
        return psWeightunit;
    }

    public void setPsWeightunit(String psWeightunit) {
        this.psWeightunit = psWeightunit == null ? null : psWeightunit.trim();
    }

    public BigDecimal getPsSize() {
        return psSize;
    }

    public void setPsSize(BigDecimal psSize) {
        this.psSize = psSize;
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

	public ProductSpec(Integer psId, Integer psPId, BigDecimal psWeight, String psWeightunit, BigDecimal psSize,
			String psSizeunit, BigDecimal psDia, String psDiaunit, BigDecimal psDensity, Integer psDensityunit,
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
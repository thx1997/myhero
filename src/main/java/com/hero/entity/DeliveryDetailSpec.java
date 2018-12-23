package com.hero.entity;

import java.math.BigDecimal;

public class DeliveryDetailSpec {
    private Integer ddId;

    private String ddDnId;

    private Integer ddShId;

    private Integer ddPId;

    private Integer ddQuantity;

    private BigDecimal ddUnitprice;

    private BigDecimal ddAmount;

    private BigDecimal ddRoyalty;

    private String ddRemark;

    private Integer ddState;

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

    public Integer getDdId() {
        return ddId;
    }

    public void setDdId(Integer ddId) {
        this.ddId = ddId;
    }

    public String getDdDnId() {
        return ddDnId;
    }

    public void setDdDnId(String ddDnId) {
        this.ddDnId = ddDnId == null ? null : ddDnId.trim();
    }

    public Integer getDdShId() {
        return ddShId;
    }

    public void setDdShId(Integer ddShId) {
        this.ddShId = ddShId;
    }

    public Integer getDdPId() {
        return ddPId;
    }

    public void setDdPId(Integer ddPId) {
        this.ddPId = ddPId;
    }

    public Integer getDdQuantity() {
        return ddQuantity;
    }

    public void setDdQuantity(Integer ddQuantity) {
        this.ddQuantity = ddQuantity;
    }

    public BigDecimal getDdUnitprice() {
        return ddUnitprice;
    }

    public void setDdUnitprice(BigDecimal ddUnitprice) {
        this.ddUnitprice = ddUnitprice;
    }

    public BigDecimal getDdAmount() {
        return ddAmount;
    }

    public void setDdAmount(BigDecimal ddAmount) {
        this.ddAmount = ddAmount;
    }

    public BigDecimal getDdRoyalty() {
        return ddRoyalty;
    }

    public void setDdRoyalty(BigDecimal ddRoyalty) {
        this.ddRoyalty = ddRoyalty;
    }

    public String getDdRemark() {
        return ddRemark;
    }

    public void setDdRemark(String ddRemark) {
        this.ddRemark = ddRemark == null ? null : ddRemark.trim();
    }

    public Integer getDdState() {
        return ddState;
    }

    public void setDdState(Integer ddState) {
        this.ddState = ddState;
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

    public String getShName() {
        return shName;
    }

    public void setShName(String shName) {
        this.shName = shName == null ? null : shName.trim();
    }
}
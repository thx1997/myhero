package com.hero.entity;

import java.math.BigDecimal;

public class DeliveryDetail {
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
    
	public DeliveryDetail(Integer ddId, String ddDnId, Integer ddShId, Integer ddPId, Integer ddQuantity,
			BigDecimal ddUnitprice, BigDecimal ddAmount, BigDecimal ddRoyalty, String ddRemark, Integer ddState) {
		super();
		this.ddId = ddId;
		this.ddDnId = ddDnId;
		this.ddShId = ddShId;
		this.ddPId = ddPId;
		this.ddQuantity = ddQuantity;
		this.ddUnitprice = ddUnitprice;
		this.ddAmount = ddAmount;
		this.ddRoyalty = ddRoyalty;
		this.ddRemark = ddRemark;
		this.ddState = ddState;
	}

	public DeliveryDetail() {
		super();
	}

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

	public Integer getDdShId() {
		return ddShId;
	}

	public void setDdShId(Integer ddShId) {
		this.ddShId = ddShId;
	}

	public Integer getDdState() {
		return ddState;
	}

	public void setDdState(Integer ddState) {
		this.ddState = ddState;
	}

	@Override
	public String toString() {
		return "DeliveryDetail [ddId=" + ddId + ", ddDnId=" + ddDnId + ", ddShId=" + ddShId + ", ddPId=" + ddPId
				+ ", ddQuantity=" + ddQuantity + ", ddUnitprice=" + ddUnitprice + ", ddAmount=" + ddAmount
				+ ", ddRoyalty=" + ddRoyalty + ", ddRemark=" + ddRemark + ", ddState=" + ddState + "]";
	}
    
}
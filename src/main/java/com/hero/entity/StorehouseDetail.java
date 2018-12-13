package com.hero.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class StorehouseDetail {
    private Integer sdId;

    private Integer sdSId;

    private Integer sdPId;

    private Integer sdSspId;

    private Integer sdNumber;

    private Date sdUpdatetime;

    private String sdRemark;
    @JsonUnwrapped
    private  Product product;
    
    public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getSdId() {
        return sdId;
    }

    public void setSdId(Integer sdId) {
        this.sdId = sdId;
    }

    public Integer getSdSId() {
        return sdSId;
    }

    public void setSdSId(Integer sdSId) {
        this.sdSId = sdSId;
    }

    public Integer getSdPId() {
        return sdPId;
    }

    public void setSdPId(Integer sdPId) {
        this.sdPId = sdPId;
    }

    public Integer getSdSspId() {
        return sdSspId;
    }

    public void setSdSspId(Integer sdSspId) {
        this.sdSspId = sdSspId;
    }

    public Integer getSdNumber() {
        return sdNumber;
    }

    public void setSdNumber(Integer sdNumber) {
        this.sdNumber = sdNumber;
    }

    public Date getSdUpdatetime() {
        return sdUpdatetime;
    }

    public void setSdUpdatetime(Date sdUpdatetime) {
        this.sdUpdatetime = sdUpdatetime;
    }

    public String getSdRemark() {
        return sdRemark;
    }

    public void setSdRemark(String sdRemark) {
        this.sdRemark = sdRemark == null ? null : sdRemark.trim();
    }

	public StorehouseDetail(Integer sdId, Integer sdSId, Integer sdPId, Integer sdSspId, Integer sdNumber,
			Date sdUpdatetime, String sdRemark) {
		super();
		this.sdId = sdId;
		this.sdSId = sdSId;
		this.sdPId = sdPId;
		this.sdSspId = sdSspId;
		this.sdNumber = sdNumber;
		this.sdUpdatetime = sdUpdatetime;
		this.sdRemark = sdRemark;
	}

	public StorehouseDetail() {
		super();
	}

	@Override
	public String toString() {
		return "StorehouseDetail [sdId=" + sdId + ", sdSId=" + sdSId + ", sdPId=" + sdPId + ", sdSspId=" + sdSspId
				+ ", sdNumber=" + sdNumber + ", sdUpdatetime=" + sdUpdatetime + ", sdRemark=" + sdRemark + ", product="
				+ product + "]";
	}
	
    
}
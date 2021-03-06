package com.hero.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.hero.excel.PoiHandler;

public class Product {
    private Integer pId;

    private String pName;

    private Integer pPsId;

    private Integer pPcId;

    private Integer pPbId;

    private BigDecimal pSalemoney;

    private BigDecimal pOyaltyrate;

    private Boolean pState;
    @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
    private Date pCreatetime;
    @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
    private Date pUpdatetime;

    private String pRemark;

    @JsonUnwrapped//rfy
    private ProductCategory category;//商品类别
    
    @JsonUnwrapped//rfy
    private ProductBrand brand;//商品品牌
    
    @JsonUnwrapped//rfy
    private ProductUnit unit;//商品单位
    public Product() {
		super();
	}





	public Product(Integer pId, String pName, Integer pPsId, Integer pPcId, Integer pPbId, BigDecimal pSalemoney,
			BigDecimal pOyaltyrate, Boolean pState, Date pCreatetime, Date pUpdatetime, String pRemark,
			ProductCategory category, ProductBrand brand, ProductUnit unit) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPsId = pPsId;
		this.pPcId = pPcId;
		this.pPbId = pPbId;
		this.pSalemoney = pSalemoney;
		this.pOyaltyrate = pOyaltyrate;
		this.pState = pState;
		this.pCreatetime = pCreatetime;
		this.pUpdatetime = pUpdatetime;
		this.pRemark = pRemark;
		this.category = category;
		this.brand = brand;
		this.unit = unit;
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

    public Integer getpPsId() {
        return pPsId;
    }

    public void setpPsId(Integer pPsId) {
        this.pPsId = pPsId;
    }

    public Integer getpPcId() {
        return pPcId;
    }

    public void setpPcId(Integer pPcId) {
        this.pPcId = pPcId;
    }

    public Integer getpPbId() {
        return pPbId;
    }

    public void setpPbId(Integer pPbId) {
        this.pPbId = pPbId;
    }

    public BigDecimal getpSalemoney() {
        return pSalemoney;
    }

    public void setpSalemoney(BigDecimal pSalemoney) {
        this.pSalemoney = pSalemoney;
    }

    public BigDecimal getpOyaltyrate() {
        return pOyaltyrate;
    }

    public void setpOyaltyrate(BigDecimal pOyaltyrate) {
        this.pOyaltyrate = pOyaltyrate;
    }

    public Boolean getpState() {
        return pState;
    }

    public void setpState(Boolean pState) {
        this.pState = pState;
    }

    public Date getpCreatetime() {
        return pCreatetime;
    }

    public void setpCreatetime(Date pCreatetime) {
        this.pCreatetime = pCreatetime;
    }

    public Date getpUpdatetime() {
        return pUpdatetime;
    }

    public void setpUpdatetime(Date pUpdatetime) {
        this.pUpdatetime = pUpdatetime;
    }

    public String getpRemark() {
        return pRemark;
    }

    public void setpRemark(String pRemark) {
        this.pRemark = pRemark == null ? null : pRemark.trim();
    }



	public ProductCategory getCategory() {
		return category;
	}



	public void setCategory(ProductCategory category) {
		this.category = category;
	}



	public ProductBrand getBrand() {
		return brand;
	}



	public void setBrand(ProductBrand brand) {
		this.brand = brand;
	}



	public ProductUnit getUnit() {
		return unit;
	}





	public void setUnit(ProductUnit unit) {
		this.unit = unit;
	}





	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPsId=" + pPsId + ", pPcId=" + pPcId + ", pPbId=" + pPbId
				+ ", pSalemoney=" + pSalemoney + ", pOyaltyrate=" + pOyaltyrate + ", pState=" + pState
				+ ", pCreatetime=" + pCreatetime + ", pUpdatetime=" + pUpdatetime + ", pRemark=" + pRemark
				+ ", category=" + category + ", brand=" + brand + ", unit=" + unit + "]";
	}








	

	
}
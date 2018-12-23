package com.hero.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class PurchaseDetail {
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
    
    @JsonUnwrapped//rfy
    private Product product;
    @JsonUnwrapped//rfy
    private SupplierOrCustomer supplier;
    @JsonUnwrapped//rfy
    private ProductSpec productspec;
	
	
	
	

	public PurchaseDetail(Integer pdId, String pdPnId, Integer pdShId, Integer pdPId, Integer pdPsId,
			Integer pdQuantity, BigDecimal pdUnitprice, Integer pdSId, BigDecimal pdAmount, Integer pdState,
			Product product, SupplierOrCustomer supplier, ProductSpec productspec) {
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
		this.product = product;
		this.supplier = supplier;
		this.productspec = productspec;
	}






	public PurchaseDetail() {
		super();
	}

	
	

	
	
	public PurchaseDetail(Integer pdId, String pdPnId, Integer pdShId, Integer pdPId, Integer pdPsId,
			Integer pdQuantity, BigDecimal pdUnitprice, Integer pdSId, BigDecimal pdAmount, Product product,
			SupplierOrCustomer supplier, ProductSpec productspec) {
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
		this.product = product;
		this.supplier = supplier;
		this.productspec = productspec;
	}






	public SupplierOrCustomer getSupplier() {
		return supplier;
	}

	public void setSupplier(SupplierOrCustomer supplier) {
		this.supplier = supplier;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
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

	public Integer getPdPsId() {
		return pdPsId;
	}

	public void setPdPsId(Integer pdPsId) {
		this.pdPsId = pdPsId;
	}






	public Integer getPdShId() {
		return pdShId;
	}






	public void setPdShId(Integer pdShId) {
		this.pdShId = pdShId;
	}






	public ProductSpec getProductspec() {
		return productspec;
	}






	public void setProductspec(ProductSpec productspec) {
		this.productspec = productspec;
	}






	public Integer getPdState() {
		return pdState;
	}






	public void setPdState(Integer pdState) {
		this.pdState = pdState;
	}






	@Override
	public String toString() {
		return "PurchaseDetail [pdId=" + pdId + ", pdPnId=" + pdPnId + ", pdShId=" + pdShId + ", pdPId=" + pdPId
				+ ", pdPsId=" + pdPsId + ", pdQuantity=" + pdQuantity + ", pdUnitprice=" + pdUnitprice + ", pdSId="
				+ pdSId + ", pdAmount=" + pdAmount + ", pdState=" + pdState + ", product=" + product + ", supplier="
				+ supplier + ", productspec=" + productspec + "]";
	}
    
    
}
package com.hero.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ProductCommodity{
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
	
	
	
	private Integer pcId;//类别编号
	private String pcName;//类别名称
	private Integer pbId;//品牌编号
	private String pbName;//品牌名称
	private Integer puId;//单位编号
	private String puName;//单位名称
	private Integer spId;//供货商商品编号
	private Integer sId;//供应商编号
	private String sName;//供应商名称
	
	private Integer scId;//供货商类别编号
	private String scName;//供货商类别名称
	private Integer scType;//类别的类型
	
	private Integer psId;//规格id
	private BigDecimal psWeight;//重量
	private Integer weightId;//重量单位编号
	private String weightName;//重量单位
	private String psSize;//大小
	private Integer sizeId;//大小单位编号
	private String sizeName;//大小单位
	private BigDecimal psDia;//直径
	private Integer diaId;//直径单位编号
	private String diaName;//直径单位
	private BigDecimal psDensity;//密度
	private Integer densityId;//密度单位编号
	private String densityName;//密度单位
	
	
	
	
	
	
	public ProductCommodity(Integer pId, String pName, Integer pPsId, Integer pPcId, Integer pPbId,
			BigDecimal pSalemoney, BigDecimal pOyaltyrate, Boolean pState, Date pCreatetime, Date pUpdatetime,
			String pRemark, Integer pcId, String pcName, Integer pbId, String pbName, Integer puId, String puName,
			Integer sId, String sName, Integer scId, String scName, Integer scType, Integer psId, BigDecimal psWeight,
			Integer weightId, String weightName, String psSize, Integer sizeId, String sizeName, BigDecimal psDia,
			Integer diaId, String diaName, BigDecimal psDensity, Integer densityId, String densityName) {
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
		this.pcId = pcId;
		this.pcName = pcName;
		this.pbId = pbId;
		this.pbName = pbName;
		this.puId = puId;
		this.puName = puName;
		this.sId = sId;
		this.sName = sName;
		this.scId = scId;
		this.scName = scName;
		this.scType = scType;
		this.psId = psId;
		this.psWeight = psWeight;
		this.weightId = weightId;
		this.weightName = weightName;
		this.psSize = psSize;
		this.sizeId = sizeId;
		this.sizeName = sizeName;
		this.psDia = psDia;
		this.diaId = diaId;
		this.diaName = diaName;
		this.psDensity = psDensity;
		this.densityId = densityId;
		this.densityName = densityName;
	}
	public ProductCommodity() {
		super();
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
		this.pName = pName;
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
		this.pRemark = pRemark;
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
		this.pcName = pcName;
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
		this.pbName = pbName;
	}
	public String getPuName() {
		return puName;
	}
	public void setPuName(String puName) {
		this.puName = puName;
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
		this.sName = sName;
	}
	public Integer getScId() {
		return scId;
	}
	public void setScId(Integer scId) {
		this.scId = scId;
	}
	public String getScName() {
		return scName;
	}
	public void setScName(String scName) {
		this.scName = scName;
	}
	public Integer getScType() {
		return scType;
	}
	public void setScType(Integer scType) {
		this.scType = scType;
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
		this.weightName = weightName;
	}
	public String getPsSize() {
		return psSize;
	}
	public void setPsSize(String psSize) {
		this.psSize = psSize;
	}
	public String getSizeName() {
		return sizeName;
	}
	public void setSizeName(String sizeName) {
		this.sizeName = sizeName;
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
		this.diaName = diaName;
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
		this.densityName = densityName;
	}
	public Integer getPuId() {
		return puId;
	}
	public void setPuId(Integer puId) {
		this.puId = puId;
	}
	public Integer getWeightId() {
		return weightId;
	}
	public void setWeightId(Integer weightId) {
		this.weightId = weightId;
	}
	public Integer getSizeId() {
		return sizeId;
	}
	public void setSizeId(Integer sizeId) {
		this.sizeId = sizeId;
	}
	public Integer getDiaId() {
		return diaId;
	}
	public void setDiaId(Integer diaId) {
		this.diaId = diaId;
	}
	public Integer getDensityId() {
		return densityId;
	}
	public void setDensityId(Integer densityId) {
		this.densityId = densityId;
	}
	@Override
	public String toString() {
		return "ProductCommodity [pId=" + pId + ", pName=" + pName + ", pPsId=" + pPsId + ", pPcId=" + pPcId
				+ ", pPbId=" + pPbId + ", pSalemoney=" + pSalemoney + ", pOyaltyrate=" + pOyaltyrate + ", pState="
				+ pState + ", pCreatetime=" + pCreatetime + ", pUpdatetime=" + pUpdatetime + ", pRemark=" + pRemark
				+ ", pcId=" + pcId + ", pcName=" + pcName + ", pbId=" + pbId + ", pbName=" + pbName + ", puId=" + puId
				+ ", puName=" + puName + ", sId=" + sId + ", sName=" + sName + ", scId=" + scId + ", scName=" + scName
				+ ", scType=" + scType + ", psId=" + psId + ", psWeight=" + psWeight + ", weightId=" + weightId
				+ ", weightName=" + weightName + ", psSize=" + psSize + ", sizeId=" + sizeId + ", sizeName=" + sizeName
				+ ", psDia=" + psDia + ", diaId=" + diaId + ", diaName=" + diaName + ", psDensity=" + psDensity
				+ ", densityId=" + densityId + ", densityName=" + densityName + "]";
	}
	
	
	
	
	
}

package com.hero.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ProductCommodity{

	private Integer pId;//商品编号
	private String pName;//商品名称
	private Integer pState;//商品状态
	@JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
    private Date pCreatetime;//创建时间
	private Integer pcId;//类别编号
	private String pcName;//类别名称
	private Integer pbId;//品牌编号
	private String pbName;//品牌名称
	private String puName;//单位名称
	private Integer sId;//供应商编号
	private String sName;//供应商名称
	
	private Integer scId;//供货商类别编号
	private String scName;//供货商类别名称
	private Integer scType;//类别的类型
	
	private Integer psId;//规格id
	private BigDecimal psWeight;//重量
	private String weightName;//重量单位
	private String psSize;//大小
	private String sizeName;//大小单位
	private BigDecimal psDia;//直径
	private String diaName;//直径单位
	private BigDecimal psDensity;//密度
	private String densityName;//密度单位
	
	
	
	public ProductCommodity(Integer pId, String pName, Integer pState, Integer pcId, String pcName, Integer pbId,
			String pbName, String puName, Integer sId, String sName, Integer scId, String scName, Integer scType,
			Integer psId, BigDecimal psWeight, String weightName, String psSize, String sizeName, BigDecimal psDia,
			String diaName, BigDecimal psDensity, String densityName) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pState = pState;
		this.pcId = pcId;
		this.pcName = pcName;
		this.pbId = pbId;
		this.pbName = pbName;
		this.puName = puName;
		this.sId = sId;
		this.sName = sName;
		this.scId = scId;
		this.scName = scName;
		this.scType = scType;
		this.psId = psId;
		this.psWeight = psWeight;
		this.weightName = weightName;
		this.psSize = psSize;
		this.sizeName = sizeName;
		this.psDia = psDia;
		this.diaName = diaName;
		this.psDensity = psDensity;
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
	public Integer getpState() {
		return pState;
	}
	public void setpState(Integer pState) {
		this.pState = pState;
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
	@Override
	public String toString() {
		return "ProductCommodity [pId=" + pId + ", pName=" + pName + ", pState=" + pState + ", pcId=" + pcId
				+ ", pcName=" + pcName + ", pbId=" + pbId + ", pbName=" + pbName + ", puName=" + puName + ", sId=" + sId
				+ ", sName=" + sName + ", scId=" + scId + ", scName=" + scName + ", scType=" + scType + ", psId=" + psId
				+ ", psWeight=" + psWeight + ", weightName=" + weightName + ", psSize=" + psSize + ", sizeName="
				+ sizeName + ", psDia=" + psDia + ", diaName=" + diaName + ", psDensity=" + psDensity + ", densityName="
				+ densityName + "]";
	}
	
	
	
	
}

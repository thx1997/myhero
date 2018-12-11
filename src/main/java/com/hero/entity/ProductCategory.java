package com.hero.entity;

import java.util.Date;
import java.util.List;

public class ProductCategory {
    private Integer pcId;

    private String pcName;

    private Integer pcParentid;

    private Date pcCreatetime;

    private Long pcUpdatetime;

    private String pcRemark;

    private List<ProductCategory> children;
   	public Boolean checked;
    public ProductCategory() {
		super();
	}

	

	public ProductCategory(Integer pcId, String pcName, Integer pcParentid, Date pcCreatetime, Long pcUpdatetime,
			String pcRemark) {
		super();
		this.pcId = pcId;
		this.pcName = pcName;
		this.pcParentid = pcParentid;
		this.pcCreatetime = pcCreatetime;
		this.pcUpdatetime = pcUpdatetime;
		this.pcRemark = pcRemark;
	}

	public ProductCategory(Integer pcId, String pcName, Integer pcParentid, Date pcCreatetime, Long pcUpdatetime,
			String pcRemark, List<ProductCategory> children, Boolean checked) {
		super();
		this.pcId = pcId;
		this.pcName = pcName;
		this.pcParentid = pcParentid;
		this.pcCreatetime = pcCreatetime;
		this.pcUpdatetime = pcUpdatetime;
		this.pcRemark = pcRemark;
		this.children = children;
		this.checked = checked;
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
        this.pcName = pcName == null ? null : pcName.trim();
    }

    public Integer getPcParentid() {
        return pcParentid;
    }

    public void setPcParentid(Integer pcParentid) {
        this.pcParentid = pcParentid;
    }

    public Date getPcCreatetime() {
        return pcCreatetime;
    }

    public void setPcCreatetime(Date pcCreatetime) {
        this.pcCreatetime = pcCreatetime;
    }

    public Long getPcUpdatetime() {
        return pcUpdatetime;
    }

    public void setPcUpdatetime(Long pcUpdatetime) {
        this.pcUpdatetime = pcUpdatetime;
    }

    public String getPcRemark() {
        return pcRemark;
    }

    public void setPcRemark(String pcRemark) {
        this.pcRemark = pcRemark == null ? null : pcRemark.trim();
    }



	public List<ProductCategory> getChildren() {
		return children;
	}



	public void setChildren(List<ProductCategory> children) {
		this.children = children;
	}



	public Boolean getChecked() {
		return checked;
	}



	public void setChecked(Boolean checked) {
		this.checked = checked;
	}



	@Override
	public String toString() {
		return "ProductCategory [pcId=" + pcId + ", pcName=" + pcName + ", pcParentid=" + pcParentid + ", pcCreatetime="
				+ pcCreatetime + ", pcUpdatetime=" + pcUpdatetime + ", pcRemark=" + pcRemark + ", children=" + children
				+ ", checked=" + checked + "]";
	}
    
    
}
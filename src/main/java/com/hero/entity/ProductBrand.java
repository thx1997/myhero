package com.hero.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hero.entity.query.QueryBase;

public class ProductBrand extends QueryBase{
    private Integer pbId;

    private String pbName;
    @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd HH:mm:ss")
    private Date pbCreatetime;
    @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd HH:mm:ss")
    private Date pbUpdatetime;

    private String pbRemark;

    public ProductBrand() {
		super();
	}

	@Override
	public String toString() {
		return "ProductBrand [pbId=" + pbId + ", pbName=" + pbName + ", pbCreatetime=" + pbCreatetime
				+ ", pbUpdatetime=" + pbUpdatetime + ", pbRemark=" + pbRemark + "]";
	}

	public ProductBrand(Integer pbId, String pbName, Date pbCreatetime, Date pbUpdatetime, String pbRemark) {
		super();
		this.pbId = pbId;
		this.pbName = pbName;
		this.pbCreatetime = pbCreatetime;
		this.pbUpdatetime = pbUpdatetime;
		this.pbRemark = pbRemark;
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
        this.pbName = pbName == null ? null : pbName.trim();
    }

    public Date getPbCreatetime() {
        return pbCreatetime;
    }

    public void setPbCreatetime(Date pbCreatetime) {
        this.pbCreatetime = pbCreatetime;
    }

    public Date getPbUpdatetime() {
        return pbUpdatetime;
    }

    public void setPbUpdatetime(Date pbUpdatetime) {
        this.pbUpdatetime = pbUpdatetime;
    }

    public String getPbRemark() {
        return pbRemark;
    }

    public void setPbRemark(String pbRemark) {
        this.pbRemark = pbRemark == null ? null : pbRemark.trim();
    }
}
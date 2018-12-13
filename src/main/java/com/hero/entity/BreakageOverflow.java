package com.hero.entity;

import java.util.Date;

public class BreakageOverflow {
    private Integer boId;

    private Integer boEId;

    private Date boCreatetime;

    private Integer boNumber;

    private String boRemark;

    public Integer getBoId() {
        return boId;
    }

    public void setBoId(Integer boId) {
        this.boId = boId;
    }

    public Integer getBoEId() {
        return boEId;
    }

    public void setBoEId(Integer boEId) {
        this.boEId = boEId;
    }

    public Date getBoCreatetime() {
        return boCreatetime;
    }

    public void setBoCreatetime(Date boCreatetime) {
        this.boCreatetime = boCreatetime;
    }

    public Integer getBoNumber() {
        return boNumber;
    }

    public void setBoNumber(Integer boNumber) {
        this.boNumber = boNumber;
    }

    public String getBoRemark() {
        return boRemark;
    }

    public void setBoRemark(String boRemark) {
        this.boRemark = boRemark == null ? null : boRemark.trim();
    }
}
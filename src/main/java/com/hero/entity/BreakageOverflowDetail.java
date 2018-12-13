package com.hero.entity;

import java.util.Date;

public class BreakageOverflowDetail {
    private Integer bodId;

    private Integer bodPId;

    private Integer bodBoId;

    private Boolean bodType;

    private Integer bodSId;

    private Date bodCreatetime;

    private Integer bodNumber;

    private String bodRemark;

    public Integer getBodId() {
        return bodId;
    }

    public void setBodId(Integer bodId) {
        this.bodId = bodId;
    }

    public Integer getBodPId() {
        return bodPId;
    }

    public void setBodPId(Integer bodPId) {
        this.bodPId = bodPId;
    }

    public Integer getBodBoId() {
        return bodBoId;
    }

    public void setBodBoId(Integer bodBoId) {
        this.bodBoId = bodBoId;
    }

    public Boolean getBodType() {
        return bodType;
    }

    public void setBodType(Boolean bodType) {
        this.bodType = bodType;
    }

    public Integer getBodSId() {
        return bodSId;
    }

    public void setBodSId(Integer bodSId) {
        this.bodSId = bodSId;
    }

    public Date getBodCreatetime() {
        return bodCreatetime;
    }

    public void setBodCreatetime(Date bodCreatetime) {
        this.bodCreatetime = bodCreatetime;
    }

    public Integer getBodNumber() {
        return bodNumber;
    }

    public void setBodNumber(Integer bodNumber) {
        this.bodNumber = bodNumber;
    }

    public String getBodRemark() {
        return bodRemark;
    }

    public void setBodRemark(String bodRemark) {
        this.bodRemark = bodRemark == null ? null : bodRemark.trim();
    }
}
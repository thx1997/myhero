package com.hero.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.hero.entity.query.QueryBase;

public class DeliverynoteDetail extends QueryBase{
    private String dnId;

    private Date dnCreatetime;

    private Integer dnCId;

    private Integer dnEId;

    private Integer dnStatus;

    private Integer dnAccountantid;

    private Integer dnWarehousepersonid;

    private Integer dnSalesmanid;

    private BigDecimal dnTotalmoney;

    private String dnRemark;

    private String notePerson;

    private String accountantPerson;

    private String warehousePerson;

    private String salePerson;

    private String sName;

    public String getDnId() {
        return dnId;
    }

    public void setDnId(String dnId) {
        this.dnId = dnId == null ? null : dnId.trim();
    }

    public Date getDnCreatetime() {
        return dnCreatetime;
    }

    public void setDnCreatetime(Date dnCreatetime) {
        this.dnCreatetime = dnCreatetime;
    }

    public Integer getDnCId() {
        return dnCId;
    }

    public void setDnCId(Integer dnCId) {
        this.dnCId = dnCId;
    }

    public Integer getDnEId() {
        return dnEId;
    }

    public void setDnEId(Integer dnEId) {
        this.dnEId = dnEId;
    }

    public Integer getDnStatus() {
        return dnStatus;
    }

    public void setDnStatus(Integer dnStatus) {
        this.dnStatus = dnStatus;
    }

    public Integer getDnAccountantid() {
        return dnAccountantid;
    }

    public void setDnAccountantid(Integer dnAccountantid) {
        this.dnAccountantid = dnAccountantid;
    }

    public Integer getDnWarehousepersonid() {
        return dnWarehousepersonid;
    }

    public void setDnWarehousepersonid(Integer dnWarehousepersonid) {
        this.dnWarehousepersonid = dnWarehousepersonid;
    }

    public Integer getDnSalesmanid() {
        return dnSalesmanid;
    }

    public void setDnSalesmanid(Integer dnSalesmanid) {
        this.dnSalesmanid = dnSalesmanid;
    }

    public BigDecimal getDnTotalmoney() {
        return dnTotalmoney;
    }

    public void setDnTotalmoney(BigDecimal dnTotalmoney) {
        this.dnTotalmoney = dnTotalmoney;
    }

    public String getDnRemark() {
        return dnRemark;
    }

    public void setDnRemark(String dnRemark) {
        this.dnRemark = dnRemark == null ? null : dnRemark.trim();
    }

    public String getNotePerson() {
        return notePerson;
    }

    public void setNotePerson(String notePerson) {
        this.notePerson = notePerson == null ? null : notePerson.trim();
    }

    public String getAccountantPerson() {
        return accountantPerson;
    }

    public void setAccountantPerson(String accountantPerson) {
        this.accountantPerson = accountantPerson == null ? null : accountantPerson.trim();
    }

    public String getWarehousePerson() {
        return warehousePerson;
    }

    public void setWarehousePerson(String warehousePerson) {
        this.warehousePerson = warehousePerson == null ? null : warehousePerson.trim();
    }

    public String getSalePerson() {
        return salePerson;
    }

    public void setSalePerson(String salePerson) {
        this.salePerson = salePerson == null ? null : salePerson.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }
}
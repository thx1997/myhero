package com.hero.entity;

import java.math.BigDecimal;
import java.util.Date;

import com.hero.entity.query.QueryBase;

public class PurchasenoteDetail extends QueryBase{
    private String pnId;

    private Date pnCreatetime;

    private Integer pnEId;

    private Integer pnStatus;

    private Integer pnAccountantid;

    private Integer pnWarehousepersonid;

    private BigDecimal pnTotalmoney;

    private String pnRemark;

    private String notePerson;

    private String accountantPerson;

    private String warehousePerson;

    
    public PurchasenoteDetail(String pnId, Date pnCreatetime, Integer pnEId, Integer pnStatus, Integer pnAccountantid,
			Integer pnWarehousepersonid, BigDecimal pnTotalmoney, String pnRemark, String notePerson,
			String accountantPerson, String warehousePerson) {
		super();
		this.pnId = pnId;
		this.pnCreatetime = pnCreatetime;
		this.pnEId = pnEId;
		this.pnStatus = pnStatus;
		this.pnAccountantid = pnAccountantid;
		this.pnWarehousepersonid = pnWarehousepersonid;
		this.pnTotalmoney = pnTotalmoney;
		this.pnRemark = pnRemark;
		this.notePerson = notePerson;
		this.accountantPerson = accountantPerson;
		this.warehousePerson = warehousePerson;
	}

	public PurchasenoteDetail() {
		super();
	}

	public String getPnId() {
        return pnId;
    }

    public void setPnId(String pnId) {
        this.pnId = pnId == null ? null : pnId.trim();
    }

    public Date getPnCreatetime() {
        return pnCreatetime;
    }

    public void setPnCreatetime(Date pnCreatetime) {
        this.pnCreatetime = pnCreatetime;
    }

    public Integer getPnEId() {
        return pnEId;
    }

    public void setPnEId(Integer pnEId) {
        this.pnEId = pnEId;
    }

    public Integer getPnStatus() {
        return pnStatus;
    }

    public void setPnStatus(Integer pnStatus) {
        this.pnStatus = pnStatus;
    }

    public Integer getPnAccountantid() {
        return pnAccountantid;
    }

    public void setPnAccountantid(Integer pnAccountantid) {
        this.pnAccountantid = pnAccountantid;
    }

    public Integer getPnWarehousepersonid() {
        return pnWarehousepersonid;
    }

    public void setPnWarehousepersonid(Integer pnWarehousepersonid) {
        this.pnWarehousepersonid = pnWarehousepersonid;
    }

    public BigDecimal getPnTotalmoney() {
        return pnTotalmoney;
    }

    public void setPnTotalmoney(BigDecimal pnTotalmoney) {
        this.pnTotalmoney = pnTotalmoney;
    }

    public String getPnRemark() {
        return pnRemark;
    }

    public void setPnRemark(String pnRemark) {
        this.pnRemark = pnRemark == null ? null : pnRemark.trim();
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

	@Override
	public String toString() {
		return "PurchasenoteDetail [pnId=" + pnId + ", pnCreatetime=" + pnCreatetime + ", pnEId=" + pnEId
				+ ", pnStatus=" + pnStatus + ", pnAccountantid=" + pnAccountantid + ", pnWarehousepersonid="
				+ pnWarehousepersonid + ", pnTotalmoney=" + pnTotalmoney + ", pnRemark=" + pnRemark + ", notePerson="
				+ notePerson + ", accountantPerson=" + accountantPerson + ", warehousePerson=" + warehousePerson + "]";
	}
    
}
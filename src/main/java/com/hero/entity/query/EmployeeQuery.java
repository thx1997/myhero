package com.hero.entity.query;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 员工查询实体类
 * @author thx
 *
 */
@JsonInclude(Include.NON_EMPTY)
public class EmployeeQuery extends QueryBase{
	private Integer eId;//编号
    private String eName;//姓名
    private String eLoginname;//登录名
    private String eSex;//性别
    private String eIdcard;//身份证号
    //生日时间段
    @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
    private Date beginBirthday;
    @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
    private Date endBirthday;
    //最近登录时间段
    @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
    private Date beginLogintime;
    @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
    private Date endLogintime;
    //创建时间段
    @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
    private Date beginCreatetime;
    @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
    private Date endCreatetime;
    //修改时间段
    @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
    private Date beginUpdatetime;
    @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
    private Date endUpdatetime;    
    
    private Integer eIslockout;//是否锁定
    private String eEmail;//邮箱
    private String eTelphone;//手机号
    private Integer eDeptid;//部门编号
    private String orderby;//排序（列名）
 
     


	public EmployeeQuery(String eIdcard, Integer eIslockout) {
		super();
		this.eIdcard = eIdcard;
		this.eIslockout = eIslockout;
	}
	public EmployeeQuery() {
		super();
	}
	public EmployeeQuery(Integer eId, String eName, String eLoginname, String eSex, String eIdcard, Date beginBirthday,
			Date endBirthday, Date beginLogintime, Date endLogintime, Date beginCreatetime, Date endCreatetime,
			Date beginUpdatetime, Date endUpdatetime, Integer eIslockout, String eEmail, String eTelphone,
			Integer eDeptid, String orderby) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eLoginname = eLoginname;
		this.eSex = eSex;
		this.eIdcard = eIdcard;
		this.beginBirthday = beginBirthday;
		this.endBirthday = endBirthday;
		this.beginLogintime = beginLogintime;
		this.endLogintime = endLogintime;
		this.beginCreatetime = beginCreatetime;
		this.endCreatetime = endCreatetime;
		this.beginUpdatetime = beginUpdatetime;
		this.endUpdatetime = endUpdatetime;
		this.eIslockout = eIslockout;
		this.eEmail = eEmail;
		this.eTelphone = eTelphone;
		this.eDeptid = eDeptid;
		this.orderby = orderby;
	}
	@Override
	public String toString() {
		return "EmployeeQuery [eId=" + eId + ", eName=" + eName + ", eLoginname=" + eLoginname + ", eSex=" + eSex
				+ ", eIdcard=" + eIdcard + ", beginBirthday=" + beginBirthday + ", endBirthday=" + endBirthday
				+ ", beginLogintime=" + beginLogintime + ", endLogintime=" + endLogintime + ", beginCreatetime="
				+ beginCreatetime + ", endCreatetime=" + endCreatetime + ", beginUpdatetime=" + beginUpdatetime
				+ ", endUpdatetime=" + endUpdatetime + ", eIslockout=" + eIslockout + ", eEmail=" + eEmail
				+ ", eTelphone=" + eTelphone + ", eDeptid=" + eDeptid + ", orderby=" + orderby +  "]";
	}
	


}

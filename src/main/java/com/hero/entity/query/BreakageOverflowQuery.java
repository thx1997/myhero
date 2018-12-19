package com.hero.entity.query;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BreakageOverflowQuery extends QueryBase{
	    private Integer boId;

	    private Integer boEId;

	  //创建时间段
	    @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date beginCreatetime;
	    @JsonFormat(timezone="GMT+8",pattern="yyyy-MM-dd")
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date endCreatetime;

	    private Integer bodType;//单子类型
	    private Integer boState;
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
		public Date getBeginCreatetime() {
			return beginCreatetime;
		}
		public void setBeginCreatetime(Date beginCreatetime) {
			this.beginCreatetime = beginCreatetime;
		}
		public Date getEndCreatetime() {
			return endCreatetime;
		}
		public void setEndCreatetime(Date endCreatetime) {
			this.endCreatetime = endCreatetime;
		}
		public Integer getBodType() {
			return bodType;
		}
		public void setBodType(Integer bodType) {
			this.bodType = bodType;
		}
		public Integer getBoState() {
			return boState;
		}
		public void setBoState(Integer boState) {
			this.boState = boState;
		}
		public BreakageOverflowQuery(Integer boId, Integer boEId, Date beginCreatetime, Date endCreatetime,
				Integer bodType, Integer boState) {
			super();
			this.boId = boId;
			this.boEId = boEId;
			this.beginCreatetime = beginCreatetime;
			this.endCreatetime = endCreatetime;
			this.bodType = bodType;
			this.boState = boState;
		}
		public BreakageOverflowQuery() {
			super();
		}
		@Override
		public String toString() {
			return "BreakageOverflowQuery [boId=" + boId + ", boEId=" + boEId + ", beginCreatetime=" + beginCreatetime
					+ ", endCreatetime=" + endCreatetime + ", bodType=" + bodType + ", boState=" + boState + "]";
		}

		
		
}

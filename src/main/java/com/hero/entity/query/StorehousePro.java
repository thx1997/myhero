package com.hero.entity.query;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
/**
 * 
 * @author thx
 *
 */
@JsonInclude(Include.NON_EMPTY)
public class StorehousePro extends QueryBase{
       int spcid;//类别编号
       int sdsid;//仓库编号
	public int getSpcid() {
		return spcid;
	}
	public void setSpcid(int spcid) {
		this.spcid = spcid;
	}
	public int getSdsid() {
		return sdsid;
	}
	public void setSdsid(int sdsid) {
		this.sdsid = sdsid;
	}
	public StorehousePro(int spcid, int sdsid) {
		super();
		this.spcid = spcid;
		this.sdsid = sdsid;
	}
	public StorehousePro() {
		super();
	}
	@Override
	public String toString() {
		return "StorehousePro [spcid=" + spcid + ", sdsid=" + sdsid + "]";
	}
       
}

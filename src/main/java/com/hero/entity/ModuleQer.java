package com.hero.entity;


public class ModuleQer {

	private String modulename;
	private Integer beginpage;
	private Integer rows;
	private Integer indexpage;
	public String getModulename() {
		return modulename;
	}
	public void setModulename(String modulename) {
		this.modulename = modulename;
	}
	public Integer getBeginpage() {
		return (indexpage-1)*rows;
	}
	public void setBeginpage(Integer beginpage) {
		this.beginpage = beginpage;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	public Integer getIndexpage() {
		return indexpage;
	}
	public void setIndexpage(Integer indexpage) {
		this.indexpage = indexpage;
	}
	@Override
	public String toString() {
		return "ModuleQer [modulename=" + modulename + ", beginpage=" + beginpage + ", rows=" + rows + ", indexpage="
				+ indexpage + "]";
	}
	
	
}

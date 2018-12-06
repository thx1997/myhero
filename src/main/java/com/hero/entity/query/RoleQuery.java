package com.hero.entity.query;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
/**
 * 角色查询条件实体类
 * @author wxk
 *
 */
@JsonInclude(Include.NON_EMPTY)	//没有接收到的参数为空的不序列化
public class RoleQuery {
	private String roleName;
	private Integer page = 1;//当前第几页
	private Integer rows  = 10;//每页大小
	private Integer startIndex = 0;//Mysql分页查询limit第一个参数
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getRows() {
		return rows;
	}
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	//MyBatis映射文件中取值使用
	public Integer getStartIndex() {
		return (page-1)*rows;
	}
	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}
	public RoleQuery(String roleName, Integer page, Integer rows,
			Integer startIndex) {
		super();
		this.roleName = roleName;
		this.page = page;
		this.rows = rows;
		this.startIndex = startIndex;
	}
	public RoleQuery() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RoleQeury [roleName=" + roleName + ", page=" + page + ", rows="
				+ rows + ", startIndex=" + startIndex + "]";
	}
	
	
	
}

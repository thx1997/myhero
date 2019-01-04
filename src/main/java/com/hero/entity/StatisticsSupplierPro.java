package com.hero.entity;

public class StatisticsSupplierPro {

	private String name;
	private Float y;
	public StatisticsSupplierPro(String name, Float y) {
		super();
		this.name = name;
		this.y = y;
	}
	public StatisticsSupplierPro() {
		super();
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public Float gety() {
		return y;
	}
	public void sety(Float y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "StatisticsSupplierPro [name=" + name + ", y=" + y + "]";
	}
	
	
}

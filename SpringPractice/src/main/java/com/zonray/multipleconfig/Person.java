package com.zonray.multipleconfig;

public class Person {

	
	private Integer number;
	private String name;
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [number=" + number + ", name=" + name + "]";
	}
	
	
}

package com.zonray.core;

public class PersonAbstract {

	private Integer number;
	private String name;
	
	
	public PersonAbstract() {
		System.out.println("default constructor..");
	}
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
		return "PersonAbstract [number=" + number + ", name=" + name + "]";
	}
	
	
}

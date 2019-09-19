package com.zonray.core;

public class Person1 {

	private Integer number;
	private String name;
	private Address1 address;
	
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
	public Address1 getAddress() {
		return address;
	}
	public void setAddress(Address1 address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person1 [number=" + number + ", name=" + name + ", address=" + address + "]";
	}
	
	
}

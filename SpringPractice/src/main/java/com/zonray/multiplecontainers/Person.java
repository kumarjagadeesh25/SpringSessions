package com.zonray.multiplecontainers;

public class Person {

	private Integer number;
	private String name;
	private Double salary;
//	private Address address;
	
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	/*
	 * public Address getAddress() { return address; }
	 */
	/*
	 * // public void setAddress(Address address) { // this.address = address; // }
	 */	@Override
	public String toString() {
		return "Person [number=" + number + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

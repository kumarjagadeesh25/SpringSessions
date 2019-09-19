package com.zonray.core;

public class Person {

	private Integer number;
	private String name;

	public Person() {
		System.out.println("Object created..");
	}

	public Person(Integer number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public void display() {
		System.out.println("we are in display()");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	
	  @Override public String toString() {
		  return "Person [number=" + number + ", name=" + name + "]"; }
	  
	 

}

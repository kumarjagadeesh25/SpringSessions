package com.zonray.multipleconfig;

public class Address {

	private Integer street_id;
	private String street;
	
	public Integer getStreet_id() {
		return street_id;
	}
	public void setStreet_id(Integer street_id) {
		this.street_id = street_id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [street_id=" + street_id + ", street=" + street + "]";
	}
	
	
}

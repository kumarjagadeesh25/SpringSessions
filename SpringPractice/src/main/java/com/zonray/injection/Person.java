package com.zonray.injection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class Person {

	private Integer pid;
	private String name;
	private Integer salary;
	private String[] names;
	private ArrayList<String> namesList;
	private Set<String>	namesSet;
	private Map<Integer, String> empDetails;
	
	public Map<Integer, String> getEmpDetails() {
		return empDetails;
	}
	public void setEmpDetails(Map<Integer, String> empDetails) {
		this.empDetails = empDetails;
	}
	public Set<String> getNamesSet() {
		return namesSet;
	}
	public void setNamesSet(Set<String> namesSet) {
		this.namesSet = namesSet;
	}
	public ArrayList<String> getNamesList() {
		return namesList;
	}
	public void setNamesList(ArrayList<String> namesList) {
		this.namesList = namesList;
	}
	public Person() {

	}	
	public Person(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String[] getNames() {
		return names;
	}
	public void setNames(String[] names) {
		this.names = names;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", salary=" + salary + ", names=" + Arrays.toString(names)
				+ "]";
	}

	/*
	 * public Person(Integer pid, Integer salary) { super(); this.pid = pid;
	 * this.salary = salary; }
	 */

	
}

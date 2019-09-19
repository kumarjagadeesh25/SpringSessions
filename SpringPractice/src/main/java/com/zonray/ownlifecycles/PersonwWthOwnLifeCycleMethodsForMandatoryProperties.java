package com.zonray.ownlifecycles;

public class PersonwWthOwnLifeCycleMethodsForMandatoryProperties {

	private Integer pid;
	private String name;
	private String wifeName;
	private String address;

	
	  
	  public void demo() throws Exception { 
		  if(pid==null){ 
			  throw new Exception("PID is Missing");
		  }
	  }
	 
	public PersonwWthOwnLifeCycleMethodsForMandatoryProperties() {
		System.out.println("Constructor..");
	}
	public void destroy() {
		System.out.println("Before removing the Object..");
	}
//	here this method is not executing by container ...why ? 
	/*
	 * public void display() { System.out.println("Display..."); }
	 */

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

	public String getWifeName() {
		return wifeName;
	}

	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "PersonwWthOwnLifeCycleMethodsForMandatoryProperties [pid=" + pid + ", name=" + name + ", wifeName="
				+ wifeName + ", address=" + address + "]";
	}

}

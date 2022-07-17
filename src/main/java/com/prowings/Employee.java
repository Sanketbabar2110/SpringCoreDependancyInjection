package com.prowings;

public class Employee {
	
	int empId;
	String name;
	Profile profile;
	
	public Employee() {
		super();
	}
	
	public Employee(int empId, String name, Profile profile) {
		super();
		this.empId = empId;
		this.name = name;
		this.profile = profile;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", profile=" + profile + "]";
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
}

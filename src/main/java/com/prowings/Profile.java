package com.prowings;

public class Profile {
	
	String city;
	int salary;
	String department;
	
	public Profile() {
		super();
	}
	
	public Profile(String city, int salary, String department) {
		super();
		this.city = city;
		this.salary = salary;
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Profile [city=" + city + ", salary=" + salary + ", department=" + department + "]";
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}

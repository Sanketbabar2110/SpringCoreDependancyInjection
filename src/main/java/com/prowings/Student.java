package com.prowings;

public class Student {
	
	int StudentId;
	String name;
	String hobby;
	Address add;
	
	public Student() {
		super();
	}
	
	public Student(int studentId, String name, String hobby, Address add) {
		super();
		StudentId = studentId;
		this.name = name;
		this.hobby = hobby;
		this.add = add;
	}
	
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", name=" + name + ", hobby=" + hobby + ", add=" + add + "]";
	}
	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
}

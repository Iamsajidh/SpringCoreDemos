package com.springCore.springCore;

public class Student {
private int studId;
private String name;
private String address;
public int getStudId() {
	return studId;
}
public void setStudId(int studId) {
	this.studId = studId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Student(int studId, String name, String address) {
	super();
	this.studId = studId;
	this.name = name;
	this.address = address;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [studId=" + studId + ", name=" + name + ", address=" + address + "]";
}


}

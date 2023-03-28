package com.beanLifeCycle.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stdbean")
public class Student {
@Value("Sajid")
private String name;
@Value("22")
private int age;
@Autowired
private Address address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@PostConstruct
public void init() {
	System.out.println("init");
	
}
@PreDestroy
public void destroy() {
	System.out.println("destroy");
}
@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
}


}

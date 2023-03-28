package com.beanLifeCycle.xml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student{
public int id;
public String name;
public String section;
public int getId() {
	
	return id;
}
public void setId(int id) {
	System.out.println("setting values");
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSection() {
	return section;
}
public void setSection(String section) {
	this.section = section;
}
public Student(int id, String name, String section) {
	super();
	this.id = id;
	this.name = name;
	this.section = section;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", section=" + section + "]";
}

@PostConstruct
public void init() {
	System.out.println("initializing bean");
}

// use this in xml file to define these methods without annotations init-method="init"  destroy-method="destroy" //
@PreDestroy
public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("after bean is destroyed");
	}

}

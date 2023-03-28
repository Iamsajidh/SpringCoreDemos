package com.springCore.Constructor;

public class Person {
private String name;
private int Id;
private Certificate certificate;

public Person(String name, int id,Certificate certificate) {
	super();
	this.name = name;
	this.Id = id;
	this.certificate=certificate;
}

@Override
public String toString() {
	return "Person [name=" + name + ", Id=" + Id + ", certificate=" + certificate + "]";
}



}

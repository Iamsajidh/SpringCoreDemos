package com.springCore.Constructor;

public class Certificate {
private String Name;

public Certificate(String name) {
	super();
	this.Name = name;
}

@Override
public String toString() {
	return this.Name;
}

}

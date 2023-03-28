package com.annotations;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.beans.factory.annotation.Required;

public class Student {
private String name;
private String course;
private String hobby;
public String getName() {
	return name;
}
@Value("Sajid")
//@Required
public void setName(String name) {
	this.name = name;
}

public String getCourse() {

	return course;
}

@Value("${Student.course}")
public void setCourse(String course) {
	this.course = course;
}
public String getHobby() {
	return hobby;
}
@Value("cricket")
public void setHobby(String hobby) {
	this.hobby = hobby;
}

public void displayStudentInfo() {
	System.out.println("Student name:"+name);
	System.out.println("Student course:"+course);
	System.out.println("Student hobby:"+hobby);

}
}

package com.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class driver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/annotations/beans.xml");
		Student student=context.getBean("Student",Student.class);
		student.displayStudentInfo();
	}
	}
package com.springCore.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context= new ClassPathXmlApplicationContext("CiConfig.xml");
	Person person1=(Person)context.getBean("Person");
	System.out.println(person1);
	}

}

package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context= new ClassPathXmlApplicationContext("com/autowiring/beans.xml");
	Human human=context.getBean("human",Human.class);
	human.startPump();
	}

}

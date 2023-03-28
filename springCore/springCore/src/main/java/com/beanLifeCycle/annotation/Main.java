package com.beanLifeCycle.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Student student1=(Student)context.getBean("stdbean");
		System.out.println(student1);
		context.close();

	}

}

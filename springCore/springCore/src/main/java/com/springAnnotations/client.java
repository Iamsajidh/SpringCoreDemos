package com.springAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class client {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
	College college=context.getBean("ColBean",College.class);
	System.out.println(college);
	college.test();
}
}

package com.beanLifeCycle.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com\\beanLifeCycle\\lifeCycleConfig.xml");
		Student student1=(Student)context.getBean("studentBean");
		System.out.println(student1);
		//context.close();
		context.close();
	}

}

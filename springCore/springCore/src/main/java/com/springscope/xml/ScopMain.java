package com.springscope.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Employee employee = context.getBean("scopebean", Employee.class);
		
		employee.setEmployeeId(101);
		employee.setEmployeename("Sajid");
		
		System.out.println("employee id is "+ employee.getEmployeeId()+ " and name is " + employee.getEmployeename());
		
		Employee employee1 = context.getBean("scopebean", Employee.class);
		System.out.println("employee id is " + employee1.getEmployeeId()+ " and name is " + employee1.getEmployeename());
		
		((AbstractApplicationContext)context).close();
		
	}

}

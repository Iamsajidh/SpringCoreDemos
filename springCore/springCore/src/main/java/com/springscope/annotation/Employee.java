package com.springscope.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {
	
	private int employeeId;
	private String employeename;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
//	@Override
//	public String toString() {
//		return "Employee [employeeId=" + employeeId + ", employeename=" + employeename + "]";
//	}
//	

}

package com.springAnnotations;


import org.springframework.stereotype.Component;

//@Component("collegeBean")
public class College {
	private Principal principal;
	
public College(Principal principal) {
		super();
		this.principal = principal;
	}

public void test() {
	principal.principalInfo();
	System.out.println("testing");
}
}

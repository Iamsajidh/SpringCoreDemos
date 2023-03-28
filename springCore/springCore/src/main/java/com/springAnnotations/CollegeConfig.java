package com.springAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {
	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	@Bean(name="ColBean")
public College collegeBean() {		//methodname is beanId
	College college=new College(principalBean());
	return college;
}
}

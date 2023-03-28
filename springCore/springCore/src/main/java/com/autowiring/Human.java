package com.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("Humanheart")
	private Heart heart;
	
	
	public void startPump() {
		if(heart!=null) {
		heart.pump();
		System.out.println("name:"+heart.getNameOfAnimal()+" no of hearts:"+heart.getNoOfHearts());}
		else {
			
			System.out.println("dead");
		}
	}
}

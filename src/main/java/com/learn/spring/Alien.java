package com.learn.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	
	@Autowired
//	@Qualifier("desk")
	private Computer computer;
	
	
	public void coding() {
		System.out.println("Coding...");
		computer.compile();
	}

}

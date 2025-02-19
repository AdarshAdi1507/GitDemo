package com.learn.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("desk")
public class Desktop implements Computer {
	
	public void compile() {
		System.out.println("Desktop is compiling...");
	}

}

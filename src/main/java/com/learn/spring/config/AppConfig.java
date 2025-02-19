package com.learn.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.learn.spring.Desktop;
@Configuration
@ComponentScan("com.learn.spring")
public class AppConfig {
////	@Bean(name = "com2")
//	
//	@Bean(name="com2")
//	@Scope("prototype")
//	public Desktop getDesktop() {
//		return new Desktop();
//	}

}

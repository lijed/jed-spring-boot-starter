package com.me.helloworld;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorldImpl implements IHelloWorld {

	@Autowired
	private HelloWorldProperties  helloWorkdProperties;

	public void welcome() {
		System.out.println("This is my first start example, welcome: " + helloWorkdProperties.getName());
	}

}

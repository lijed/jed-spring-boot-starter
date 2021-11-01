package com.me.helloworld;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.jed", ignoreUnknownFields = true)
public class HelloWorldProperties {
	
	private String name = "jed";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

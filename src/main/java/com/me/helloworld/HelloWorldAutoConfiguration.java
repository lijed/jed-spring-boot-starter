package com.me.helloworld;


import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConditionalOnClass(IHelloWorld.class)
@EnableConfigurationProperties(HelloWorldProperties.class)
public class HelloWorldAutoConfiguration {
	
	@Bean
	@ConditionalOnMissingBean
	public IHelloWorld helloWorld() {
		return new HelloWorldImpl();
	}
}


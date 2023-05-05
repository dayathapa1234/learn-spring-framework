package com.in28minutes.learnspringframework;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {

	public static void main(String[] args) {

		// 1: Launch a Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		// 2: Configure the things that we want Spring to manage - @Configuration (class)
		// HelloWorldConfiguration - @Configuration
		// name - @Bean

		// 3: Retrieving Beans managed by Spring
		System.out.println("Name: " + context.getBean("name"));
		System.out.println("Age: " + context.getBean("age"));
		System.out.println("Person: " + context.getBean("person"));
		System.out.println("Person: " + context.getBean("person2MethodCall"));
		System.out.println("Person: " + context.getBean("person3Parameters"));
		System.out.println("Person: " + context.getBean(Person.class));
		System.out.println("Person: " + context.getBean("person5Qualifier"));
		System.out.println("Address: " + context.getBean("address2"));

		// System.out.println("Name: " + context.getBean(Address.class));

		// Listing out Beans managed by Spring Framework
		Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
	}

}

package com.rest.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rest.mongo.repositories.CostRepository;


@SpringBootApplication
@ComponentScan(basePackages = {"com.rest.controller"})

public class RestApplication {


	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
		/*  Used for dataload from costdata.js
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		CostRepository repo =  ctx.getBean(CostRepository.class);
		*/

		
	}
}

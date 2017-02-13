package com.rest.application;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Update.update;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.rest.model.Cost;

@SpringBootApplication
@ComponentScan(basePackages = {"com.rest.controller"})

public class RestApplication {


	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
		
	}
}

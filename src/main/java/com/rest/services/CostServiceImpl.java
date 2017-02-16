package com.rest.services;


import java.util.List;

import static org.springframework.data.mongodb.core.query.Query.query;
import static org.springframework.data.mongodb.core.query.Criteria.where;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.rest.model.Cost;

@Service
public class CostServiceImpl implements RestServiceInterface{

	public List<Cost> getCosts(String id) {
	    List<Cost> costs = operations.findAll(Cost.class);
		return costs;
	}	
	public Cost getCost(String id) {
		Query query = new Query(where("productId").is(Long.parseLong(id)));
	    Cost cost = operations.findOne(query, Cost.class);
		return cost;
	}
}

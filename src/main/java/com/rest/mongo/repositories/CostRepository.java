package com.rest.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rest.model.Cost;

public interface CostRepository extends MongoRepository<Cost, String> {

}

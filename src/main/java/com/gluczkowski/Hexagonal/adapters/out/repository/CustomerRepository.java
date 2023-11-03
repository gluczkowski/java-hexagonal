package com.gluczkowski.Hexagonal.adapters.out.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gluczkowski.Hexagonal.adapters.out.repository.entity.CustomerEntity;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {

}

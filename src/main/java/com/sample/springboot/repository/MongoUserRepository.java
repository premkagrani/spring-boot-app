package com.sample.springboot.repository;

import com.sample.springboot.document.MongoUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoUserRepository extends MongoRepository<MongoUser, String> {

}

package com.sanyukt.matdaan.repo;

import model.Executive;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExecutiveRepo extends MongoRepository<Executive,String > {
}

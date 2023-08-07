package com.sanyukt.matdaan.repo;

import com.sanyukt.matdaan.model.Citizen;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizenRepo extends MongoRepository<Citizen,String> {
}

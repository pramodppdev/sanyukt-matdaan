package com.sanyukt.matdaan.repo;

import com.sanyukt.matdaan.model.Village;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VillageRepo extends MongoRepository<Village,String> {
}

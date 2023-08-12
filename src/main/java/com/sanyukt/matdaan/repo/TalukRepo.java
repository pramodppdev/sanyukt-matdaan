package com.sanyukt.matdaan.repo;

import com.sanyukt.matdaan.model.Taluk;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TalukRepo extends MongoRepository<Taluk,String> {
}

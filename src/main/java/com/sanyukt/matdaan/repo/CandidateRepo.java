package com.sanyukt.matdaan.repo;

import model.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepo extends MongoRepository<Candidate,String> {
}

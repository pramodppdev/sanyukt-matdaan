package com.sanyukt.matdaan.repo;

import model.Voting;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotingRepo extends MongoRepository<Voting,String > {
}

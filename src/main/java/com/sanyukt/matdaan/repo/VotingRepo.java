package com.sanyukt.matdaan.repo;

import com.sanyukt.matdaan.model.Voting;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VotingRepo extends MongoRepository<Voting,String > {
}

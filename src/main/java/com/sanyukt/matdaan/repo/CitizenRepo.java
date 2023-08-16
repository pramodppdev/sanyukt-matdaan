package com.sanyukt.matdaan.repo;

import com.sanyukt.matdaan.model.Citizen;
import com.sanyukt.matdaan.pojo.CitizenVO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizenRepo extends MongoRepository<Citizen,String> {

    @Query(value="{voterId:'?0'}")
    Citizen findAllByVoterId(String voterId);

    @Query(value="{aadharId:'?0'}")
    Citizen findAllByAadhar(long aadharId);

}

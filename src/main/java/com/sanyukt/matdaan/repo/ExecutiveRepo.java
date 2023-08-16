package com.sanyukt.matdaan.repo;

import com.sanyukt.matdaan.model.Executive;
import com.sanyukt.matdaan.pojo.CitizenVO;
import com.sanyukt.matdaan.pojo.ExectiveVO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExecutiveRepo extends MongoRepository<Executive,String > {

    @Query(value="{username:'?0'}")
    ExectiveVO findAllByUserName(String username);
}

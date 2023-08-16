package com.sanyukt.matdaan.service;

import com.sanyukt.matdaan.model.Citizen;
import com.sanyukt.matdaan.pojo.CitizenVO;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;
import java.util.List;

@Service
public interface CitizenService {

    Citizen saveCitizen(Citizen citizen);

    void updateStatus(String voterId);

    List<Citizen> getAllCitizen();

    Citizen getById(String id);

    void deleteCitizen(String id);

    Citizen citizenAuth(Citizen citizen) throws AuthenticationException;


}

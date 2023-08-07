package com.sanyukt.matdaan.service;

import com.sanyukt.matdaan.model.Citizen;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CitizenService {

    Citizen saveCitizen(Citizen citizen);

    List<Citizen> getAllCitizen();

    Citizen getById(String id);

    void deleteCitizen(String id);
}

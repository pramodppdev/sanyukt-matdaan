package com.sanyukt.matdaan.service.ServiceImpl;

import com.sanyukt.matdaan.repo.CitizenRepo;
import model.Citizen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitizenServiceImpl implements CitizenService{

    @Autowired
    private CitizenRepo citizenRepo;
    @Override
    public Citizen saveCitizen(Citizen citizen) {
        return citizenRepo.save(citizen);
    }
}

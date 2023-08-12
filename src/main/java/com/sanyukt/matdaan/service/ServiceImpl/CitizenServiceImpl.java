package com.sanyukt.matdaan.service.ServiceImpl;

import com.sanyukt.matdaan.exception.ResourceNotFoundException;
import com.sanyukt.matdaan.model.Citizen;
import com.sanyukt.matdaan.repo.CitizenRepo;
import com.sanyukt.matdaan.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenServiceImpl implements CitizenService {

    @Autowired
    private CitizenRepo citizenRepo;
    @Override
    public Citizen saveCitizen(Citizen citizen) {
        return citizenRepo.save(citizen);
    }

    @Override
    public List<Citizen> getAllCitizen() {
        return citizenRepo.findAll();
    }

    @Override
    public Citizen getById(String id) {
        return citizenRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Citizen","Id",id));
    }

    @Override
    public void deleteCitizen(String id) {
        citizenRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("Citizen","Id",id));
        citizenRepo.deleteById(id);
    }
}

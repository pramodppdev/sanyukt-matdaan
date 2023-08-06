package com.sanyukt.matdaan.service;

import com.sanyukt.matdaan.repo.ExecutiveRepo;
import model.Executive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExecutiveServiceImpl implements ExecutiveService{
    @Autowired
    private ExecutiveRepo executiveRepo;
    @Override
    public Executive saveExecutive(Executive executive) {
        return executiveRepo.save(executive);
    }
}

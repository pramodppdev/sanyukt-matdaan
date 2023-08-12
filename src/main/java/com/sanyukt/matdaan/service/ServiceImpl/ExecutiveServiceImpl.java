package com.sanyukt.matdaan.service.ServiceImpl;

import com.sanyukt.matdaan.exception.ResourceNotFoundException;
import com.sanyukt.matdaan.model.Executive;
import com.sanyukt.matdaan.repo.ExecutiveRepo;
import com.sanyukt.matdaan.service.ExecutiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExecutiveServiceImpl implements ExecutiveService {

    @Autowired
    private ExecutiveRepo executiveRepo;
    @Override
    public Executive saveExe(Executive executive) {
        return executiveRepo.save(executive);
    }

    @Override
    public List<Executive> getAllExe() {
        return executiveRepo.findAll();
    }

    @Override
    public Executive getById(String id) {
        return executiveRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Executive","Id",id));
    }

    @Override
    public void deleteExe(String id) {
        executiveRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("Executive","Id",id));
        executiveRepo.deleteById(id);
    }
}

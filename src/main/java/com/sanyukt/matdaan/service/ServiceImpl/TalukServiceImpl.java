package com.sanyukt.matdaan.service.ServiceImpl;

import com.sanyukt.matdaan.exception.ResourceNotFoundException;
import com.sanyukt.matdaan.model.Taluk;
import com.sanyukt.matdaan.repo.TalukRepo;
import com.sanyukt.matdaan.service.TalukService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TalukServiceImpl implements TalukService {
    private TalukRepo talukRepo;
    @Override
    public Taluk saveTaluk(Taluk taluk) {
        return talukRepo.save(taluk);
    }

    @Override
    public List<Taluk> getAllTaluk() {
        return talukRepo.findAll();
    }

    @Override
    public Taluk getById(String id) {
        return talukRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Taluk","Id",id));
    }

    @Override
    public void deleteTaluk(String id) {
        talukRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("Taluk","Id",id));
        talukRepo.deleteById(id);
    }
}

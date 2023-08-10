package com.sanyukt.matdaan.service.ServiceImpl;

import com.sanyukt.matdaan.exception.ResourceNotFoundException;
import com.sanyukt.matdaan.model.Village;
import com.sanyukt.matdaan.repo.VillageRepo;
import com.sanyukt.matdaan.service.VillageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VillageServiceImpl implements VillageService {
    private VillageRepo villageRepo;
    @Override
    public Village saveVillage(Village village) {
        return villageRepo.save(village);
    }

    @Override
    public List<Village> getAllVillage() {
        return villageRepo.findAll();
    }

    @Override
    public Village getById(String id) {
        return villageRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Village","Id",id));
    }

    @Override
    public void deleteVillage(String id) {
        villageRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("Taluk","Id",id));
        villageRepo.deleteById(id);
    }
}

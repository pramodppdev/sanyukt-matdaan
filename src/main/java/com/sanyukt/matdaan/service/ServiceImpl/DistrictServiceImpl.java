package com.sanyukt.matdaan.service.ServiceImpl;

import com.sanyukt.matdaan.exception.ResourceNotFoundException;
import com.sanyukt.matdaan.model.District;
import com.sanyukt.matdaan.repo.DistrictRepo;
import com.sanyukt.matdaan.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictServiceImpl implements DistrictService {
    @Autowired
    private DistrictRepo districtRepo;
    @Override
    public District saveDistrict(District district) {
        return districtRepo.save(district);
    }

    @Override
    public List<District> getAllDistrict() {
        return districtRepo.findAll();
    }

    @Override
    public District getById(String id) {
        return districtRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("District","Id",id));
    }

    @Override
    public void deleteDistrict(String id) {
        districtRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("District","Id",id));
        districtRepo.deleteById(id);
    }
}

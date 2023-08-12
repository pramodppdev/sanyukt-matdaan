package com.sanyukt.matdaan.service;

import com.sanyukt.matdaan.model.District;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DistrictService {
    District saveDistrict(District district);

    List<District> getAllDistrict();

    District getById(String id);

    void deleteDistrict(String id);
}

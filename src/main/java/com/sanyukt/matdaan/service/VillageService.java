package com.sanyukt.matdaan.service;

import com.sanyukt.matdaan.model.Village;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VillageService {
    Village saveVillage(Village village);

    List<Village> getAllVillage();

    Village getById(String id);

    void deleteVillage(String id);
}

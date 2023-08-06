package com.sanyukt.matdaan.service.ServiceImpl;

import model.Citizen;
import org.springframework.stereotype.Service;

@Service
public interface CitizenService {

    Citizen saveCitizen(Citizen citizen);
}

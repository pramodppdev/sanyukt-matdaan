package com.sanyukt.matdaan.service;

import model.Executive;
import org.springframework.stereotype.Service;

@Service
public interface ExecutiveService {

    Executive saveExecutive(Executive executive);
}

package com.sanyukt.matdaan.controller;

import com.sanyukt.matdaan.service.ServiceImpl.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/citizen")
public class CitizenController {
    @Autowired
    private CitizenService citizenService;


}

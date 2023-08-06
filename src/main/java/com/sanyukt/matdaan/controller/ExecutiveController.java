package com.sanyukt.matdaan.controller;

import com.sanyukt.matdaan.service.ExecutiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/executive")
public class ExecutiveController {
    @Autowired
    private ExecutiveService executiveService;
}

package com.sanyukt.matdaan.controller;

import com.sanyukt.matdaan.model.Citizen;
import com.sanyukt.matdaan.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/citizen")
public class CitizenController {
    @Autowired
    private CitizenService citizenService;
    @PostMapping("/save")
    public ResponseEntity<Citizen> saveExe(@RequestBody Citizen executive){
        return new ResponseEntity<Citizen>(citizenService.saveCitizen(executive), HttpStatus.CREATED);
    }

    @GetMapping("/getAllExe")
    public List<Citizen> getAllExe(){
        return citizenService.getAllCitizen();
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Citizen> getById(@PathVariable("id") String id){
        return new ResponseEntity<Citizen>(citizenService.getById(id),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteExe(@PathVariable String id) {
        citizenService.deleteCitizen(id);
        return new ResponseEntity<String>("Citizen Deleted Successfully", HttpStatus.OK);
    }
}

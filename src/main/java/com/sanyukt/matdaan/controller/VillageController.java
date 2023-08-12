package com.sanyukt.matdaan.controller;

import com.sanyukt.matdaan.model.Village;
import com.sanyukt.matdaan.service.VillageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Village")
public class VillageController {
    @Autowired
    private VillageService villageService;
    @PostMapping("/save")
    public ResponseEntity<Village> saveExe(@RequestBody Village village){
        return new ResponseEntity<Village>(villageService.saveVillage(village), HttpStatus.CREATED);
    }

    @GetMapping("/getAllVillage")
    public List<Village> getAllVillage(){
        return villageService.getAllVillage();
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Village> getById(@PathVariable("id") String id){
        return new ResponseEntity<Village>(villageService.getById(id),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteExe(@PathVariable String id) {
        villageService.deleteVillage(id);
        return new ResponseEntity<String>("Citizen Deleted Successfully", HttpStatus.OK);
    }
}

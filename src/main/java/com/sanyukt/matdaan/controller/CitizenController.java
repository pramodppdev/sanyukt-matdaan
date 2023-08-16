package com.sanyukt.matdaan.controller;

import com.sanyukt.matdaan.exception.ResourceNotFoundException;
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
    public ResponseEntity<Citizen> saveCitizen(@RequestBody Citizen citizen){
        return new ResponseEntity<Citizen>(citizenService.saveCitizen(citizen), HttpStatus.CREATED);
    }

    @GetMapping("/getAllCitizen")
    public List<Citizen> getAllCitizen(){
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

    @PutMapping("/updateStatus/{voterId}")
    public ResponseEntity<String> updateCitizenStatus(@PathVariable String voterId) {
        try {
            citizenService.updateStatus(voterId);
            return ResponseEntity.ok("Status updated successfully.");
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error updating status.");
        }
    }
}

package com.sanyukt.matdaan.controller;

import com.sanyukt.matdaan.model.Executive;
import com.sanyukt.matdaan.service.ExecutiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/executive")
public class ExecutiveController {
    @Autowired
    private ExecutiveService executiveService;
    @PostMapping("/save")
    public ResponseEntity<Executive> saveExe(@RequestBody Executive executive){
        return new ResponseEntity<Executive>(executiveService.saveExe(executive), HttpStatus.CREATED);
    }

    @GetMapping("/getAllExe")
    public List<Executive> getAllExe(){
        return executiveService.getAllExe();
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Executive> getById(@PathVariable("id") String id){
        return new ResponseEntity<Executive>(executiveService.getById(id),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteExe(@PathVariable String id) {
        executiveService.deleteExe(id);
        return new ResponseEntity<String>("Executive Deleted Successfully", HttpStatus.OK);
    }
}

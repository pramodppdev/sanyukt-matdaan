package com.sanyukt.matdaan.controller;

import com.sanyukt.matdaan.model.Taluk;
import com.sanyukt.matdaan.service.TalukService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController@RequestMapping("/api/Taluk")
public class TalukController {
    @Autowired
    private TalukService talukService;
    @PostMapping("/save")
    public ResponseEntity<Taluk> saveTaluk(@RequestBody Taluk taluk){
        return new ResponseEntity<Taluk>(talukService.saveTaluk(taluk), HttpStatus.CREATED);
    }

    @GetMapping("/getAllTaluk")
    public List<Taluk> getAllTaluk(){
        return talukService.getAllTaluk();
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Taluk> getById(@PathVariable("id") String id){
        return new ResponseEntity<Taluk>(talukService.getById(id),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteExe(@PathVariable String id) {
        talukService.deleteTaluk(id);
        return new ResponseEntity<String>("Taluk Deleted Successfully", HttpStatus.OK);
    }
}

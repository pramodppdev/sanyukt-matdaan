package com.sanyukt.matdaan.controller;

import com.sanyukt.matdaan.model.Candidate;
import com.sanyukt.matdaan.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {
    @Autowired
    private CandidateService candidateService;

    @PostMapping("/save")
    public ResponseEntity<Candidate> saveCandidate(@RequestBody Candidate candidate) {
        return new ResponseEntity<Candidate>(candidateService.saveCandidate(candidate), HttpStatus.CREATED);
    }

    @GetMapping("/getAllCandidate")
    public List<Candidate> getAllCandidate() {
        return candidateService.getAllCandidate();
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Candidate> getById(@PathVariable("id") String id) {
        return new ResponseEntity<Candidate>(candidateService.getById(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCandidate(@PathVariable String id) {
        candidateService.deleteCandidate(id);
        return new ResponseEntity<String>("Candidate Deleted Successfully", HttpStatus.OK);
    }
}

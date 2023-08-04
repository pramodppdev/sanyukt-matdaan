package com.sanyukt.matdaan.controller;


import com.sanyukt.matdaan.service.VotingService;
import model.Voting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/voting")
public class VotingController {

    @Autowired
    private VotingService votingService;

    @PostMapping("/save")
    public ResponseEntity<Voting> saveVote(@RequestBody Voting voting){
        return new ResponseEntity<Voting>(votingService.saveVoting(voting), HttpStatus.CREATED);
    }
}

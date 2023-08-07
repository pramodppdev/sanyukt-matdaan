package com.sanyukt.matdaan.service;


import com.sanyukt.matdaan.model.Voting;
import org.springframework.stereotype.Service;

@Service
public interface VotingService {

    Voting saveVoting(Voting voting);


}

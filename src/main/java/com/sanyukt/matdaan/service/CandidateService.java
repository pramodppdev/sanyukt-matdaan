package com.sanyukt.matdaan.service;

import com.sanyukt.matdaan.model.Candidate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CandidateService {

    Candidate saveCandidate(Candidate candidate);

    List<Candidate> getAllCandidate();

    Candidate getById(String id);

    void deleteCandidate(String id);

    void increaseVoteCount(String id);
}

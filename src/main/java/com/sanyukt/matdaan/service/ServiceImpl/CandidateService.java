package com.sanyukt.matdaan.service.ServiceImpl;

import model.Candidate;
import org.springframework.stereotype.Service;

@Service
public interface CandidateService {

    Candidate saveCandidate(Candidate candidate);
}

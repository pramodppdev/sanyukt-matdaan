package com.sanyukt.matdaan.service.ServiceImpl;

import com.sanyukt.matdaan.repo.CandidateRepo;
import model.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateServiceImpl implements CandidateService{

    @Autowired
    private CandidateRepo candidateRepo;
    @Override
    public Candidate saveCandidate(Candidate candidate) {
        return candidateRepo.save(candidate);
    }
}

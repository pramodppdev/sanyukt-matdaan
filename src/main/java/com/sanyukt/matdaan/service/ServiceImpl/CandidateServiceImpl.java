package com.sanyukt.matdaan.service.ServiceImpl;

import com.sanyukt.matdaan.exception.ResourceNotFoundException;
import com.sanyukt.matdaan.model.Candidate;
import com.sanyukt.matdaan.repo.CandidateRepo;
import com.sanyukt.matdaan.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateServiceImpl implements CandidateService {
    @Autowired
    private CandidateRepo candidateRepo;
    @Override
    public Candidate saveCandidate(Candidate candidate) {
        return candidateRepo.save(candidate);
    }

    @Override
    public List<Candidate> getAllCandidate() {
        return candidateRepo.findAll();
    }

    @Override
    public Candidate getById(String id) {
        return candidateRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("Executive","Id",id));
    }

    @Override
    public void deleteCandidate(String id) {
        candidateRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("Candidate","Id",id));
        candidateRepo.deleteById(id);
    }
}

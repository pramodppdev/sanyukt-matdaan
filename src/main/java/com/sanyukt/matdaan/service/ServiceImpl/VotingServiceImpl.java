package com.sanyukt.matdaan.service.ServiceImpl;

import com.sanyukt.matdaan.repo.VotingRepo;
import com.sanyukt.matdaan.service.VotingService;
import model.Voting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VotingServiceImpl implements VotingService {

    @Autowired
    private VotingRepo votingRepo;

    @Override
    public Voting saveVoting(Voting voting) {
        return votingRepo.save(voting);
    }
}

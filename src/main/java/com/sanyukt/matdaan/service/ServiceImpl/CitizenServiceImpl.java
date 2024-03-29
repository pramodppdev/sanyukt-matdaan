package com.sanyukt.matdaan.service.ServiceImpl;

import com.sanyukt.matdaan.exception.ResourceNotFoundException;
import com.sanyukt.matdaan.model.Citizen;
import com.sanyukt.matdaan.repo.CitizenRepo;
import com.sanyukt.matdaan.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.naming.AuthenticationException;
import java.util.List;
import java.util.Objects;

@Service
public class CitizenServiceImpl implements CitizenService {

    @Autowired
    private CitizenRepo citizenRepo;
    @Override
    public Citizen saveCitizen(Citizen citizen) {
        citizen.setCheckstatus(0);
        return citizenRepo.save(citizen);
    }

    @Override
    public void updateStatus(String voterId) {
        Citizen citizen = citizenRepo.findAllByVoterId(voterId);

        if (citizen == null) {
            throw new ResourceNotFoundException("Citizen", "Voter ID", voterId);
        }

        citizen.setCheckstatus(1); // Update citizen status to 1
        citizenRepo.save(citizen);
    }

    @Override
    public List<Citizen> getAllCitizen() {
        return citizenRepo.findAll();
    }

    @Override
    public Citizen getById(String id) {
        return citizenRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Citizen","Id",id));
    }

    @Override
    public void deleteCitizen(String id) {
        citizenRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("Citizen","Id",id));
        citizenRepo.deleteById(id);
    }

    @Override
    public Citizen citizenAuth(Citizen citizen) throws AuthenticationException {

        if (StringUtils.isEmpty(citizen.getVoterId()) || StringUtils.isEmpty(citizen.getPassword()) || StringUtils.isEmpty(citizen.getCheckstatus()) )  {
            throw new AuthenticationException("Invalid user credentials");
        }

        Citizen authenticatedPOJO = citizenRepo.findAllByVoterId(citizen.getVoterId());

        if (authenticatedPOJO == null) {
            throw new AuthenticationException("User does not exist");
        }

        if (Objects.equals(citizen.getPassword(), authenticatedPOJO.getPassword())) {
            authenticatedPOJO.setPassword("");
            authenticatedPOJO.getCheckstatus();
            return authenticatedPOJO;
        }

        throw new AuthenticationException("Invalid user credentials");
    }
}






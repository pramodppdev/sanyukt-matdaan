package com.sanyukt.matdaan.service.ServiceImpl;

import com.sanyukt.matdaan.exception.ResourceNotFoundException;
import com.sanyukt.matdaan.model.Executive;
import com.sanyukt.matdaan.pojo.CitizenVO;
import com.sanyukt.matdaan.pojo.ExectiveVO;
import com.sanyukt.matdaan.repo.ExecutiveRepo;
import com.sanyukt.matdaan.service.ExecutiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.naming.AuthenticationException;
import java.util.List;
import java.util.Objects;

@Service
public class ExecutiveServiceImpl implements ExecutiveService {

    @Autowired
    private ExecutiveRepo executiveRepo;
    @Override
    public Executive saveExe(Executive executive) {
        return executiveRepo.save(executive);
    }

    @Override
    public List<Executive> getAllExe() {
        return executiveRepo.findAll();
    }

    @Override
    public Executive getById(String id) {
        return executiveRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Executive","Id",id));
    }

    @Override
    public void deleteExe(String id) {
        executiveRepo.findById(id).orElseThrow(()->  new ResourceNotFoundException("Executive","Id",id));
        executiveRepo.deleteById(id);
    }

    @Override
    public ExectiveVO exeAuth(ExectiveVO exectiveVO) throws AuthenticationException
    {

        if (StringUtils.isEmpty(exectiveVO.getUsername()) ||StringUtils.isEmpty(exectiveVO.getPassword())) {
            throw new AuthenticationException("Invalid user Credentials");
        }

        ExectiveVO authenticatedPOJO = executiveRepo.findAllByUserName(exectiveVO.getUsername());


        if (authenticatedPOJO == null ) {
            throw new AuthenticationException("User Does not exists ");
        }

        //TODO: Credentials authentication logic
        if(Objects.equals(exectiveVO.getUsername(), authenticatedPOJO.getUsername())
                && Objects.equals(exectiveVO.getPassword(), authenticatedPOJO.getPassword()))
        {
            authenticatedPOJO.setPassword("");
            return authenticatedPOJO;
        }

        throw new AuthenticationException("Invalid user Credentials");
    }
}

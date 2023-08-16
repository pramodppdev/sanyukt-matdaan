package com.sanyukt.matdaan.service;

import com.sanyukt.matdaan.model.Executive;
import com.sanyukt.matdaan.pojo.CitizenVO;
import com.sanyukt.matdaan.pojo.ExectiveVO;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;
import java.util.List;

@Service
public interface ExecutiveService {

    Executive saveExe(Executive executive);

    List<Executive> getAllExe();

    Executive getById(String id);

    void deleteExe(String id);

    ExectiveVO exeAuth(ExectiveVO exectiveVO) throws AuthenticationException;

}

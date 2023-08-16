package com.sanyukt.matdaan.webcontroller;

import com.sanyukt.matdaan.model.Citizen;
import com.sanyukt.matdaan.pojo.CitizenVO;
import com.sanyukt.matdaan.pojo.ExectiveVO;
import com.sanyukt.matdaan.service.CitizenService;
import com.sanyukt.matdaan.service.ExecutiveService;
import com.sanyukt.matdaan.service.ServiceImpl.CitizenServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.naming.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String citizenlogin(){
        return "citizenlogin";
    }

    @GetMapping("/exec")
    public String login(){
        return "login";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/citizen")
    public String citizen(){
        return "citizen";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    @GetMapping("/addexec")
    public String addExec(){
        return "addexecutive";
    }

    @GetMapping("/addcitizen")
    public String addCiti(){
        return "addcitizen";
    }

    @GetMapping("/addcandidate")
    public String addCand(){
        return "addcandidate";
    }

    @GetMapping("/listciti")
    public String listCitizens(){
        return "listcitizen";
    }

    @GetMapping("/listcand")
    public String listCandidate(){
        return "listcandidate";
    }

    @GetMapping("/listexec")
    public String listExecutives(){
        return "listexecutive";
    }


    @GetMapping("/candidates")
    public String candidates(){
        return "candidate";
    }

    @GetMapping("/results")
    public String results(){
        return "results";
    }

    @GetMapping("/adddist")
    public String addDistrict(){
        return "adddistrict";
    }

    @GetMapping("/addtaluk")
    public String addTaluk(){
        return "addtaluk";
    }

    @GetMapping("/addvill")
    public String addVillage(){
        return "addvillage";
    }

    @GetMapping("/listdist")
    public String listDistrict(){
        return "listdistrict";
    }

    @GetMapping("/listtal")
    public String listTaluk(){
        return "listtaluk";
    }

    @GetMapping("/listvill")
    public String listVillage(){
        return "listvillage";
    }
    @GetMapping("/ccl")
    public String citizenCandList(){
        return "citizencandlist";
    }

    @Autowired
    CitizenService citizenService;

    @PostMapping("/auth/citizen")
    @ResponseBody
    public String citizenAuth(HttpServletRequest request, HttpServletResponse response, @RequestBody Citizen citizen) throws AuthenticationException
    {
        try {
            Citizen citizens = citizenService.citizenAuth(citizen);
            System.out.println(citizen);

            if (citizens != null) {
                HttpSession session = request.getSession(true);

                List<SimpleGrantedAuthority> authorities = new ArrayList<>();
                authorities.add(new SimpleGrantedAuthority("USER"));

                // unique authentication token
                Authentication myToken = new UsernamePasswordAuthenticationToken(citizen.getVoterId(), citizen.getPassword(), authorities);
                SecurityContext context = SecurityContextHolder.createEmptyContext();
                context.setAuthentication(myToken);

                // session attributes values
                session.setAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY, context);
                session.setAttribute("Status", "Succees");
                session.setAttribute("Checkstatus", citizens.getCheckstatus()); // Set the checkstatus in session attributes

                return "en";
            }
        }catch (AuthenticationException e){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            throw new AuthenticationException("Invalid Credentials");
        }
        return "fail";
    }

    @Autowired
    ExecutiveService executiveService;
    @PostMapping("/auth/exec")
    @ResponseBody
    public String exeAuth(HttpServletRequest request, HttpServletResponse response, @RequestBody ExectiveVO exectiveVO) throws AuthenticationException
    {
        try {
            ExectiveVO exective = executiveService.exeAuth(exectiveVO);

            if (exective != null) {
                HttpSession session = request.getSession(true);

                List<SimpleGrantedAuthority> authorities = new ArrayList<>();
                authorities.add(new SimpleGrantedAuthority("USER"));

                // unique authentication token
                Authentication myToken = new UsernamePasswordAuthenticationToken(exective.getUsername(), exective.getPassword(), authorities);
                SecurityContext context = SecurityContextHolder.createEmptyContext();
                context.setAuthentication(myToken);

                // session attributes values
                session.setAttribute(HttpSessionSecurityContextRepository.SPRING_SECURITY_CONTEXT_KEY, context);
                session.setAttribute("Status", "Succees");
                return "sucess";
            }
        }catch (AuthenticationException e){
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            throw new AuthenticationException("Invalid Credentials");
        }
        return "fail";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse respons){
        request.getSession(false).removeAttribute("USER");
        request.getSession(false).invalidate();
        return "/";
    }




}





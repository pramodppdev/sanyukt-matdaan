package com.sanyukt.matdaan.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}

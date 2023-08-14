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

}

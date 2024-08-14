package com.sivakumar.Thymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ThymeleafController {

//    @GetMapping("/hello")
//    public String sayHello(Model model){
//        model.addAttribute("theDate",java.time.LocalDateTime.now());
//        return "helloworld";
//    }

    @GetMapping("/showform")
    public String showForm(){
        return "helloworld-form";
    }

    @GetMapping("/showprocess")
    public String showProcess(){
        return "helloworld";
    }

    @PostMapping("/showprocessv2")
    public String letsShoutDude(HttpServletRequest request,Model model){
        String theName=request.getParameter("studentName");
        theName=theName.toUpperCase();
        String result= "Yo! From V2"+ theName;
        model.addAttribute("message",result);
        return "helloworld";
    }
    @PostMapping("/showprocessv3")
    public String letsShoutDudeV3(@RequestParam("studentName") String theName, Model model){
        theName=theName.toUpperCase();
        String result= "Yo! From V3"+ theName;
        model.addAttribute("message",result);
        return "helloworld";
    }

}

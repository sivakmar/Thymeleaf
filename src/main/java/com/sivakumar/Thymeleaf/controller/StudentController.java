package com.sivakumar.Thymeleaf.controller;

import com.sivakumar.Thymeleaf.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;
    @Value("languages")
    private List<String> languages;
    @GetMapping("/showstudentform")
    public String showForm(Model model){

        Student theStudent=new Student();
        model.addAttribute("student",theStudent);
        model.addAttribute("countries",countries);
        model.addAttribute("languages",languages);
        return "student-form";

    }

    @PostMapping("/processstudentform")
    public String showConfirmation(@ModelAttribute("student") Student theStudent)
    {
        System.out.println(theStudent.getFirstName()+" : "+theStudent.getLastName());
        return "student-confirmation";
    }
}

package com.university.MedicalRecords.controllers.view;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String getIndex(Model model){
        final String welcomeMessage = "Welcome to Medical Records";
        model.addAttribute("welcome",welcomeMessage);
        return "index";
    }
}
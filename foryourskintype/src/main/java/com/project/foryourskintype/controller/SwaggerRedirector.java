package com.project.foryourskintype.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwaggerRedirector {
    @GetMapping("/api/usage")
    public String api(){
        return "redirect:/swagger-ui/index.html";
    }
}

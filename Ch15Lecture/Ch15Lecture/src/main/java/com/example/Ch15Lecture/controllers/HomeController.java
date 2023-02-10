package com.example.Ch15Lecture.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    // Here we have a method that will render home .html view
    // at localhost:8080
    @GetMapping("/")
    public String renderHome() {
        return "home";
    }

}

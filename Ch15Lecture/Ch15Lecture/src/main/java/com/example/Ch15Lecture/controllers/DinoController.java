package com.example.Ch15Lecture.controllers;

import com.example.Ch15Lecture.data.DinoData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dino")     // connects to dino path
public class DinoController {

    // lives at /dino
    @GetMapping
    public String handlesIndex(Model model) {
        model.addAttribute("allDinos", DinoData.getAllDinos());
        return "dino/index";
    }

}

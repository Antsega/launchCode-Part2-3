package com.example.Ch15Lecture.controllers;

import com.example.Ch15Lecture.data.DinoData;
import com.example.Ch15Lecture.models.Dinosaur;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    // lives at /add
    @GetMapping("add")
    public String handlesAdd() {
        return "dino/add";
    }

    // handles post request from add
    @PostMapping("add")
    public String handlesAddPost(Model model, String species, String diet, String aquatic) {
        Dinosaur newDinoObj = new Dinosaur(species, diet, aquatic);
        DinoData.addDino(newDinoObj);

        // now that we have stored our dino object in all dinos list

        model.addAttribute("allDinos", DinoData.getAllDinos());

        return "dino/index";
    }

}

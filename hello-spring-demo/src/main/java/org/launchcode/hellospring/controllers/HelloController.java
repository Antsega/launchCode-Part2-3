package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    // Handles requests at path /hello
//    @GetMapping("hello") // handles get requests
//    @ResponseBody // prints hard text no template required
//    public String hello() {
//        return "Hello, Spring!";
//    }

    // localhost:8080/hello?name=<EnterName>
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
    public String homePage(@RequestParam String name, Model model) {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);
        return "hello";
    }


    // lives at /hello/form
    // Handles requests of the form /hello/LaunchCode
    @GetMapping("hello/{name}")
    public String helloWithPathParam(@PathVariable String name, Model model) {
        String greeting = "Hello, " + name + "!";
        model.addAttribute("greeting", greeting);;
        return "Hello";
    }

    @GetMapping("form")
    public String helloForm() {
        return "form";
    }

    @GetMapping("hello-names")
    public String helloNames(Model model) {
        List<String> names = new ArrayList<>();
        names.add("Tony");
        names.add("Nick");
        names.add("Java");
        names.add("Javascript");
        model.addAttribute("names", names);
        return "hello-list";
    }
}

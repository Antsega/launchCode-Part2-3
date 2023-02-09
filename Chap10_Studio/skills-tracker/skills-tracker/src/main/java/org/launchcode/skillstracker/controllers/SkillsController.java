package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public String list() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2><ol><li>Python</li>" +
                "<li>Javascript</li>" +
                "<li>Java</li>" +
                "</body>" +
                "</html>";
    }
    // 2)
    // /form
    // lets users select their favorite
    // second favorite
    // 3rd fav programming languages
    // use select elements for each of the rankings
    // GetMapping()
    @GetMapping("form")
    public String form() {
        return "<html>" +
                "<body>" +
                "<h1>Name</h1>" +
                "<label for='cars'>Choose your favorite languages:</label>" +
                "<select id='languages' name='languages' size='3'>" +
                    "<option value='Python'>Python</option>" +
                    "<option value='Javascript'>Javascript</option>" +
                    "<option value='Java'>Java</option>" +
                "</select>" +
                "</body>" +
                "</html>";
    }

    // 3)
    // also at /form
    // use PostMapping
    // RequestParam
    // to update the HTML with an h1 stanting the user's name and ol showing the
    // three programming languages in the order they chose
}

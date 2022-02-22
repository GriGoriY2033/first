package com.example.first;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class firstControlleer {

    @GetMapping("/greeting")
    public String greeting( Model model) {
        model.addAttribute("name", "gggggg");
        return "greeting";
    }

}
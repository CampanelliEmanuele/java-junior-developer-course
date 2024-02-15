package org.learning.hellospringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public String home(@RequestParam int faces, Model model) {
        Random random = new Random();
        int randomNumber = random.nextInt(1, (faces + 1));

        model.addAttribute("randomNumber", randomNumber);
        return "home";
    }

}

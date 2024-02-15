package orl.learning.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class RootController {

    @GetMapping
    public String home(@RequestParam(name = "year", required = true, defaultValue = "2024") String homeYear, @RequestParam(name = "name", required = true, defaultValue = "DystopiaCreators") String companyName, Model model) {
        model.addAttribute("year", homeYear);
        model.addAttribute("name", companyName);
        return "home";
    }

}

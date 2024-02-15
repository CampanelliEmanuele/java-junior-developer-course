package org.learning.springblogricette.controller;

import org.learning.springblogricette.model.Recipe;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.learning.springblogricette.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private RecipeRepository recipeRepository;

    @GetMapping
    public String home(@RequestParam(name = "keyword", required = false) String searchKeyword, Model model) {
        List<Recipe> recipeList;
        if (searchKeyword == null)
            recipeList = recipeRepository.findAll(Sort.by("creationDate").descending());
        else
            recipeList = recipeRepository.findByTitle(searchKeyword);
        model.addAttribute("recipeList", recipeList);
        model.addAttribute("preloadSearch", searchKeyword);
        return "home/home";
    }
}

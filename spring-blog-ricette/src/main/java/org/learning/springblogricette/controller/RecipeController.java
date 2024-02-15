package org.learning.springblogricette.controller;

import jakarta.validation.Valid;
import org.learning.springblogricette.model.Recipe;
import org.learning.springblogricette.repository.CategoryRepository;
import org.learning.springblogricette.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public String index(Model model) {
        List<Recipe> recipeList;
        recipeList = recipeRepository.findAll();
        model.addAttribute("recipeList", recipeList);
        return "/recipes/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        Recipe recipe = new Recipe();
        model.addAttribute("recipe", recipe);
        model.addAttribute("categoryList", categoryRepository.findAll());
        return "recipes/create";
    }

    @PostMapping("/create")
    public String store(@Valid @ModelAttribute("recipe") Recipe formRecipe, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("categoryList", categoryRepository.findAll());
            System.out.println(bindingResult.getAllErrors());
            return "recipes/create";
        }
        Recipe savedRecipe = recipeRepository.save(formRecipe);
        return "redirect:/recipes/show/" + savedRecipe.getId();
    }

    @GetMapping("/show/{id}")
    public String show(@PathVariable Integer id, Model model) {
        Optional<Recipe> result = recipeRepository.findById(id);
        if (result.isPresent()) {
            Recipe recipe = result.get();
            model.addAttribute("recipe", recipe);
            model.addAttribute("categoryList", categoryRepository.findAll());
            return "recipes/show";
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Recipe with id " + id + " not found");
        }
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        Optional<Recipe> result = recipeRepository.findById(id);
        if (result.isPresent()) {
            model.addAttribute("recipe", result.get());
            model.addAttribute("categoryList", categoryRepository.findAll());
            return "recipes/edit";
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Recipe with id " + id + " not found");
        }
    }

    @PostMapping("/edit/{id}")
    public String update(@PathVariable Integer id, @Valid @ModelAttribute("recipe") Recipe formRecipe,
                         BindingResult bindingResult) {
        Optional<Recipe> result = recipeRepository.findById(id);
        if (result.isPresent()) {
            if (bindingResult.hasErrors()) {
                System.out.println(bindingResult.getAllErrors());
                return "recipes/edit";
            }
            Recipe savedRecipe = recipeRepository.save(formRecipe);
            return "redirect:/recipes/show/" + id;
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Recipe with id " + id + " not found");
        }
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        Optional<Recipe> result = recipeRepository.findById(id);
        if (result.isPresent()) {
            recipeRepository.deleteById(id);
            redirectAttributes.addFlashAttribute("redirectMessage",
                    "Recipe " + result.get().getTitle() + " deleted!");
            return "redirect:/recipes";
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Recipe with di " + id + " not found");
        }
    }

}

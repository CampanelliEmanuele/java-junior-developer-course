package org.learning.randomdice.controller;

import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class DiceController {

  @GetMapping
  public String home() {
    return "home";
  }

  @GetMapping("dice") // si riferisce a una parte dell'url chiamato dal browser
  public String randomDice(@RequestParam(name = "type", defaultValue = "6") int typeParam,
      Model model) {
    // calcolo un numero rando tra 1 e 6
    Random randomGen = new Random();
    int randomNumber = randomGen.nextInt(1, typeParam + 1);
    // aggiungo un attributo alla mappa del model
    model.addAttribute("diceValue", randomNumber);
    // aggiungo un attributo che indica il tipo di dado
    model.addAttribute("diceType", typeParam);
    return "dice"; // si riferisce al nome del template nella cartella resources/templates
  }
}

package org.learning.hellospring.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
* classe annotata come Controller che risponde alla rotta indicata nel RequestMapping
* */
@Controller
@RequestMapping("/") // questa si collega con l'indirizzo chiamato dal browser
public class IndexController {
  @GetMapping // metodo che risponde a richieste di tipo GET
  public String index(@RequestParam String name, Model model){
    // calcolo l'istante corrente
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    // il  model è una mappa a cui posso aggiungere tanti attributi come chiave-valore
    model.addAttribute("currentDateTime", now.format(formatter));
    model.addAttribute("userName", name);

    // restituisce il nome del template della pagina richiesta
    return "home"; // questo è il nome del file nella cartella resources/templates
  }
}

package org.learning.springlamiapizzeriacrud.controller;

import jakarta.validation.Valid;
import org.learning.springlamiapizzeriacrud.model.Offer;
import org.learning.springlamiapizzeriacrud.model.Pizza;
import org.learning.springlamiapizzeriacrud.repository.OfferRepository;
import org.learning.springlamiapizzeriacrud.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.Optional;

@Controller
@RequestMapping("/offers")
public class OfferController {
    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    private OfferRepository offerRepository;

    // metodo per mostrare la pagina col form di creazione di una offer
    @GetMapping("/create")
    public String create(@RequestParam(name = "pizzaId", required = true) Integer pizzaId,
                         Model model) {
        // verifico se il book esiste su database
        Optional<Pizza> result = pizzaRepository.findById(pizzaId);
        if (result.isPresent()) {
            Pizza pizzaOnOffer = result.get();
            model.addAttribute("pizza", pizzaOnOffer);

            // preparo la offer per precaricare il form
            Offer newOffer = new Offer();
            newOffer.setPizza(pizzaOnOffer);
            newOffer.setStartDate(LocalDate.now());
            newOffer.setExpireDate(LocalDate.now().plusDays(30));
            model.addAttribute("offer", newOffer);
            // restituisco il template
            return "offers/create";
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pizza with id " + pizzaId + " not found");
        }
    }

    @PostMapping("/create")
    public String store(Offer formOffer) {
        // se non ci sono errori lo salvo su database
        Offer storedOffer = offerRepository.save(formOffer);
        // faccio una redirect alla pagina di dettaglio del libro
        return "redirect:/pizzas/show/" + storedOffer.getPizza().getId();
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        Optional<Offer> result = offerRepository.findById(id);
        if (result.isPresent()) {
            model.addAttribute("offer", result.get());
            return "offers/edit";
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Offer " + id + " not found");
        }
    }

//    @PostMapping("/edit/{id}")
//    public String update(@PathVariable Integer id, @Valid @ModelAttribute("offer") Offer formOffer,
//                         BindingResult bindingResult) {
//        Optional<Offer> result = offerRepository.findById(id);
//        if (result.isPresent()) {
//            Offer offerToEdit = result.get();
//            if (bindingResult.hasErrors())
//                return "offers/edit";
//
//            Offer savedOffer = offerRepository.save(formOffer);
//            return "redirect:/offers/show/" + id;
//        } else {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Offers " + id + " not found");
//        }
//    }

    @PostMapping("/edit/{id}")
    public String update(@PathVariable Integer id, @Valid @ModelAttribute("offer") Offer formOffer,
                         BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "offer/edit";
        }
        Offer updatedOffer = offerRepository.save(formOffer);
        return "redirect:/pizzas/show/" + updatedOffer.getPizza().getId();
    }

//    @PostMapping("/delete/{id}")
//    public String delete(@PathVariable Integer id) {
//        Optional<Offer> result = offerRepository.findById(id);
//        if (result.isPresent()) {
//            Offer offerToDelete = result.get();
//            offerRepository.delete(offerToDelete);
//            return "redirect:/pizzas/show/" + offerToDelete.getPizza().getId();
//        } else {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Offer " + id + " not found");
//        }
//
//    }

}

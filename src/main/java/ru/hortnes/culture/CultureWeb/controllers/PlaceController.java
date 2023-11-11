package ru.hortnes.culture.CultureWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.hortnes.culture.CultureWeb.services.PlacesService;

@Controller
@RequestMapping("/places")
public class PlaceController {

  private final PlacesService placesService;

  @Autowired
  public PlaceController(PlacesService placesService) {
    this.placesService = placesService;
  }

  @GetMapping()
  public String index(Model model) {
        model.addAttribute("places", placesService.findAll());
        return "places/index";
    }
  @GetMapping("/{id}")
  public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("place", placesService.findOne(id));
        return "places/show";
    }
}

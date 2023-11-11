package ru.hortnes.culture.CultureWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.hortnes.culture.CultureWeb.services.RoutesService;

@Controller
@RequestMapping("/routes")
public class RoutesController {

  private final RoutesService routesService;

  @Autowired
  public RoutesController(RoutesService routesService) {
    this.routesService = routesService;
  }

  @GetMapping()
  public String index(Model model) {
        model.addAttribute("routes", routesService.findAll());
        return "routes/index";
    }
  @GetMapping("/{id}")
  public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("route", routesService.findOne(id));
        return "routes/show";
    }
}

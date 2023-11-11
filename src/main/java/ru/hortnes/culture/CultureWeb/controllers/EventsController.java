package ru.hortnes.culture.CultureWeb.controllers;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.hortnes.culture.CultureWeb.services.EventsService;

@Controller
@RequestMapping("/events")
public class EventsController {

  private final EventsService eventsService;

  @Autowired
  public EventsController(EventsService eventsService) {
    this.eventsService = eventsService;
  }

//  @GetMapping("/{day}")
//  public String index(Model model, @PathVariable("day") Date day) {
//        model.addAttribute("events", eventsService.findByDay(day));
//        return "events/index";
//    }

  @GetMapping
  public String index(Model model) {
      model.addAttribute("events", eventsService.findAll());
      return "events/index";
    }
  @GetMapping("/{id}")
  public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("event", eventsService.findOne(id));
        return "events/show";
    }
}

package ru.hortnes.culture.CultureWeb.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.hortnes.culture.CultureWeb.models.Person;
import ru.hortnes.culture.CultureWeb.services.RegistrationService;
import ru.hortnes.culture.CultureWeb.util.PersonValidation;

@Controller
@RequestMapping("/auth")
public class AuthController {

  private final RegistrationService registrationService;
  private final PersonValidation personValidation;

  @Autowired
  public AuthController(RegistrationService registrationService, PersonValidation personValidation) {
    this.registrationService = registrationService;
    this.personValidation = personValidation;
  }


  @GetMapping("/login")
  public String loginPage(){
    return "auth/login";
  }

  @GetMapping("/registration")
  public String registrationPage(@ModelAttribute("person")Person person){
    return "/auth/registration";
  }

  @PostMapping("/registration")
  public String performRegistration(@ModelAttribute("person") @Valid Person person,
      BindingResult bindingResult){

    personValidation.validate(person, bindingResult);

    if(bindingResult.hasErrors())
      return "/auth/registration";

    registrationService.registr(person);

    return "redirect:/auth/login";
  }
}

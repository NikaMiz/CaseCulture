package ru.hortnes.culture.CultureWeb.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.hortnes.culture.CultureWeb.models.Person;
import ru.hortnes.culture.CultureWeb.services.PersonDetailsService;

@Component
public class PersonValidation implements Validator {

  private final PersonDetailsService personDetailsService;

  @Autowired
  public PersonValidation(PersonDetailsService personDetailsService) {
    this.personDetailsService = personDetailsService;
  }

  @Override
  public boolean supports(Class<?> aClass) {
    return Person.class.equals(aClass);
  }

  @Override
  public void validate(Object o, Errors errors) {
    Person person = (Person) o;

    try {
      personDetailsService.loadUserByUsername(person.getUsername());
    } catch (UsernameNotFoundException ignored){
      return;
    }

    errors.rejectValue("username", "", "Человек с такой почтой уже зарегистрирован");
  }
}

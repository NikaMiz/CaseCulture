package ru.hortnes.culture.CultureWeb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.hortnes.culture.CultureWeb.models.Person;
import ru.hortnes.culture.CultureWeb.repositories.PeopleRepository;

@Service
public class RegistrationService {

  private final PeopleRepository peopleRepository;

  @Autowired
  public RegistrationService(PeopleRepository peopleRepository) {
    this.peopleRepository = peopleRepository;
  }

  @Transactional
  public void registr(Person person){
    peopleRepository.save(person);
  }
}

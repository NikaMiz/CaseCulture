package ru.hortnes.culture.CultureWeb.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.hortnes.culture.CultureWeb.models.Event;
import ru.hortnes.culture.CultureWeb.repositories.EventsRepository;

@Service
@Transactional(readOnly = true)
public class EventsService {

  private final EventsRepository eventsRepository;

  @Autowired
  public EventsService(EventsRepository eventsRepository) {
    this.eventsRepository = eventsRepository;
  }

  public List<Event> findAll(){
    return eventsRepository.findAll();
  }

//  public List<Event> findByDay(Date day) {
//
//    return eventsRepository.findByDay(day);
//    }
  public Event findOne(int id) {
    Optional<Event> foundEvent = eventsRepository.findById(id);
    return foundEvent.orElse(null);
    }
}

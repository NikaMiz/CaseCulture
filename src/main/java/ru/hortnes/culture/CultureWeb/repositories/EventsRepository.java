package ru.hortnes.culture.CultureWeb.repositories;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.hortnes.culture.CultureWeb.models.Event;

public interface EventsRepository extends JpaRepository<Event, Integer> {

  List<Event> findByDay(Date day);
}

package ru.hortnes.culture.CultureWeb.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.hortnes.culture.CultureWeb.models.Place;
import ru.hortnes.culture.CultureWeb.repositories.PlacesRepository;

@Service
@Transactional(readOnly = true)
public class PlacesService {

  private final PlacesRepository placesRepository;

  @Autowired
  public PlacesService(PlacesRepository placesRepository) {
    this.placesRepository = placesRepository;
  }

  public List<Place> findAll() {
        return placesRepository.findAll();
    }
  public Place findOne(int id) {
    Optional<Place> foundPlace = placesRepository.findById(id);
    return foundPlace.orElse(null);
    }
}

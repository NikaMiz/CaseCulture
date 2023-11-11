package ru.hortnes.culture.CultureWeb.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.hortnes.culture.CultureWeb.models.Route;
import ru.hortnes.culture.CultureWeb.repositories.RoutesRepository;

@Service
@Transactional(readOnly = true)
public class RoutesService {

  private final RoutesRepository routesRepository;

  @Autowired
  public RoutesService(RoutesRepository routsRepository) {
    this.routesRepository = routsRepository;
  }

  public List<Route> findAll() {
        return routesRepository.findAll();
    }

    public Route findOne(int id) {
        Optional<Route> foundRoute = routesRepository.findById(id);
        return foundRoute.orElse(null);
    }
}

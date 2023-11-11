package ru.hortnes.culture.CultureWeb.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.hortnes.culture.CultureWeb.models.Place;

public interface PlacesRepository extends JpaRepository<Place, Integer> {

}

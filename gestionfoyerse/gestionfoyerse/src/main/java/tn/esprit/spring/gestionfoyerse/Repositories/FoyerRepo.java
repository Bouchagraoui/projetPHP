package tn.esprit.spring.gestionfoyerse.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionfoyerse.entity.Foyer;

@Repository

public interface FoyerRepo extends CrudRepository<Foyer,Long> {
}

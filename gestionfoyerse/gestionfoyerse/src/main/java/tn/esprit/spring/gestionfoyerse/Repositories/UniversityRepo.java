package tn.esprit.spring.gestionfoyerse.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionfoyerse.entity.universite;

@Repository

public interface UniversityRepo extends CrudRepository<universite,Long> {
}

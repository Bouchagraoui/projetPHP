package tn.esprit.spring.gestionfoyerse.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionfoyerse.entity.Etudiant;

@Repository

public interface EtudiantRepo extends CrudRepository<Etudiant,Long> {
}

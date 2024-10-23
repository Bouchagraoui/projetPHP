package tn.esprit.spring.gestionfoyerse.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionfoyerse.entity.Reservation;

@Repository

public interface ReservationRepo extends CrudRepository<Reservation,Long> {
}

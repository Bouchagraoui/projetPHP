package tn.esprit.spring.gestionfoyerse.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionfoyerse.Repositories.ReservationRepo;
import tn.esprit.spring.gestionfoyerse.ServiceInterface.InterfaceReservationService;
import tn.esprit.spring.gestionfoyerse.entity.Reservation;

import java.util.List;
@Service
@AllArgsConstructor

public class ReservationServiceImpl implements InterfaceReservationService {

    ReservationRepo reservationRepo;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return (List<Reservation>) reservationRepo.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepo.save(res);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return null;
    }
}

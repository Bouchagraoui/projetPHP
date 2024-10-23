package tn.esprit.spring.gestionfoyerse.ServiceInterface;

import tn.esprit.spring.gestionfoyerse.entity.Reservation;

import java.util.List;

public interface InterfaceReservationService {
    List<Reservation> retrieveAllReservation();
    Reservation updateReservation (Reservation res);
    Reservation retrieveReservation (String idReservation);

}

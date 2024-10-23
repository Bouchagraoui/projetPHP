package tn.esprit.spring.gestionfoyerse.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.gestionfoyerse.ServiceInterface.InterfaceReservationService;
import tn.esprit.spring.gestionfoyerse.entity.Reservation;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/getallreservation")
public class ReservationController {
    InterfaceReservationService interfaceReservationService;
    @GetMapping("/GetReservation")
    public List<Reservation> retrieveAllReservation() {return interfaceReservationService.retrieveAllReservation();}
    @PutMapping("/update")
    public Reservation updateReservation(Reservation res) {return interfaceReservationService.updateReservation(res);}
    @GetMapping("/get/{idReservation}")
    public Reservation retrieveReservation(String idReservation) { return interfaceReservationService.retrieveReservation(idReservation);}
}

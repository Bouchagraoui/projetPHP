package tn.esprit.spring.gestionfoyerse.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.gestionfoyerse.ServiceInterface.InterfaceChambreService;
import tn.esprit.spring.gestionfoyerse.ServiceInterface.InterfaceFoyerService;
import tn.esprit.spring.gestionfoyerse.entity.Foyer;
import tn.esprit.spring.gestionfoyerse.entity.Reservation;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/getallchamber")

public class ChambreController {
    InterfaceChambreService interfaceChambreService;
    @GetMapping("/GetChambre")
    public List<Reservation> retrieveAllReservation() { return interfaceChambreService.retrieveAllReservation();}
    @PutMapping("/update")
    public Reservation updateReservation(Reservation res) { return interfaceChambreService.updateReservation(res);}
    @GetMapping("/get/{idChambre}")
    public Reservation retrieveReservation(String idReservation) {return interfaceChambreService.retrieveReservation(idReservation);}
}


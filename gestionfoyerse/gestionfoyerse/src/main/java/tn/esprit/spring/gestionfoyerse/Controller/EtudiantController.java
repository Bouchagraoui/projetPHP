package tn.esprit.spring.gestionfoyerse.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionfoyerse.ServiceInterface.InterfaceEtudiantService;
import tn.esprit.spring.gestionfoyerse.entity.Etudiant;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/getalletudiant")
public class EtudiantController {
    InterfaceEtudiantService interfaceEtudiantService;
    @GetMapping("/GetEtudiant")
    public List<Etudiant> retrieveAllEtudiants() { return interfaceEtudiantService.retrieveAllEtudiants();}
    @PostMapping("/add")
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) { return interfaceEtudiantService.addEtudiants(etudiants);}
    @PutMapping("/update")
    public Etudiant updateEtudiant(Etudiant e) { return interfaceEtudiantService.updateEtudiant(e);}
    @GetMapping("/get/{idEtudiant}")
    public Etudiant retrieveEtudiant(long idEtudiant) {return interfaceEtudiantService.retrieveEtudiant(idEtudiant);}
    @DeleteMapping("/delete/{idEtudiant}")
    public void removeEtudiant(long idEtudiant) { interfaceEtudiantService.removeEtudiant(idEtudiant);}
}

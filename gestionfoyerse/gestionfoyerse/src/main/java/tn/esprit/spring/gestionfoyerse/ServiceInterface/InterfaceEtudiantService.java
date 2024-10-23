package tn.esprit.spring.gestionfoyerse.ServiceInterface;

import tn.esprit.spring.gestionfoyerse.entity.Etudiant;
import tn.esprit.spring.gestionfoyerse.entity.Reservation;

import java.util.List;

public interface InterfaceEtudiantService {
    List<Etudiant> retrieveAllEtudiants();
    List<Etudiant> addEtudiants (List<Etudiant> etudiants);
    Etudiant updateEtudiant (Etudiant e);
    Etudiant retrieveEtudiant(long idEtudiant);
    void removeEtudiant(long idEtudiant);


}

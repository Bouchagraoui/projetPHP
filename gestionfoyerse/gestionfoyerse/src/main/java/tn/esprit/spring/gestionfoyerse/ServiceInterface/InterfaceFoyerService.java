package tn.esprit.spring.gestionfoyerse.ServiceInterface;

import tn.esprit.spring.gestionfoyerse.entity.Foyer;

import java.util.List;

public interface InterfaceFoyerService {

    List<Foyer> retrieveAllFoyers();
    Foyer addFoyer (Foyer f);
    Foyer updateFoyer (Foyer f);
    Foyer retrieveFoyer (long idFoyer);
    void removeFoyer (long idFoyer);

}

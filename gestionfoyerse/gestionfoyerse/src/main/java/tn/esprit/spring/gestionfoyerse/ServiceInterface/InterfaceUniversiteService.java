package tn.esprit.spring.gestionfoyerse.ServiceInterface;

import tn.esprit.spring.gestionfoyerse.entity.universite;

import java.util.List;

public interface InterfaceUniversiteService {
    List<universite> retrieveAllUniversities();
    universite addUniversite (universite u);
    universite updateUniversite (universite u);
    universite retrieveUniversite (long idUniversite);

}

package tn.esprit.spring.gestionfoyerse.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionfoyerse.Repositories.EtudiantRepo;
import tn.esprit.spring.gestionfoyerse.ServiceInterface.InterfaceEtudiantService;
import tn.esprit.spring.gestionfoyerse.entity.Etudiant;

import java.util.List;
@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements InterfaceEtudiantService {

    EtudiantRepo etudiantRepo;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return (List<Etudiant>) etudiantRepo.findAll();
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return (List<Etudiant>) etudiantRepo.saveAll(etudiants);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return  etudiantRepo.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(long idEtudiant) {
        return etudiantRepo.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(long idEtudiant) {
        etudiantRepo.deleteById(idEtudiant);

    }
}

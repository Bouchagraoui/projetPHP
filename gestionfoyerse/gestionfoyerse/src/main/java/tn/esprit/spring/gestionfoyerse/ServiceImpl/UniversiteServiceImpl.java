package tn.esprit.spring.gestionfoyerse.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionfoyerse.Repositories.UniversityRepo;
import tn.esprit.spring.gestionfoyerse.ServiceInterface.InterfaceUniversiteService;
import tn.esprit.spring.gestionfoyerse.entity.universite;

import java.util.List;
@Service
@AllArgsConstructor

public class UniversiteServiceImpl implements InterfaceUniversiteService {

    UniversityRepo universityRepo;
    @Override
    public List<universite> retrieveAllUniversities() {
        return (List<universite>) universityRepo.findAll();
    }

    @Override
    public universite addUniversite(universite u) {
        return universityRepo.save(u);
    }

    @Override
    public universite updateUniversite(universite u) {
        return universityRepo.save(u);
    }

    @Override
    public universite retrieveUniversite(long idUniversite) {
        return universityRepo.findById(idUniversite).orElse(null);
    }
}

package tn.esprit.spring.gestionfoyerse.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionfoyerse.Repositories.FoyerRepo;
import tn.esprit.spring.gestionfoyerse.ServiceInterface.InterfaceFoyerService;
import tn.esprit.spring.gestionfoyerse.entity.Foyer;

import java.util.List;

@AllArgsConstructor
@Service
public class FoyerServiceImpl implements InterfaceFoyerService {

    FoyerRepo foyerRepo;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return (List<Foyer>) foyerRepo.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepo.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepo.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return foyerRepo.findById(idFoyer).orElse(null);
    }

    @Override
    public void removeFoyer(long idFoyer) {
        foyerRepo.deleteById(idFoyer);

    }
}

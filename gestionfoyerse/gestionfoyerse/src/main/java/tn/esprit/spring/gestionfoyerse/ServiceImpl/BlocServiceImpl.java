package tn.esprit.spring.gestionfoyerse.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionfoyerse.Repositories.BlocRepo;
import tn.esprit.spring.gestionfoyerse.ServiceInterface.InterfaceBlocService;
import tn.esprit.spring.gestionfoyerse.entity.Bloc;

import java.util.List;
@Service
@AllArgsConstructor

public class BlocServiceImpl implements InterfaceBlocService {

    BlocRepo blocRepo;
    @Override
    public List<Bloc> retrieveBlocs() {
        return (List<Bloc>) blocRepo.findAll();
    }
    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepo.save(bloc);
    }
    @Override
    public Bloc addBloc(Bloc bloc) { return blocRepo.save(bloc);}
    @Override
    public Bloc retrieveBloc(long idBloc) {
        return blocRepo.findById(idBloc).orElse(null);
    }
    @Override
    public Bloc removeBloc(long idBloc) {
        blocRepo.deleteById(idBloc);
        return null;
    }
}

package tn.esprit.spring.gestionfoyerse.ServiceInterface;

import tn.esprit.spring.gestionfoyerse.entity.Bloc;

import java.util.List;

public interface InterfaceBlocService {
    List<Bloc> retrieveBlocs();
    Bloc updateBloc (Bloc bloc);
    Bloc addBloc (Bloc bloc);
    Bloc retrieveBloc (long idBloc);
    Bloc removeBloc (long idBloc);

}

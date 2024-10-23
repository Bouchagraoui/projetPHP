package tn.esprit.spring.gestionfoyerse.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionfoyerse.ServiceInterface.InterfaceBlocService;
import tn.esprit.spring.gestionfoyerse.entity.Bloc;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("bloc")
public class BlocController {
    InterfaceBlocService interfaceBlocService;

    @GetMapping("/GetBloc")
    public List<Bloc> retrieveBlocs() {
        return interfaceBlocService.retrieveBlocs();
    }
    @PutMapping("/update")
    public Bloc updateBloc(Bloc bloc) {
        return interfaceBlocService.updateBloc(bloc);
    }
    @PostMapping("/ajouterBloc")
    public Bloc addBloc(@RequestBody Bloc bloc) {  return interfaceBlocService.addBloc(bloc);}
    @GetMapping("/get/{idBloc}")
    public Bloc retrieveBloc( @PathVariable long idBloc) { return interfaceBlocService.retrieveBloc(idBloc); }
    @DeleteMapping ("/delete/{idBloc}")
    public Bloc removeBloc(@PathVariable long idBloc) { return interfaceBlocService.removeBloc(idBloc); }
}

package tn.esprit.spring.gestionfoyerse.Controller;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionfoyerse.ServiceInterface.InterfaceFoyerService;
import tn.esprit.spring.gestionfoyerse.entity.Foyer;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/getallfoyer")
public class FoyerController {
    InterfaceFoyerService interfaceFoyerService;

    @GetMapping("/GetFoyer")
    public List<Foyer> retrieveAllFoyers() {
        return interfaceFoyerService.retrieveAllFoyers();
    }
    @PostMapping("/add")
    public Foyer addFoyer(Foyer f) {
        return interfaceFoyerService.addFoyer(f);
    }
    @PutMapping("/update")
    public Foyer updateFoyer(Foyer f) {
        return interfaceFoyerService.updateFoyer(f);
    }
    @GetMapping("/get/{idFoyer}")
    public Foyer retrieveFoyer(long idFoyer) {
        return interfaceFoyerService.retrieveFoyer(idFoyer);
    }
    @DeleteMapping("/delete/{idFoyer}")
    public void removeFoyer(long idFoyer) {
        interfaceFoyerService.removeFoyer(idFoyer);
    }
}

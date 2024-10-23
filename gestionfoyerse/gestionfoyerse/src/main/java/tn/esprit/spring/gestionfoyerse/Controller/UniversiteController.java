package tn.esprit.spring.gestionfoyerse.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionfoyerse.ServiceInterface.InterfaceUniversiteService;
import tn.esprit.spring.gestionfoyerse.entity.universite;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/getalluniversite")
public class UniversiteController {
    InterfaceUniversiteService interfaceUniversiteService;
    @GetMapping("/GetUniversite")
    public List<universite> retrieveAllUniversities() {return interfaceUniversiteService.retrieveAllUniversities();}
    @PostMapping("/add")
    public universite addUniversite(universite u) {return interfaceUniversiteService.addUniversite(u);}
    @PutMapping("/update")
    public universite updateUniversite(universite u) {return interfaceUniversiteService.updateUniversite(u);}
    @GetMapping("/get/{idUniversite}")
    public universite retrieveUniversite(long idUniversite) {return interfaceUniversiteService.retrieveUniversite(idUniversite);}
}

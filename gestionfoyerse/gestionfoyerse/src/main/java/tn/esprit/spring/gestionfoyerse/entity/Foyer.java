package tn.esprit.spring.gestionfoyerse.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.List;

@Entity

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Foyer {

    @Id
    @Setter(AccessLevel.NONE)
    long idFoyer;
     String nomFoyer;
    long capaciteFoyer;
    @OneToOne(mappedBy = "f")
    private universite u;
    @OneToMany(mappedBy = "f")
   private List<Bloc>  blocs;
}

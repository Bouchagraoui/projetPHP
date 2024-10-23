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
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idBloc;

    String nomBloc;
    long capaciteBloc;

    @ManyToOne
    Foyer f;

    @OneToMany(mappedBy = "b")
    private List<Chambre> chambres;
}

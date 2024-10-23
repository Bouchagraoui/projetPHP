package tn.esprit.spring.gestionfoyerse.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long idReservation;

    @Temporal(TemporalType.DATE)
    Date anneeUniversitaire;

    boolean estValide;

    @ManyToMany
    private List<Etudiant> etudiants;


}

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

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)

     long idEtudiant;
     String nomEt;
     String prenomEt;
     long cin;
     String ecole;
     Date dateNaissance;
     @ManyToMany(mappedBy = "etudiants")
    private List<Reservation> reservations;
}

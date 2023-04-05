package ma.enset.projetinv.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Table
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String nom;
    @OneToMany(mappedBy = "filiere",fetch =FetchType.LAZY )
    private Collection<Etudiant> etudiants ;

    @ManyToOne
    private Departement departement;
}

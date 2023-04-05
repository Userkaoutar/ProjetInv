package ma.enset.projetinv.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

@Table
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private String utite_d_accueil;
    @Temporal(TemporalType.DATE)
    private Date date_debut;
    @Temporal(TemporalType.DATE)
    private Date date_fin;
    @OneToMany(mappedBy = "stage")
    private Collection<Livrable> livrables;
    @OneToMany(mappedBy = "stage")
    private Collection<Projet> projets;
    @OneToOne
    private Etudiant etudiant;
    @OneToOne
    private Entreprise entreprise;
    @ManyToOne
    private Annee_universitaire annee_univ;
}
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
public class Annee_universitaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String valeur;
    @OneToMany(mappedBy = "annee_univ")
    private Collection<Stage> stages;
}

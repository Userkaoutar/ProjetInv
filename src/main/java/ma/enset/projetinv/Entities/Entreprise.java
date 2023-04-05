package ma.enset.projetinv.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String raison_sociale;
    private String secteur_d_activite;
    private String description;
    @Temporal(TemporalType.DATE)
    private Date date_cration;
    @OneToOne(mappedBy = "entreprise")
    private Etudiant etudiant;
}

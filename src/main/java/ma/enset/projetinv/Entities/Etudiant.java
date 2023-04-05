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
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String nom;
    private  String prenom;
    private  String email;
    private  String CNE;
    private String CIN;
    private  String username;
    private String password;
    @OneToOne(mappedBy = "etudiant")
    private Stage stage;

    @OneToMany(mappedBy = "etudiant",fetch =FetchType.LAZY )
    private Collection<Document> documents;

    @ManyToOne Filiere filiere;
}

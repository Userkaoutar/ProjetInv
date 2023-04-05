package ma.enset.projetinv.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "enseignant")
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Enseignant {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nom;
        private String prenom;
        private String email;
        private  String CNE;
        private String codeApogee;
        private  String username;
        private String password;
        private boolean responsableFiliere;
        private boolean responsableDepartement;

}

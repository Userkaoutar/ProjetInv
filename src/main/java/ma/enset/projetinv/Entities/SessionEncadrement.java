package ma.enset.projetinv.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Table(name = "session_encadrement")
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class SessionEncadrement extends Enseignant{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    @ManyToOne
    private EncadrentPedagogique encadrentPedagogique;
    @OneToMany(mappedBy = "SessionEncadrement")
    private List<Livrable> livrable;

}

package ma.enset.projetinv.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Table(name = "membre_jury_pedagogique")
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class MembreJuryPedagogique extends Enseignant{

    //@ManyToOne
    //private Soutenance soutenance;

    @ManyToMany
    @JoinTable( name = "T_Soutenance",
            joinColumns = @JoinColumn( name = "id_soutenance" ),
            inverseJoinColumns = @JoinColumn( name = "id_soutenance" ))

    private List<Soutenance> soutenances=new ArrayList<>();
}

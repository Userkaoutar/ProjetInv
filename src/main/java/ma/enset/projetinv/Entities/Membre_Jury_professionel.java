package ma.enset.projetinv.Entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="T_JURYPROF")
public class Membre_Jury_professionel extends Employe{
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    @ManyToMany
    @JoinTable( name = "T_Soutenance",
            joinColumns = @JoinColumn( name = "id_soutenance" ),
            inverseJoinColumns = @JoinColumn( name = "id_soutenance" ))

    private List<Soutenance> soutenances=new ArrayList<>();

}

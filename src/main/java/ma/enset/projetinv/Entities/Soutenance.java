package ma.enset.projetinv.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity @Table(name="T_Soutenance")
public class Soutenance {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    public void setID(Long id) {
        this.ID = id;
    }

    public Long getID() {
        return ID;
    }


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private  Date Date_soutenance;

    private  int heure;

    private String lieu;

    @ManyToMany
    @JoinTable( name = "T_JURYPROF",
            joinColumns = @JoinColumn( name = "id_membre" ),
            inverseJoinColumns = @JoinColumn( name = "id_membre" ))

           private List<Membre_Jury_professionel> membreJuryList=new ArrayList<>();

    @ManyToMany
    @JoinTable( name = "membre_jury_pedagogique",
            joinColumns = @JoinColumn( name = "id_membre_acad" ),
            inverseJoinColumns = @JoinColumn( name = "id_membre_acad" ))

    private List<MembreJuryPedagogique> membre_jury_académiques=new ArrayList<>();

}
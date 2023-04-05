package ma.enset.projetinv.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "encadrant_pedagogique")
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class EncadrentPedagogique extends MembreJuryPedagogique{

    @OneToMany(mappedBy = "EncadrentPedagogique")
    private List<SessionEncadrement> sessionEncadrement;
}

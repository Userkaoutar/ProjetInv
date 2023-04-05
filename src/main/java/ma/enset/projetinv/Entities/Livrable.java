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
public class Livrable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String path;
    @Temporal(TemporalType.DATE)
    private Date date_remise;
    @ManyToOne
    private Stage stage;
    @ManyToOne
    private SessionEncadrement sessionEncadrement;
}

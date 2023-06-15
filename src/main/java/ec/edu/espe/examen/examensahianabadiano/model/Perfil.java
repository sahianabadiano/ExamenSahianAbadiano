package ec.edu.espe.examen.examensahianabadiano.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "SEG_PERFIL")
@Data
public class Perfil {
    @Id
    @Column(name = "COD_PERFIL", nullable = false)
    private String codPerfil;

    @Column(name = "NOMBRE", length = 100)
    private String nombre;

    @Column(name = "VERSION")
    private Integer version;

}

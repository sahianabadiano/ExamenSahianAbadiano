package ec.edu.espe.examen.examensahianabadiano.model;

import java.sql.Timestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "SEG_USUARIO_PERFIL")
@Data
public class UsuarioPerfil {
    @Id
    private UsuarioPerfilId id;

    @ManyToOne
    @JoinColumn(name = "COD_PERFIL", insertable = false, updatable = false)
    private Perfil perfil;

    @ManyToOne
    @JoinColumn(name = "COD_USUARIO", insertable = false, updatable = false)
    private Usuario usuario;

    @Column(name = "FECHA_CREACION", nullable = false)
    private Timestamp fechaCreacion;

    @Column(name = "ES_ACTIVO")
    private Boolean esActivo;

    @Column(name = "VERSION")
    private Integer version;

}

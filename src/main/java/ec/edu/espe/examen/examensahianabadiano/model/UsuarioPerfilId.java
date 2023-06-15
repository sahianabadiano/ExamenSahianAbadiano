package ec.edu.espe.examen.examensahianabadiano.model;

import jakarta.persistence.Column;

import java.io.Serializable;
import jakarta.persistence.Embeddable;

@Embeddable
public class UsuarioPerfilId implements Serializable {
    @Column(name = "COD_USUARIO")
    private Integer codUsuario;

    @Column(name = "COD_PERFIL")
    private String codPerfil;
}

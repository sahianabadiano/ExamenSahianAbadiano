package ec.edu.espe.examen.examensahianabadiano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.examen.examensahianabadiano.model.UsuarioPerfil;
import ec.edu.espe.examen.examensahianabadiano.model.UsuarioPerfilId;

@Repository
public interface UsuarioPerfilRepository extends JpaRepository<UsuarioPerfil, UsuarioPerfilId> {
    boolean existsByUsuarioPerfilId_CodUsuarioAndUsuarioPerfilId_CodPerfil(Integer codUsuario, String codPerfil);
}
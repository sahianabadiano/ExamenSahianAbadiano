package ec.edu.espe.examen.examensahianabadiano.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.examen.examensahianabadiano.model.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, String> {
    List<Perfil> findByOrderByNombre();
    
}
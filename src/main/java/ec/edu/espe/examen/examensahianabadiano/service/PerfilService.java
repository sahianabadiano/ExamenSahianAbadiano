package ec.edu.espe.examen.examensahianabadiano.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.examen.examensahianabadiano.model.Perfil;
import ec.edu.espe.examen.examensahianabadiano.repository.PerfilRepository;

import java.util.List;

@Service
public class PerfilService {
    @Autowired
    private PerfilRepository perfilRepo;


    public List<Perfil> findPerfilesByOrderByNombre() throws Exception {
        List<Perfil> perfiles = this.perfilRepo.findByOrderByNombre();
        return perfiles;
    }
}

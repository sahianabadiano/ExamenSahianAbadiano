package ec.edu.espe.examen.examensahianabadiano.service;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.examen.examensahianabadiano.model.Perfil;
import ec.edu.espe.examen.examensahianabadiano.model.Usuario;
import ec.edu.espe.examen.examensahianabadiano.model.UsuarioPerfil;
import ec.edu.espe.examen.examensahianabadiano.model.UsuarioPerfilId;
import ec.edu.espe.examen.examensahianabadiano.repository.PerfilRepository;
import ec.edu.espe.examen.examensahianabadiano.repository.UsuarioPerfilRepository;
import ec.edu.espe.examen.examensahianabadiano.repository.UsuarioRepository;

@Service
public class UsuarioPerfilService {
   
    @Autowired
    private PerfilRepository perfilRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioPerfilRepository usuarioPerfilRepository;

    public UsuarioPerfilService(UsuarioPerfilRepository usuarioPerfilRepository) {
        this.usuarioPerfilRepository = usuarioPerfilRepository;
    }

    public void saveUsuarioPerfil(String codPerfil, Integer codUsuario) {
        UsuarioPerfil usuarioPerfil = new UsuarioPerfil();
        Usuario usuario = this.usuarioRepository.getById(codUsuario);
        Perfil perfil = this.perfilRepository.getById(codPerfil);

        usuarioPerfil.setUsuario(usuario);
        usuarioPerfil.setPerfil(perfil);
        usuarioPerfil.setFechaCreacion(new Timestamp(0));
        usuarioPerfil.setEsActivo(true);
        usuarioPerfil.setVersion(1);

        this.usuarioPerfilRepository.save(usuarioPerfil);
    }


}

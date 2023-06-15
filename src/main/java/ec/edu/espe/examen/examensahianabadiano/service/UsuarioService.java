package ec.edu.espe.examen.examensahianabadiano.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.espe.examen.examensahianabadiano.model.Usuario;
import ec.edu.espe.examen.examensahianabadiano.repository.UsuarioRepository;



@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;



    public Usuario saveUsuario(Usuario usuario) throws Exception {
        Usuario user = this.usuarioRepository.findByMail(usuario.getMail());

        if(user == null)
            throw new Exception("El mail no debe repetirse");

        return this.usuarioRepository.save(usuario);
    }


}

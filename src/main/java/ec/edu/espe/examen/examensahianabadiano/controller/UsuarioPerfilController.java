package ec.edu.espe.examen.examensahianabadiano.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ec.edu.espe.examen.examensahianabadiano.service.UsuarioPerfilService;

@RestController
@RequestMapping("/usuario-perfil")
public class UsuarioPerfilController {
   

    @Autowired
    UsuarioPerfilService usuarioPerfilService;
   

    @PostMapping("/{codPerfil}/{codUsuario}")
    public ResponseEntity saveUsuarioPerfil( 
        @PathVariable(name = "codPerfil") String codPerfil, 
        @PathVariable(name = "codUsuario") Integer codUsuario) {

       this.usuarioPerfilService.saveUsuarioPerfil(codPerfil, codUsuario);
        return ResponseEntity.status(HttpStatus.CREATED).body("Perfil asignado al usuario");
    }

}

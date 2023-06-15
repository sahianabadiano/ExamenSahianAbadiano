package ec.edu.espe.examen.examensahianabadiano.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ec.edu.espe.examen.examensahianabadiano.model.Usuario;
import ec.edu.espe.examen.examensahianabadiano.service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity saveUsuario(@RequestBody Usuario usuario) {

        try {
            this.usuarioService.saveUsuario(usuario);
            return ResponseEntity.status(HttpStatus.CREATED).body("Se guardo de manera correcta");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

    }

  
}

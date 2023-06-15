package ec.edu.espe.examen.examensahianabadiano.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ec.edu.espe.examen.examensahianabadiano.model.Perfil;
import ec.edu.espe.examen.examensahianabadiano.service.PerfilService;

import java.util.List;

@RestController
@RequestMapping("/perfil")
public class PerfilController {
    
    @Autowired
    private PerfilService perfilService;


    @GetMapping(value = "/getPerfilesByOrderByNombre")
    public ResponseEntity getPerfilesByOrderByNombre() {
        try {
            List<Perfil> perfiles = this.perfilService.findPerfilesByOrderByNombre();
            return ResponseEntity.ok(perfiles);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}

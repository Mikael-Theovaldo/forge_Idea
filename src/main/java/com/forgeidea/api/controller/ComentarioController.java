package com.forgeidea.api.controller;

import com.forgeidea.api.model.Comentario;
import com.forgeidea.api.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/comentarios")
public class ComentarioController {

    @Autowired
    private ComentarioRepository comentarioRepository;

    @GetMapping
    public List<Comentario> listarComentarios() {
        return comentarioRepository.findAll();
    }

    @PostMapping
    public Comentario cadastrarComentario(@RequestBody Comentario comentario) {
        return comentarioRepository.save(comentario);
    }
}

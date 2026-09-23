package com.forgeidea.api.controller;

import com.forgeidea.api.model.Usuario;
import com.forgeidea.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }

    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario dadosLogin) {
        Usuario usuario = usuarioRepository.findByEmailAndSenha(dadosLogin.getEmail(), dadosLogin.getSenha());
        if (usuario == null) {
            throw new RuntimeException("E-mail ou senha inválidos!");
        }
        return usuario; // Retorna o usuário logado com seu ID verdadeiro
    }

}

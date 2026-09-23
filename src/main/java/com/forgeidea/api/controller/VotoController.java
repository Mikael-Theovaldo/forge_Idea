package com.forgeidea.api.controller;

import com.forgeidea.api.model.Voto;
import com.forgeidea.api.repository.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/votos")
public class VotoController {

    @Autowired
    private VotoRepository votoRepository;

    @GetMapping
    public List<Voto> listarVotos(){
        return  votoRepository.findAll();
    }

    @PostMapping
    public Voto registrarVoto(@RequestBody Voto voto){
        return votoRepository.save(voto);
    }
}

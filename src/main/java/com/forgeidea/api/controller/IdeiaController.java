package com.forgeidea.api.controller;

import com.forgeidea.api.model.Ideia;
import com.forgeidea.api.repository.IdeiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/ideias")
public class IdeiaController {

    @Autowired
    private IdeiaRepository ideiaRepository;

    @GetMapping
    public List<Ideia> listarIdeias(){
        return ideiaRepository.findAll();
    }

    @PostMapping
    public Ideia cadastrarIdeia(@RequestBody Ideia ideia){
        return ideiaRepository.save(ideia);
    }
}

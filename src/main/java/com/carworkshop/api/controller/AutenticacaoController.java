package com.carworkshop.api.controller;


import com.carworkshop.api.model.Autenticacao;
import com.carworkshop.api.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AutenticacaoController {
    @Autowired
    private AuthRepository repository;

    @GetMapping("/auth")
    public List<Autenticacao> getAll() {
        return repository.findAll();
    }

    @PostMapping("/auth")
    public Autenticacao createNew(@RequestBody Autenticacao auth){
        return repository.save(auth);
    }
}

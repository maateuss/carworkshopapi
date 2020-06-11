package com.carworkshop.api.controller;

import com.carworkshop.api.model.Carro;
import com.carworkshop.api.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CarroController{
    @Autowired
    private CarroRepository repository;

    @GetMapping("/carros")
    public List<Carro> getAll() {
        return repository.findAll();
    }

    @PostMapping("/carros")
    public Carro createNew(@RequestBody Carro carro){
        return repository.save(carro);
    }


}

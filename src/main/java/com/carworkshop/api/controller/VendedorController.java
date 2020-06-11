package com.carworkshop.api.controller;

import com.carworkshop.api.customexceptions.ResourceNotFoundException;
import com.carworkshop.api.model.Vendedor;
import com.carworkshop.api.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class VendedorController {
    @Autowired
    private VendedorRepository repository;

    @GetMapping("/vendedores")
    public List<Vendedor> getAll() {
        return repository.findAll();
    }

    @PostMapping("/vendedores")
    public Vendedor createNew(@RequestBody Vendedor vendedor){
        return repository.save(vendedor);
    }

    @GetMapping("/vendedores/{id}")
    public Vendedor getById(@PathVariable(value = "id") Long id) throws ResourceNotFoundException {
        Vendedor vendedor = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Vendedor nao encontrado"));
        return vendedor;
    }



}

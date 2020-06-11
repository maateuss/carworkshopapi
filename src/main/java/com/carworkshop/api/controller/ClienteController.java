package com.carworkshop.api.controller;

import com.carworkshop.api.model.Cliente;
import com.carworkshop.api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class ClienteController {
@Autowired
    private ClienteRepository repository;

@GetMapping("/clientes")
    public List<Cliente> getAll() {
    return repository.findAll();
}

@PostMapping("/clientes")
    public Cliente createNew(@RequestBody Cliente cliente){
    return repository.save(cliente);
}

}

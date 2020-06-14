package com.carworkshop.api.controller;


import com.carworkshop.api.customexceptions.ResourceNotFoundException;
import com.carworkshop.api.model.Login;
import com.carworkshop.api.model.Vendedor;
import com.carworkshop.api.repository.AuthRepository;
import com.carworkshop.api.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AutenticacaoController {
    @Autowired
    private AuthRepository repository;

    @Autowired
    private VendedorRepository vendedorRepository;


    @GetMapping("/login")
    public Vendedor auth(@RequestBody Login login) throws ResourceNotFoundException {
        Vendedor vendedorAuth = new Vendedor();
        vendedorAuth.setLogin(login.getUser());
        Example<Vendedor> example = Example.of(vendedorAuth);
        Vendedor vendedor = vendedorRepository.findOne(example).orElseThrow(() -> new ResourceNotFoundException("login invalido"));
        return vendedor;
    }
}

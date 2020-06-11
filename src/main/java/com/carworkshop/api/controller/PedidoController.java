package com.carworkshop.api.controller;


import com.carworkshop.api.customexceptions.ResourceNotFoundException;
import com.carworkshop.api.model.Pedido;
import com.carworkshop.api.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class PedidoController {
    @Autowired
    private PedidoRepository repository;

    @GetMapping("/pedidos")
    public List<Pedido> getAll() {
        return repository.findAll();
    }

    @PostMapping("/pedidos")
    public Pedido createNew(@RequestBody Pedido pedido){
        return repository.save(pedido);
    }

    @PutMapping("/pedidos/{id}")
    public ResponseEntity<Pedido> atualizar(@PathVariable(value = "id") Long id, @RequestBody Pedido pedido) throws ResourceNotFoundException {
        Pedido pedidoAtual = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Pedido nao encontrado"));

        pedidoAtual.setDescricao(pedido.getDescricao());
        pedidoAtual.setValor(pedido.getValor());
        pedidoAtual.setPrazo(pedido.getPrazo());

        final Pedido pedidoFinal = repository.save(pedidoAtual);
        return ResponseEntity.ok(pedidoFinal);
    }

    @DeleteMapping("/pedidos/{id}")
    public Map<String, Boolean> deletar(@PathVariable(value = "id") Long id) throws ResourceNotFoundException {
        Pedido pedidoAtual = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Pedido nao encontrado"));

        repository.delete(pedidoAtual);

        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}

package com.carworkshop.api.model;

import javax.persistence.*;

@Entity
@Table(name = "carros")
public class Carro {
    private Long id;
    private Long idcliente;
    private String modelo;
    private String ano;
    private String cor;
    private String notas;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "clienteid", nullable = false)
    public Long getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Long idcliente) {
        this.idcliente = idcliente;
    }
    @Column(name = "modelo", nullable = false)

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Column(name = "ano", nullable = false)

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    @Column(name = "cor", nullable = false)

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    @Column(name = "notas", nullable = true)

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
}

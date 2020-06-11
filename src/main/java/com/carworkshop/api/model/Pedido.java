package com.carworkshop.api.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pedidos")
public class Pedido {
    private long id;
    private String descricao;
    private Double valor;
    private Date datacriacao;
    private Date prazo;
    private Long idcliente;
    private Long idvendedor;
    private Long idproduto;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name="descricao", nullable = false)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Column(name="valor", nullable = false)
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Column(name="criacao", nullable = false)
    @Temporal(TemporalType.DATE)
    public Date getDatacriacao() {
        return datacriacao;
    }
    public void setDatacriacao(Date datacriacao) {
        this.datacriacao = datacriacao;
    }

    @Column(name="prazo", nullable = false)
    @Temporal(TemporalType.DATE)
    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }
    @Column(name="clienteid", nullable = false)
    public Long getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Long idcliente) {
        this.idcliente = idcliente;
    }
    @Column(name="vendedorid", nullable = false)
    public Long getIdvendedor() {
        return idvendedor;
    }

    public void setIdvendedor(Long idvendedor) {
        this.idvendedor = idvendedor;
    }
    @Column(name="produtoid", nullable = false)
    public Long getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Long idproduto) {
        this.idproduto = idproduto;
    }
}

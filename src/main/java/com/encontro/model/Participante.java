package com.encontro.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "participantes")
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String faixaEtaria;

    private String congrega;

    private String vaiAlmocar;

    private String atividade;

    private String outraAtividade;

    private LocalDateTime dataInscricao;

    @PrePersist
    protected void onCreate() {
        this.dataInscricao = LocalDateTime.now();
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getCongrega() {
        return congrega;
    }

    public void setCongrega(String congrega) {
        this.congrega = congrega;
    }

    public String getVaiAlmocar() {
        return vaiAlmocar;
    }

    public void setVaiAlmocar(String vaiAlmocar) {
        this.vaiAlmocar = vaiAlmocar;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getOutraAtividade() {
        return outraAtividade;
    }

    public void setOutraAtividade(String outraAtividade) {
        this.outraAtividade = outraAtividade;
    }

    public LocalDateTime getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(LocalDateTime dataInscricao) {
        this.dataInscricao = dataInscricao;
    }
}
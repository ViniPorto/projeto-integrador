package com.porto.service_finder_api.core.domain;

import java.util.List;

public class Avaliacao {
    
    private Long id;
    private String descricao;
    private Float nota;
    private List<AvaliacaoAnexo> anexos;
    
    public Avaliacao(Long id, String descricao, Float nota, List<AvaliacaoAnexo> anexos) {
        this.id = id;
        this.descricao = descricao;
        this.nota = nota;
        this.anexos = anexos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public List<AvaliacaoAnexo> getAnexos() {
        return anexos;
    }

    public void setAnexos(List<AvaliacaoAnexo> anexos) {
        this.anexos = anexos;
    }
    
}

package com.porto.service_finder_api.core.domain;

import java.time.LocalDateTime;
import java.util.List;

public class PrestacaoServico {
    
    private Long id;
    private Usuario prestador;
    private Usuario consumidor;
    private LocalDateTime data;
    private List<Avaliacao> avaliacoes;

    public PrestacaoServico(Long id, Usuario prestador, Usuario consumidor, LocalDateTime data,
            List<Avaliacao> avaliacoes) {
        this.id = id;
        this.prestador = prestador;
        this.consumidor = consumidor;
        this.data = data;
        this.avaliacoes = avaliacoes;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Usuario getPrestador() {
        return prestador;
    }
    public void setPrestador(Usuario prestador) {
        this.prestador = prestador;
    }
    public Usuario getConsumidor() {
        return consumidor;
    }
    public void setConsumidor(Usuario consumidor) {
        this.consumidor = consumidor;
    }
    public LocalDateTime getData() {
        return data;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }
    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }
    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
    
}

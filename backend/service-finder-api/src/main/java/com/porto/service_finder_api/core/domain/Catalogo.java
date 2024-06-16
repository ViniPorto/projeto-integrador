package com.porto.service_finder_api.core.domain;

import java.util.List;

public class Catalogo {
    
    private Long id;
    private String descricao;
    private String titulo;
    private String cep;
    private Usuario usuario;
    private List<Categoria> categoria;
    private List<CatalogoAnexo> anexo;
    private List<DadosAcesso> dadosAcesso;
    private List<PrestacaoServico> prestacoes;

    public Catalogo(Long id, String descricao, String titulo, String cep, List<Categoria> categoria,
            List<CatalogoAnexo> anexo, List<DadosAcesso> dadosAcesso, List<PrestacaoServico> prestacoes,
            Usuario usuario) {
        this.id = id;
        this.descricao = descricao;
        this.titulo = titulo;
        this.cep = cep;
        this.categoria = categoria;
        this.anexo = anexo;
        this.dadosAcesso = dadosAcesso;
        this.prestacoes = prestacoes;
        this.usuario = usuario;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public List<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<Categoria> categoria) {
        this.categoria = categoria;
    }

    public List<CatalogoAnexo> getAnexo() {
        return anexo;
    }

    public void setAnexo(List<CatalogoAnexo> anexo) {
        this.anexo = anexo;
    }

    public List<DadosAcesso> getDadosAcesso() {
        return dadosAcesso;
    }

    public void setDadosAcesso(List<DadosAcesso> dadosAcesso) {
        this.dadosAcesso = dadosAcesso;
    }

    public List<PrestacaoServico> getPrestacoes() {
        return prestacoes;
    }

    public void setPrestacoes(List<PrestacaoServico> prestacoes) {
        this.prestacoes = prestacoes;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}

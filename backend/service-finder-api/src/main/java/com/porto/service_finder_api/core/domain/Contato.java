package com.porto.service_finder_api.core.domain;

public class Contato {
    
    private Long id;
    private String telefone;
    private String celular;

    public Contato(Long id, String telefone, String celular) {
        this.id = id;
        this.telefone = telefone;
        this.celular = celular;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

}

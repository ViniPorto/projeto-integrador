package com.porto.service_finder_api.core.domain;

public class CatalogoAnexo {
    
    private Long id;
    private String anexo;

    public CatalogoAnexo(Long id, String anexo) {
        this.id = id;
        this.anexo = anexo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }
    
}

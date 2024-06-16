package com.porto.service_finder_api.core.domain;

import java.time.Duration;
import java.time.LocalDateTime;

public class DadosAcesso {
    
    private Long id;
    private LocalDateTime data;
    private Duration tempoAcesso;
    
    public DadosAcesso(Long id, LocalDateTime data, Duration tempoAcesso) {
        this.id = id;
        this.data = data;
        this.tempoAcesso = tempoAcesso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Duration getTempoAcesso() {
        return tempoAcesso;
    }

    public void setTempoAcesso(Duration tempoAcesso) {
        this.tempoAcesso = tempoAcesso;
    }
    
}

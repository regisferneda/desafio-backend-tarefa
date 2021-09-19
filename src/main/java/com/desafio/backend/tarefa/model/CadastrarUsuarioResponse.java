package com.desafio.backend.tarefa.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CadastrarUsuarioResponse {

    @JsonProperty("id_Usuario")
    String id;

    @JsonProperty("mensagem")
    String mensangem;

    public CadastrarUsuarioResponse(String id, String mensangem) {
        this.id = id;
        this.mensangem = mensangem;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMensangem() {
        return mensangem;
    }

    public void setMensangem(String mensangem) {
        this.mensangem = mensangem;
    }
}


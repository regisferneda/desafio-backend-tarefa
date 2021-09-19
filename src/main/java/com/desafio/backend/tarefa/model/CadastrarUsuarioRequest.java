package com.desafio.backend.tarefa.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class CadastrarUsuarioRequest {

    @JsonProperty("nome_usuario")
    String nome;

    @JsonProperty("email_usuario")
    String email;

    @JsonProperty("senha_usuario")
    String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

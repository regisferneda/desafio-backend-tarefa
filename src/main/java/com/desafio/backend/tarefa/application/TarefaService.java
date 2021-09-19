package com.desafio.backend.tarefa.application;

import com.desafio.backend.tarefa.model.CadastrarUsuarioRequest;
import com.desafio.backend.tarefa.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TarefaService {

    List<Usuario> listaUsuarios = new ArrayList<>();

    public UUID cadastrarUsuario (CadastrarUsuarioRequest cadastrarUsuarioRequest){

        UUID id = UUID.randomUUID();

        Usuario usuario = new Usuario(id, cadastrarUsuarioRequest.getNome(), cadastrarUsuarioRequest.getEmail(), cadastrarUsuarioRequest.getSenha());
        listaUsuarios.add(usuario);


        return id;
    }
}

package com.desafio.backend.tarefa.application;

import com.desafio.backend.tarefa.model.CadastrarUsuarioRequest;
import com.desafio.backend.tarefa.model.CadastrarUsuarioResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.UUID;

@Controller
@RequestMapping("/")
public class TarefaController {

    private TarefaService tarefaService;

    @Autowired
    public TarefaController (TarefaService tarefaService){
        this.tarefaService = tarefaService;
    }

    @RequestMapping(value = "/cadastrar_usuario", method = RequestMethod.POST)
    public ResponseEntity<?> cadastrarUsuario(@RequestBody CadastrarUsuarioRequest cadastrarUsuarioRequest){

        UUID id = tarefaService.cadastrarUsuario(cadastrarUsuarioRequest);

        CadastrarUsuarioResponse cadastrarUsuarioResponse = new CadastrarUsuarioResponse(id.toString(), "Usuario Cadastrado");

        return ResponseEntity.status(HttpStatus.OK).body(cadastrarUsuarioResponse);
    }
}

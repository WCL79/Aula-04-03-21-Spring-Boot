package br.com.zup.cadastro.controller;

import br.com.zup.cadastro.model.Pessoa;
import br.com.zup.cadastro.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("agendas/")
public class PessoaController {

    @Autowired
    public PessoaService pessoaService;

    @PostMapping
    public Pessoa cadastarPessoa(@RequestBody Pessoa evento){
        pessoaService.adicionarPessoa(evento);
        return evento;
    }

    @GetMapping
    public List<Pessoa> listarPesso(){
        return pessoaService.obterPessoa();
    }

}


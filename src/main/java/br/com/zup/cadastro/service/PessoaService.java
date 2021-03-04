package br.com.zup.cadastro.service;


import br.com.zup.cadastro.model.Pessoa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PessoaService {
    private static List<Pessoa> pessoas = new ArrayList<>();

    public void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public List<Pessoa> obterPessoa(){
        return pessoas;
    }
}

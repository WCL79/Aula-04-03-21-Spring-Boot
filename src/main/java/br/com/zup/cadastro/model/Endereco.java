package br.com.zup.cadastro.model;

import java.util.Date;

public class Endereco extends Pessoa{
    private String rua;
    private String numero;
    private String cidade;
    private String cep;

    public Endereco() {
    }

    public Endereco(String userName, String cpf, Date dataNascimento, String senha) {
        super(userName, cpf, dataNascimento, senha);
    }

    public Endereco(String rua, String numero, String cidade, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
    }

    public Endereco(String userName, String cpf, Date dataNascimento, String senha, String rua, String numero, String cidade, String cep) {
        super(userName, cpf, dataNascimento, senha);
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
    }
}

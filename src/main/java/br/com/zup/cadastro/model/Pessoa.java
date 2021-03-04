package br.com.zup.cadastro.model;

import java.util.Date;

public class Pessoa {
    private String userName;
    private String cpf;
    private Date dataNascimento;
    private String senha;
    Endereco endereco;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Pessoa(Endereco endereco) {
        this.endereco = endereco;
    }

    public Pessoa() {
    }

    public Pessoa(String userName, String cpf, Date dataNascimento, String senha) {
        this.userName = userName;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

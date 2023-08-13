package com.example.main.models;

import java.io.Serializable;
import java.util.Date;

public class Pessoa implements Serializable {
    private Integer codigoPessoa;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String endereco;
    private String telefone;

    // ADICIONAR OneToOne de Aluno e Professor

    public Pessoa() {
    }

    public Pessoa(Integer codigoPessoa, String nome, String cpf, Date dataNascimento, String endereco,
            String telefone) {
        this.codigoPessoa = codigoPessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Integer getCodigoPessoa() {
        return codigoPessoa;
    }

    public void setCodigoPessoa(Integer codigoPessoa) {
        this.codigoPessoa = codigoPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoPessoa == null) ? 0 : codigoPessoa.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (codigoPessoa == null) {
            if (other.codigoPessoa != null)
                return false;
        } else if (!codigoPessoa.equals(other.codigoPessoa))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa [codigoPessoa=" + codigoPessoa + ", nome=" + nome + ", cpf=" + cpf + ", dataNascimento="
                + dataNascimento + ", endereco=" + endereco + ", telefone=" + telefone + "]";
    }

}

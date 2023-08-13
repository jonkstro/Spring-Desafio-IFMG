package com.example.main.models;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pessoas")
public class Pessoa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoPessoa", length = 11, nullable = false)
    private Integer codigoPessoa;
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    @Column(name = "cpf", length = 11, nullable = false)
    private String cpf;
    @Column(name = "datanascimento", nullable = false)
    private Date dataNascimento;
    @Column(name = "endereco", length = 250, nullable = false)
    private String endereco;
    @Column(name = "telefone", length = 15, nullable = false)
    private String telefone;

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

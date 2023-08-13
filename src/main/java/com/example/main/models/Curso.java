package com.example.main.models;

import java.io.Serializable;
import java.util.Date;

import com.example.main.enums.Categoria;
import com.example.main.enums.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cursos")
public class Curso implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoCurso", length = 11, nullable = false)
    private Integer codigoCurso;
    @Column(name = "nome", length = 150, nullable = false)
    private String nome;
    @Column(name = "categoria", nullable = false)
    private Categoria categoria;
    @Column(name = "datacriacao", nullable = false)
    private Date dataCriacao;
    @Column(name = "status", nullable = false)
    private Status status;

    public Curso() {
    }

    public Curso(Integer codigoCurso, String nome, Categoria categoria, Date dataCriacao, Status status) {
        this.codigoCurso = codigoCurso;
        this.nome = nome;
        this.categoria = categoria;
        this.dataCriacao = dataCriacao;
        this.status = status;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoCurso == null) ? 0 : codigoCurso.hashCode());
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
        Curso other = (Curso) obj;
        if (codigoCurso == null) {
            if (other.codigoCurso != null)
                return false;
        } else if (!codigoCurso.equals(other.codigoCurso))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Curso [codigoCurso=" + codigoCurso + ", nome=" + nome + ", categoria=" + categoria + ", dataCriacao="
                + dataCriacao + ", status=" + status + "]";
    }

    

}

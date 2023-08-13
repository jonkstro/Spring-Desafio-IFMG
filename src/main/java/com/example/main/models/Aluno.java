package com.example.main.models;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_alunos")
public class Aluno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoAluno", length = 11, nullable = false)
    private Integer codigoAluno;
    @Column(name = "numeromatricula", length = 9, nullable = false)
    private String numeroMatricula;
    @Column(name = "datamatricula", nullable = false)
    private Date dataMatricula;
    @Column(name = "alunoespecial", nullable = false)
    private Boolean isEspecial;

    @OneToOne
    @JoinColumn(name = "fk_codigoPessoa", nullable = false)
    private Pessoa pessoa;

    public Aluno() {
    }

    public Aluno(Integer codigoAluno, String numeroMatricula, Date dataMatricula, Boolean isEspecial) {
        this.codigoAluno = codigoAluno;
        this.numeroMatricula = numeroMatricula;
        this.dataMatricula = dataMatricula;
        this.isEspecial = isEspecial;
    }

    public Integer getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(Integer codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Boolean getIsEspecial() {
        return isEspecial;
    }

    public void setIsEspecial(Boolean isEspecial) {
        this.isEspecial = isEspecial;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoAluno == null) ? 0 : codigoAluno.hashCode());
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
        Aluno other = (Aluno) obj;
        if (codigoAluno == null) {
            if (other.codigoAluno != null)
                return false;
        } else if (!codigoAluno.equals(other.codigoAluno))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Aluno [codigoAluno=" + codigoAluno + ", numeroMatricula=" + numeroMatricula + ", dataMatricula="
                + dataMatricula + ", isEspecial=" + isEspecial + "]";
    }

}

package com.example.main.models;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Professor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigoProfessor;
    private String numeroFuncionario;
    private Date dataContratacao;
    private Boolean isDedicacaoExclusiva;
    
    // ADICIONAR O OneToOne DE PESSOA

    public Professor() {
    }

    public Professor(Integer codigoProfessor, String numeroFuncionario, Date dataContratacao,
            Boolean isDedicacaoExclusiva) {
        this.codigoProfessor = codigoProfessor;
        this.numeroFuncionario = numeroFuncionario;
        this.dataContratacao = dataContratacao;
        this.isDedicacaoExclusiva = isDedicacaoExclusiva;
    }

    public Integer getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(Integer codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    public String getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(String numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Boolean getIsDedicacaoExclusiva() {
        return isDedicacaoExclusiva;
    }

    public void setIsDedicacaoExclusiva(Boolean isDedicacaoExclusiva) {
        this.isDedicacaoExclusiva = isDedicacaoExclusiva;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoProfessor == null) ? 0 : codigoProfessor.hashCode());
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
        Professor other = (Professor) obj;
        if (codigoProfessor == null) {
            if (other.codigoProfessor != null)
                return false;
        } else if (!codigoProfessor.equals(other.codigoProfessor))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Professor [codigoProfessor=" + codigoProfessor + ", numeroFuncionario=" + numeroFuncionario
                + ", dataContratacao=" + dataContratacao + ", isDedicacaoExclusiva=" + isDedicacaoExclusiva + "]";
    }

    

    
}

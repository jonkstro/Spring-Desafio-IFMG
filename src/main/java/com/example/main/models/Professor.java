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
@Table(name = "tb_professores")
public class Professor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoProfessor", length = 11, nullable = false)
    private Integer codigoProfessor;
    @Column(name = "numerofuncionario", length = 9, nullable = false)
    private String numeroFuncionario;
    @Column(name = "datacontratacao", nullable = false)
    private Date dataContratacao;
    @Column(name = "dedicacaoexclusiva", nullable = false)
    private Boolean isDedicacaoExclusiva;
    
    @OneToOne
    @JoinColumn(name = "codigoPessoa", nullable = false)
    private Pessoa pessoa;

    

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

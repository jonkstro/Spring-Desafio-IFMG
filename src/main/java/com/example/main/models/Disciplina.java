package com.example.main.models;

import java.io.Serializable;

import com.example.main.enums.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_disciplinas")
public class Disciplina implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoDisciplina", length = 11, nullable = false)
    private Integer codigoDisciplina;
    @Column(name = "nome", length = 120, nullable = false)
    private String nome;
    @Column(name = "ementa", nullable = false)
    private String ementa;
    @Column(name = "cargahoraria", nullable = false)
    private Double cargaHoraria;
    @Column(name = "porcentagemteoria", nullable = false)
    private Double porcentagemTeoria;
    @Column(name = "porcentagempratica", nullable = false)
    private Double porcentagemPratica;
    @Column(name = "status", nullable = false)
    private Status status;

    public Disciplina() {
    }

    public Disciplina(Integer codigoDisciplina, String nome, String ementa, Double cargaHoraria,
            Double porcentagemTeoria, Double porcentagemPratica, Status status) {
        this.codigoDisciplina = codigoDisciplina;
        this.nome = nome;
        this.ementa = ementa;
        this.cargaHoraria = cargaHoraria;
        this.porcentagemTeoria = porcentagemTeoria;
        this.porcentagemPratica = porcentagemPratica;
        this.status = status;
    }

    public Integer getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(Integer codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Double getPorcentagemTeoria() {
        return porcentagemTeoria;
    }

    public void setPorcentagemTeoria(Double porcentagemTeoria) {
        this.porcentagemTeoria = porcentagemTeoria;
    }

    public Double getPorcentagemPratica() {
        return porcentagemPratica;
    }

    public void setPorcentagemPratica(Double porcentagemPratica) {
        this.porcentagemPratica = porcentagemPratica;
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
        result = prime * result + ((codigoDisciplina == null) ? 0 : codigoDisciplina.hashCode());
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
        Disciplina other = (Disciplina) obj;
        if (codigoDisciplina == null) {
            if (other.codigoDisciplina != null)
                return false;
        } else if (!codigoDisciplina.equals(other.codigoDisciplina))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Disciplina [codigoDisciplina=" + codigoDisciplina + ", nome=" + nome + ", ementa=" + ementa
                + ", cargaHoraria=" + cargaHoraria + ", porcentagemTeoria=" + porcentagemTeoria
                + ", porcentagemPratica=" + porcentagemPratica + ", status=" + status + "]";
    }

}

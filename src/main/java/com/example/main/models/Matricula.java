package com.example.main.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_matriculas")
public class Matricula implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoMatricula", length = 11, nullable = false)
    private Integer codigoMatricula;

    @OneToOne
    @JoinColumn(name = "fk_codigoAluno")
    private Aluno aluno;

    @OneToOne
    @JoinColumn(name = "fk_codigoTurma")
    private Turma turma;

    public Matricula() {
    }

    public Matricula(Integer codigoMatricula, Aluno aluno, Turma turma) {
        this.codigoMatricula = codigoMatricula;
        this.aluno = aluno;
        this.turma = turma;
    }

    public Integer getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(Integer codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoMatricula == null) ? 0 : codigoMatricula.hashCode());
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
        Matricula other = (Matricula) obj;
        if (codigoMatricula == null) {
            if (other.codigoMatricula != null)
                return false;
        } else if (!codigoMatricula.equals(other.codigoMatricula))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Matricula [codigoMatricula=" + codigoMatricula + ", aluno=" + aluno + ", turma=" + turma + "]";
    }

}

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
@Table(name = "tb_codigoGrade")
public class Grade implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoGrade", length = 11, nullable = false)
    private Integer codigoGrade;

    @OneToOne
    @JoinColumn(name = "fk_codigoTurma")
    private Turma turma;

    @OneToOne
    @JoinColumn(name = "fk_codigoMinistrante")
    private Ministrante ministrante;

    public Grade() {
    }

    public Grade(Integer codigoGrade, Turma turma, Ministrante ministrante) {
        this.codigoGrade = codigoGrade;
        this.turma = turma;
        this.ministrante = ministrante;
    }

    public Integer getCodigoGrade() {
        return codigoGrade;
    }

    public void setCodigoGrade(Integer codigoGrade) {
        this.codigoGrade = codigoGrade;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Ministrante getMinistrante() {
        return ministrante;
    }

    public void setMinistrante(Ministrante ministrante) {
        this.ministrante = ministrante;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoGrade == null) ? 0 : codigoGrade.hashCode());
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
        Grade other = (Grade) obj;
        if (codigoGrade == null) {
            if (other.codigoGrade != null)
                return false;
        } else if (!codigoGrade.equals(other.codigoGrade))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Grade [codigoGrade=" + codigoGrade + ", turma=" + turma + ", ministrante=" + ministrante + "]";
    }

}

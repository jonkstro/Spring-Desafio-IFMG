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
@Table(name = "tb_ministrante")
public class Ministrante implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoMinistrante", length = 11, nullable = false)
    private Integer codigoMinistrante;

    @OneToOne
    @JoinColumn(name = "fk_codigoProfessor")
    private Professor professor;

    @OneToOne
    @JoinColumn(name = "fk_codigoDisciplina")
    private Disciplina disciplina;

    public Ministrante() {
    }

    public Ministrante(Integer codigoMinistrante, Professor professor, Disciplina disciplina) {
        this.codigoMinistrante = codigoMinistrante;
        this.professor = professor;
        this.disciplina = disciplina;
    }

    public Integer getCodigoMinistrante() {
        return codigoMinistrante;
    }

    public void setCodigoMinistrante(Integer codigoMinistrante) {
        this.codigoMinistrante = codigoMinistrante;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoMinistrante == null) ? 0 : codigoMinistrante.hashCode());
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
        Ministrante other = (Ministrante) obj;
        if (codigoMinistrante == null) {
            if (other.codigoMinistrante != null)
                return false;
        } else if (!codigoMinistrante.equals(other.codigoMinistrante))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Ministrante [codigoMinistrante=" + codigoMinistrante + ", professor=" + professor + ", disciplina="
                + disciplina + "]";
    }

}

package com.example.main.models;

import java.io.Serializable;
import java.util.Date;

import com.example.main.enums.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_turmas")
public class Turma implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoTurma", length = 11, nullable = false)
    private Integer codigoTurma;
    @Column(name = "nome", length = 50, nullable = false)
    private String nome;
    @Column(name = "datainicio", nullable = false)
    private Date dataInicio;
    @Column(name = "datafim", nullable = false)
    private Date dataFim;
    @Column(name = "horario", length = 50, nullable = false)
    private String horario;
    @Column(name = "local", length = 100, nullable = false)
    private String local;
    @Column(name = "status", nullable = false)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "fk_codigoCurso")
    private Curso curso;

    public Turma() {
    }

    public Turma(Integer codigoTurma, Curso curso, String nome, Date dataInicio, Date dataFim, String horario,
            String local, Status status) {
        this.codigoTurma = codigoTurma;
        this.curso = curso;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.horario = horario;
        this.local = local;
        this.status = status;
    }

    public Integer getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(Integer codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
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
        result = prime * result + ((codigoTurma == null) ? 0 : codigoTurma.hashCode());
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
        Turma other = (Turma) obj;
        if (codigoTurma == null) {
            if (other.codigoTurma != null)
                return false;
        } else if (!codigoTurma.equals(other.codigoTurma))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Turma [codigoTurma=" + codigoTurma + ", curso=" + curso + ", nome=" + nome + ", dataInicio="
                + dataInicio + ", dataFim=" + dataFim + ", horario=" + horario + ", local=" + local + ", status="
                + status + "]";
    }

}

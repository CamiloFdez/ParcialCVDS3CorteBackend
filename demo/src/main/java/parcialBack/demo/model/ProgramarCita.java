package main.java.parcialBack.demo.model;

import main.java.parcialBack.demo.model.Especialidades;
import main.java.parcialBack.demo.model.Formulario;
import java.time.LocalDate;

public class ProgramarCita{
    private Formulario formuluario;
    private LocalDate fechaDeCita;
    private Especialidades especialidades;

    public ProgramarCita(){}

    public ProgramarCita(Formulario formuluario, LocalDate fechaDeCita, Especialidades especialidades) {
        this.especialidades = especialidades;
        this.formuluario = formuluario;
        this.fechaDeCita = fechaDeCita;
    }

    public LocalDate getFechaDeCita() {
        return fechaDeCita;
    }

    public void setFechaDeCita(LocalDate fechaDeCita) {
        this.fechaDeCita = fechaDeCita;
    }

    public Especialidades getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Especialidades especialidades) {
        this.especialidades = especialidades;
    }

    public Formulario getFormuluario() {
        return formuluario;
    }

    public void setFormuluario(Formulario formuluario) {
        this.formuluario = formuluario;
    }
}
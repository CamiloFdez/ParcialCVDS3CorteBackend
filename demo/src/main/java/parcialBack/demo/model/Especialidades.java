package main.java.parcialBack.demo.model;

import main.java.parcialBack.demo.model.enums.Especialidad;
import main.java.parcialBack.demo.model.Doctor;

public class Especialidades{
    private Especialidad especialidad;
    private String imagen;
    private Doctor doctor;
    private String descripcion;
    private String ubicación;

    public Especialidades(){}

    public Especialidades(Especialidad especialidad, String imagen,Doctor doctor,String descripcion, String ubicación){
        this.especialidad = especialidad;
        this.imagen= imagen;
        this.descripcion = descripcion;
        this.doctor = doctor;
        this.ubicación = ubicación;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getUbicación() {
        return ubicación;
    }

    public void setUbicación(String ubicación) {
        this.ubicación = ubicación;
    }
}
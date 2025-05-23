package main.java.parcialBack.demo.model;

public class Formulario{
    private String nombre;
    private int cedula;
    private String correo;

    public Formulario(){}

    public Formulario(String nombre, int cedula, String correo){
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getCedula() { return cedula; }
    public void setCedula(int cedula) { this.cedula = cedula; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
}
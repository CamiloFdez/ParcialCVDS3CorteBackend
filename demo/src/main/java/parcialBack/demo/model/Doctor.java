package main.java.parcialBack.demo.model;


public class Doctor {
    private String nombre;
    private String id;
    private String correo;

    public Doctor() {
    }

    public Doctor(String nombre, String id, String correo) {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getId() { return id; }
    public void setId(String id){this.id = id; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
}
package models;

public class Persona {
    private String Nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.Nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [Nombre=" + Nombre + ", edad=" + edad + "]";
    }
}

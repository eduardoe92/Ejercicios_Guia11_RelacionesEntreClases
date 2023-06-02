package Entidades;

import Enumeraciones.Apellidos;
import Enumeraciones.Dni;
import Enumeraciones.Nombres;

public class Alumno {

    private Nombres nombre;
    private Apellidos apellido;
    private Dni dni;
    private int cantVotos;

    public Alumno() {
    }

    public Alumno(Nombres nombre, Apellidos apellido, Dni dni, int cantVotos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cantVotos = cantVotos;
    }

    public Nombres getNombre() {
        return nombre;
    }

    public void setNombre(Nombres nombre) {
        this.nombre = nombre;
    }

    public Apellidos getApellido() {
        return apellido;
    }

    public void setApellido(Apellidos apellido) {
        this.apellido = apellido;
    }

    public Dni getDni() {
        return dni;
    }

    public void setDni(Dni dni) {
        this.dni = dni;
    }

    public int getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(int cantVotos) {
        this.cantVotos = cantVotos;
    }

    public void incrementarCantidadVotos() {
        this.cantVotos++;
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + " " + apellido + ", Dni: " + dni + ", cantidad de votos: " + cantVotos;
    }
}



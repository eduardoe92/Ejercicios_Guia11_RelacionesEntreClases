package Entidades;

import Enumerados.Raza;
import Enumerados.SexoPerro;

public class Perro {

    private String nombre;
    private Raza raza;
    private int edad;
    private SexoPerro sexo;
    private String tamaño;
    private boolean adoptado;

    public Perro() {
    }

    public Perro(String nombre, Raza raza, int edad, SexoPerro sexo, String tamaño, boolean adoptado) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.tamaño = tamaño;
        this.adoptado = adoptado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public SexoPerro getSexo() {
        return sexo;
    }

    public void setSexo(SexoPerro sexo) {
        this.sexo = sexo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

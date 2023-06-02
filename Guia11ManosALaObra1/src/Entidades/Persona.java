/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrÃ¡ como atributos la serie (carÃ¡cter) y nÃºmero. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
*/
package Entidades;

import java.util.List;

public class Persona {

    private String nombre;
    private String apellido;
    private List<Dni> dni;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Dni> getDni() {
        return dni;
    }

    public void setDni(List<Dni> dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona [" + "Nombre: " + nombre + ", Apellido: " + apellido + ", DNI: " + dni + ']';
    }
}
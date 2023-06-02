
package Entidades;

import Enumerados.SexoHumano;

public class People {
    
    private String nombre;
    private String apellido;
    private Integer documento;
    private int edad;
    private Perro perro;
    private SexoHumano sexo;

    public People() {
    }

    public People(String nombre, String apellido, Integer documento, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;
    }

    public People(Perro perro) {
        this.perro = perro;
    }  

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

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public SexoHumano getSexo() {
        return sexo;
    }

    public void setSexo(SexoHumano sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ", DNI: " + documento + ", Edad: " + edad + ", Sexo: " + sexo + ", adoptó a: " + perro;
    }  
}

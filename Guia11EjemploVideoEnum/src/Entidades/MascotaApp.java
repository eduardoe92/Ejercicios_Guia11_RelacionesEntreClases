
package Entidades;

import Enumeraciones.Raza;
import Enumeraciones.SexoAnimal;

public class MascotaApp {
    
    private String nombre;
    private String apodo;
//    Private String tipo;
//    Private String color;
//    Private Integer edad;
//    Private boolean cola;
    private Raza raza;
    private SexoAnimal sexo;

    public MascotaApp() {
    }

    public MascotaApp(String nombre, String apodo, Raza raza, SexoAnimal sexo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.raza = raza;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public SexoAnimal getSexo() {
        return sexo;
    }

    public void setSexo(SexoAnimal sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "MascotaApp{" + "nombre=" + nombre + ", apodo=" + apodo + ", raza=" + raza + ", sexo=" + sexo + '}';
    }

    
}

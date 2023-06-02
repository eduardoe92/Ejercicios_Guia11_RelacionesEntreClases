
package Entidades;

import java.util.Objects;

public class Espectador implements Comparable<Espectador> {
    
    private String nombre;
    private Integer edad;
    private Integer saldo;

    public Espectador() {
    }

    public Espectador(String nombre, Integer edad, Integer saldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.edad);
        hash = 97 * hash + Objects.hashCode(this.saldo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Espectador other = (Espectador) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        return Objects.equals(this.saldo, other.saldo);
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", saldo=" + saldo + '}';
    }

    @Override
    public int compareTo(Espectador o) {
        return this.nombre.compareToIgnoreCase(o.getNombre());
    }
}

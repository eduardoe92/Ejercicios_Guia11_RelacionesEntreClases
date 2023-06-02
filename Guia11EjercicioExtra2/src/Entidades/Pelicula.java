package Entidades;

import java.util.Objects;

public class Pelicula implements Comparable<Pelicula> {

    private String titulo;
    private String director;
    private Integer edadMin;
    private Integer duracion;
    private Integer funcion;
    private String tituloYFuncion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer edadMin, Integer duracion, Integer funcion) {
        this.titulo = titulo;
        this.director = director;
        this.edadMin = edadMin;
        this.duracion = duracion;
        this.funcion = funcion;

        switch (funcion) {
            case 1:
                this.tituloYFuncion = titulo + ", 15:00h";
                break;
            case 2:
                this.tituloYFuncion = titulo + ", 19:00h";
                break;
            case 3:
                this.tituloYFuncion = titulo + ", 22:00h";
                break;
            default:
                System.out.println("Funcion no disponible");
        }
        this.tituloYFuncion = titulo + " Noche " + funcion.toString();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(Integer edadMin) {
        this.edadMin = edadMin;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getFuncion() {
        return funcion;
    }

    public void setFuncion(Integer funcion) {
        this.funcion = funcion;
    }

    public String getTituloYFuncion() {
        return tituloYFuncion;
    }

    public void setTituloYFuncion(String tituloYFuncion) {
        this.tituloYFuncion = tituloYFuncion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.titulo);
        hash = 17 * hash + Objects.hashCode(this.director);
        hash = 17 * hash + Objects.hashCode(this.edadMin);
        hash = 17 * hash + Objects.hashCode(this.duracion);
        hash = 17 * hash + Objects.hashCode(this.funcion);
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
        final Pelicula other = (Pelicula) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        if (!Objects.equals(this.tituloYFuncion, other.tituloYFuncion)) {
            return false;
        }
        if (!Objects.equals(this.edadMin, other.edadMin)) {
            return false;
        }
        if (!Objects.equals(this.duracion, other.duracion)) {
            return false;
        }
        return Objects.equals(this.funcion, other.funcion);
    }
    
    
    @Override
    public int compareTo(Pelicula o) {
        return this.tituloYFuncion.compareToIgnoreCase(o.getTituloYFuncion());
    }

    @Override
    public String toString() {
        switch (funcion) {
            case 1:
                return titulo + "-- Director: " + director + "-- Edad minima: " + edadMin + "-- Duracion: " + duracion + " min -- Horario: 15:00 hs.";

            case 2:
                return titulo + "-- Director: " + director + "-- Edad minima: " + edadMin + "-- Duracion: " + duracion + " min -- Horario: 19:00 hs.";

            case 3:
                return titulo + "-- Director: " + director + "-- Edad minima: " + edadMin + "-- Duracion: " + duracion + " min -- Horario: 22:00 hs.";
            default:
                return null;
        }
    }
}

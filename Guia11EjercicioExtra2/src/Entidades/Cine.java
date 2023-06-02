
package Entidades;

import java.util.TreeSet;

public class Cine {
    
    private TreeSet<Espectador> espectadores;
    private TreeSet<Pelicula> peliculas;
    private Espectador[][] sala;

    public Cine() {
    }

    public Cine(TreeSet<Espectador> espectadores, TreeSet<Pelicula> peliculas, Espectador[][] sala) {
        this.espectadores = espectadores;
        this.peliculas = peliculas;
        this.sala = sala;
    }

    public TreeSet<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(TreeSet<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public TreeSet<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(TreeSet<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public Espectador[][] getSala() {
        return sala;
    }

    public void setSala(Espectador[][] sala) {
        this.sala = sala;
    }
}

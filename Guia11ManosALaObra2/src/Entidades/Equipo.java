
/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
*/

package Entidades;

import java.util.ArrayList;

public class Equipo {

    ArrayList<Jugador> equipo = new ArrayList();

    public ArrayList<Jugador> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Jugador> equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Equipo: " + "Equipo: " + equipo + '.';
    }
    
}
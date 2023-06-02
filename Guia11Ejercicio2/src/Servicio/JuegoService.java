package Servicio;

import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;

public class JuegoService {

    ArrayList<Jugador> jugadores;
    Revolver r;

    public JuegoService() {
    }

    public void LlenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        this.r = r;
    }

    public boolean Ronda() {
        for (Jugador j : jugadores) {
            System.out.println("Turno del " + j.getNombre());
            if (j.Disparo(r)) {
                System.out.println("Disparo el " + j.getNombre() + " perdio!");
                return true;
            }
            System.out.println("Se salvó!");
        }
        return false;
    }
}

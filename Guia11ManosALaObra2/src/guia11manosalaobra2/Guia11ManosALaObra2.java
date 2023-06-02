package guia11manosalaobra2;

import Entidades.Equipo;
import Entidades.Jugador;
import java.util.ArrayList;

public class Guia11ManosALaObra2 {

    public static void main(String[] args) {

        Jugador j1 = new Jugador();
        Equipo RM = new Equipo();

        ArrayList<Jugador> jug = new ArrayList();

        j1.setNombre("Karim");
        j1.setApellido("Benzema");
        j1.setNumero(9);
        j1.setPosicion("Delantero");
        jug.add(j1);

        Jugador j2 = new Jugador();
        j2.setNombre("Luka");
        j2.setApellido("Modrid");
        j2.setNumero(10);
        j2.setPosicion("Mediocampista");
        jug.add(j2);

        Jugador j3 = new Jugador();
        j3.setNombre("Tony");
        j3.setApellido("Kroos");
        j3.setNumero(8);
        j3.setPosicion("Mediocampista");
        jug.add(j3);

        Jugador j4 = new Jugador();
        j4.setNombre("Dani");
        j4.setApellido("Carvajal");
        j4.setNumero(2);
        j4.setPosicion("Defensa");
        jug.add(j4);

        Jugador j5 = new Jugador();
        j5.setNombre("Thibaut");
        j5.setApellido("Courtois");
        j5.setNumero(1);
        j5.setPosicion("Portero");
        jug.add(j5);
        
        RM.setEquipo(jug);
        
        System.out.println("Jugadores del Real Madrid \n");
        for (Jugador aux : RM.getEquipo()) {
            System.out.println(aux);
            System.out.println("");
        }

    }

}

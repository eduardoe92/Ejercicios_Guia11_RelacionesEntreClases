package Service;

import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class CineService {

    private final Integer entrada = 200;
    private final ArrayList<Cine> salas;

    public CineService() {

        salas = new ArrayList();
        TreeSet<Espectador> espectadores = new TreeSet();
        TreeSet<Pelicula> peliculas = new TreeSet();
        Espectador[][] sala = new Espectador[8][6];

        espectadores.add(new Espectador("Eduardo", 18, 1200));
        espectadores.add(new Espectador("Valentina", 20, 1200));
        espectadores.add(new Espectador("Isabella", 13, 1200));
        espectadores.add(new Espectador("Gabriel", 18, 600));
        espectadores.add(new Espectador("Camila", 19, 4000));
        espectadores.add(new Espectador("Sebastian", 21, 6000));
        espectadores.add(new Espectador("Valeria", 4, 200));
        espectadores.add(new Espectador("Diego", 4, 200));
        espectadores.add(new Espectador("Lucía", 4, 200));
        espectadores.add(new Espectador("Andres", 4, 200));
        espectadores.add(new Espectador("Carolina", 4, 200));
        espectadores.add(new Espectador("Federico", 4, 200));
        espectadores.add(new Espectador("Natalia", 36, 6000));
        espectadores.add(new Espectador("Gabriela", 36, 6000));
        espectadores.add(new Espectador("Daniel", 18, 3000));
        espectadores.add(new Espectador("Valentin", 18, 3000));
        espectadores.add(new Espectador("Sofia", 18, 3000));
        espectadores.add(new Espectador("Emilia", 18, 3000));
        espectadores.add(new Espectador("Javier", 18, 3000));
        espectadores.add(new Espectador("Maria", 18, 3000));
        espectadores.add(new Espectador("Mateo", 18, 3000));
        espectadores.add(new Espectador("Victoria", 18, 3000));
        espectadores.add(new Espectador("Pedro", 18, 3000));
        espectadores.add(new Espectador("Laura", 18, 3000));

        peliculas.add(new Pelicula("La lista de Schindler", "Steven Spielberg", 16, 195, 1));
        peliculas.add(new Pelicula("El rey leon", "Roger Allers, Rob Minkoff", 1, 88, 3));
        peliculas.add(new Pelicula("Regreso al futuro", "Robert Zemeckis", 7, 116, 2));
        peliculas.add(new Pelicula("Forrest Gump", "Robert Zemeckis", 13, 142, 3));
        peliculas.add(new Pelicula("El lobo de Wall Street", "Martin Scorsese", 18, 180, 3));
        peliculas.add(new Pelicula("El curioso caso de Benjamin Button", "David Fincher", 13, 166, 2));

        Cine sala1 = new Cine(espectadores, peliculas, sala);
        salas.add(sala1);
    }

    public void llenarSala() {

        ArrayList<Espectador> aux = new ArrayList(salas.get(0).getEspectadores());
        Espectador[][] salaAux = salas.get(0).getSala();

        for (Espectador espectador : aux) {
            int x = (int) (Math.random() * (7 - 0 + 1) + 0);
            int y = (int) (Math.random() * (5 - 0 + 1) + 0);

            while (salaAux[x][y] != null) {
                x = (int) (Math.random() * (7 - 0 + 1) + 0);
                y = (int) (Math.random() * (5 - 0 + 1) + 0);
            }

            salaAux[x][y] = espectador;
            salas.get(0).setSala(salaAux);
        }

    }

    public void mostrarSala() {
        Espectador[][] salaAux = salas.get(0).getSala();
        System.out.println("              PANTALLA");
        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 6; j++) {
                if (salaAux[i][j] == null) {
                    switch (i) {
                        case 0:
                            System.out.print("A" + (j + 1) + "V | ");
                            break;
                        case 1:
                            System.out.print("B" + (j + 1) + "V | ");
                            break;
                        case 2:
                            System.out.print("C" + (j + 1) + "V | ");
                            break;
                        case 3:
                            System.out.print("D" + (j + 1) + "V | ");
                            break;
                        case 4:
                            System.out.print("E" + (j + 1) + "V | ");
                            break;
                        case 5:
                            System.out.print("F" + (j + 1) + "V | ");
                            break;
                        case 6:
                            System.out.print("G" + (j + 1) + "V | ");
                            break;
                        case 7:
                            System.out.print("H" + (j + 1) + "V | ");
                            break;
                    }
                } else {
                    switch (i) {
                        case 0:
                            System.out.print("A" + (j + 1) + "X | ");
                            break;
                        case 1:
                            System.out.print("B" + (j + 1) + "X | ");
                            break;
                        case 2:
                            System.out.print("C" + (j + 1) + "X | ");
                            break;
                        case 3:
                            System.out.print("D" + (j + 1) + "X | ");
                            break;
                        case 4:
                            System.out.print("E" + (j + 1) + "X | ");
                            break;
                        case 5:
                            System.out.print("F" + (j + 1) + "X | ");
                            break;
                        case 6:
                            System.out.print("G" + (j + 1) + "X | ");
                            break;
                        case 7:
                            System.out.print("H" + (j + 1) + "X | ");
                            break;
                    }
                }
            }
            System.out.println("");
        }

    }

    public void comprarEntrada() {
        Espectador[][] salaAux = salas.get(0).getSala();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int flag = 0, x, y, cant;
        String asiento;

        System.out.println("Bienvenido al sistema de compra de entrada, indique su nombre exactamente como se \nregistro en la web.");
        String nombre = leer.next();

        Espectador usuario = new Espectador();

        for (Espectador aux : salas.get(0).getEspectadores()) {
            if (nombre.equalsIgnoreCase(aux.getNombre())) {
                System.out.println("Iniciando sesion...\nSESION INICIADA. \nUsuario: " + nombre);
                usuario = aux;
                flag = 1;
            }
        }

        if (flag == 0) {
            System.out.println("Su usuario no se encuentra registrado en la web, por favor, registrese antes de continuar");
        } else {
            System.out.println("Que pelicula desea ver?\n");
            Pelicula peliElegida = elegirPelicula();

            while (usuario.getEdad() < peliElegida.getEdadMin()) {
                System.out.println("La pelicula elegida tiene una restriccion de edad que usted no cumple, te invitamos a elegir otra pelicula, o venir acompañado de un adulto!");
                System.out.println("Que pelicula desea ver?\n");
                peliElegida = elegirPelicula();
            }

            System.out.println(peliElegida.getTitulo());

            System.out.println("\nCuantas entradas quiere adquirir?");
            cant = leer.nextInt();

            if (cant * entrada < usuario.getSaldo()) {

                while (cant != 0) {

                    System.out.println("Qué asiento desea seleccionar? Ingrese Fila y a continuacion, Columna");
                    mostrarSala();

                    asiento = leer.next();
                    asiento = asiento.toUpperCase();
                    x = devolverFila(asiento);
                    y = Integer.parseInt(asiento.substring(1, 2)) - 1;

                    while (salaAux[x][y] != null) {
                        System.out.println("El asiento no esta disponible, por favor, seleccione otro.");
                        asiento = leer.next();
                        asiento = asiento.toUpperCase();
                        x = devolverFila(asiento);
                        y = Integer.parseInt(asiento.substring(1, 2)) - 1;

                    }

                    salaAux[x][y] = usuario;
                    salas.get(0).setSala(salaAux);

                    System.out.println(salas.get(0).getSala()[x][y]);
                    usuario.setSaldo(usuario.getSaldo() - entrada);
                    System.out.println("Acreditando pago...\nEntrada adquirida correctamente!\nNuevo saldo: " + usuario.getSaldo() + ".");

                    cant--;

                }
            } else {
                System.out.println("No se puede comprar la cantidad de entradas seleciconadas con el saldo actual.\n Por favor, cargue su saldo e intente nuevamente");
            }
        }

    }

    public Pelicula elegirPelicula() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int i = 1, flag = 0;
        System.out.println("PELICULAS DISPONIBLES: ");

        for (Pelicula peli : salas.get(0).getPeliculas()) {
            System.out.println(i + "- " + peli.toString());
            i++;
        }

        System.out.println("Ingrese el número correspondiente a la película y funcion que desea ver");
        int choice = leer.nextInt();

        while (choice < 1 || choice > salas.get(0).getPeliculas().size()) {
            System.out.println("No se ingreso un valor valido, intente nuevamente");
            choice = leer.nextInt();
        }

        Pelicula peliculaElegida = new Pelicula();
        i = 0;
        for (Pelicula peli : salas.get(0).getPeliculas()) {
            i++;
            if (i == choice) {
                peliculaElegida = peli;
                flag = 1;
            }
        }

        return peliculaElegida;

    }

    public void cartelera() {
        int i = 1;
        System.out.println("PELICULAS DISPONIBLES: ");

        for (Pelicula peli : salas.get(0).getPeliculas()) {
            System.out.println(i + "- " + peli.toString());
            i++;
        }
    }

    public int devolverFila(String asiento) {
        int fila;
        fila = asiento.charAt(0);
        System.out.println(fila);
        switch (fila) {
            case 'A':
                return 0;
            case 'B':
                return 1;
            case 'C':
                return 2;
            case 'D':
                return 3;
            case 'E':
                return 4;
            case 'F':
                return 5;
            case 'G':
                return 6;
            case 'H':
                return 7;
            default:
                return 100;
        }

    }

    public void mostrarEspectadores() {
        System.out.println("              PANTALLA");
        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 6; j++) {
                if (salas.get(0).getSala()[i][j] == null) {

                    switch (i) {
                        case 0:
                            System.out.print("-A" + (j + 1) + ": Disponible.\n");
                            break;
                        case 1:
                            System.out.print("-B" + (j + 1) + ": Disponible.\n");
                            break;
                        case 2:
                            System.out.print("-C" + (j + 1) + ": Disponible.\n");
                            break;
                        case 3:
                            System.out.print("-D" + (j + 1) + ": Disponible.\n");
                            break;
                        case 4:
                            System.out.print("-E" + (j + 1) + ": Disponible.\n");
                            break;
                        case 5:
                            System.out.print("-F" + (j + 1) + ": Disponible.\n");
                            break;
                        case 6:
                            System.out.print("-G" + (j + 1) + ": Disponible.\n");
                            break;
                        case 7:
                            System.out.print("-H" + (j + 1) + ": Disponible.\n");
                            break;
                    }
                } else {
                    switch (i) {
                        case 0:
                            System.out.print("-A" + (j + 1) + ": " + salas.get(0).getSala()[i][j].getNombre() + "\n");
                            break;
                        case 1:
                            System.out.print("-B" + (j + 1) + ": " + salas.get(0).getSala()[i][j].getNombre() + "\n");
                            break;
                        case 2:
                            System.out.print("-C" + (j + 1) + ": " + salas.get(0).getSala()[i][j].getNombre() + "\n");
                            break;
                        case 3:
                            System.out.print("-D" + (j + 1) + ": " + salas.get(0).getSala()[i][j].getNombre() + "\n");
                            break;
                        case 4:
                            System.out.print("-E" + (j + 1) + ": " + salas.get(0).getSala()[i][j].getNombre() + "\n");
                            break;
                        case 5:
                            System.out.print("-F" + (j + 1) + ": " + salas.get(0).getSala()[i][j].getNombre() + "\n");
                            break;
                        case 6:
                            System.out.print("-G" + (j + 1) + ": " + salas.get(0).getSala()[i][j].getNombre() + "\n");
                            break;
                        case 7:
                            System.out.print("-H" + (j + 1) + ": " + salas.get(0).getSala()[i][j].getNombre() + "\n");
                            break;
                    }
                }
            }

        }
    }
}

/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
8A X | 8B X | 8C X |  8D   | 8E X | 8F X
7A X | 7B X | 7C X | 7D X |  7E   | 7F X
6A X | 6B X |  6C   | 6D X | 6E X | 6F
5A X | 5B X | 5C X | 5D X | 5E X | 5F X
4A X | 4B X | 4C X | 4D X | 4E X | 4F X
3A X | 3B X | 3C X |  3D   | 3E X | 3F X
2A X |  2B   | 2C X | 2D X | 2E X | 2F
1A X | 1B X | 1C X | 1D X | 1E X | 1F X
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.
 */
package guia11ejercicioextra2;

import Service.CineService;
import java.util.Scanner;

public class guia11ejercicioextra2 {

    public static void main(String[] args) {
        CineService cs = new CineService();

        cs.llenarSala();
        menu(cs);

    }

    public static void showMenu() {
        System.out.println("=======================");
        System.out.println("     CINES UNIDOS    ");
        System.out.println("=======================");

        System.out.println("");
        System.out.println("1-Mostrar Cartelera");
        System.out.println("2-Comprar Entrada");
        System.out.println("3-Mostrar Lista de espectadores");
        System.out.println("4-Salir");
        System.out.println("");
        System.out.println("Ingrese un valor y luego presione la tecla enter.");
    }

    public static void menu(CineService cs) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int choice;
        do {
            showMenu();
            choice = leer.nextInt();
            while (choice < 1 && choice > 4) {
                System.out.println("El valor ingresado no corresponde a ninguna opcion, intente nuevamente");
                choice = leer.nextInt();
            }
            switch (choice) {
                case 1:

                    cs.cartelera();
                    break;
                case 2:

                    cs.comprarEntrada();
                    break;
                case 3:

                    cs.mostrarEspectadores();
                    break;

            }
        } while (choice != 4);

        System.out.println("Que disfrutes la funcion!!");
    }
}

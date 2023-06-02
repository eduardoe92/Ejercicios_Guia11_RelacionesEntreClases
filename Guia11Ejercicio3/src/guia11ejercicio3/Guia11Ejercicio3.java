
/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.

Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package guia11ejercicio3;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.ArrayList;
import java.util.Scanner;

public class Guia11Ejercicio3 {

    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.barajar();
        System.out.println("Bienvenido al juego de cartas");
        Scanner leer = new Scanner(System.in);
        while (true) {
            System.out.println("============================================");
            System.out.println("Menú: ");
            System.out.println("1. Ver cartas disponibles");
            System.out.println("2. Ver cartas en el montón");
            System.out.println("3. Dar cartas");
            System.out.println("4. Barajar");
            System.out.println("5. Salir");
            System.out.println("============================================");
            System.out.print("Ingrese la opción deseada: ");
            int opcion = leer.nextInt();
            System.out.println("");
            switch (opcion) {
                case 1:
                    baraja.cartasDisponible();
                    break;
                case 2:
                    baraja.cartasMonton();
                    break;
                case 3:
                    baraja.darCartas((ArrayList<Carta>) baraja.getCartas());
                    break;
                case 4:
                    baraja.barajar();
                    System.out.println("Se ha barajado el mazo");
                    break;
                case 5:
                    System.out.println("Gracias por jugar");
                    return;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}


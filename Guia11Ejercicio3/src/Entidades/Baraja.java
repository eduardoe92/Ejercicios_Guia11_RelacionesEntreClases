package Entidades;

import Enumeraciones.Palos;
import java.util.ArrayList;
import static java.util.Collections.shuffle;
import java.util.List;
import java.util.Scanner;

public class Baraja {

    private List<Carta> cartas;
    private List<Carta> sacadas = new ArrayList<>();

    public Baraja() {
        this.cartas = new ArrayList();
        for (int i = 1; i <= 12; i++) {
            if (!(i == 8 || i == 9)) {
                this.cartas.add(new Carta(i, Palos.BASTO));
            }
        }
        for (int i = 1; i <= 12; i++) {
            if (!(i == 8 || i == 9)) {
                this.cartas.add(new Carta(i, Palos.COPA));
            }
        }
        for (int i = 1; i <= 12; i++) {
            if (!(i == 8 || i == 9)) {
                this.cartas.add(new Carta(i, Palos.ESPADA));
            }
        }
        for (int i = 1; i <= 12; i++) {
            if (!(i == 8 || i == 9)) {
                this.cartas.add(new Carta(i, Palos.ORO));
            }
        }
    }

    public Baraja(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + '}';
    }

    public void barajar() {
        shuffle(cartas);
    }

    public Carta siguienteCarta(ArrayList<Carta> baraja) {

    if (cartas.isEmpty()) {
        System.out.println("No hay más cartas en el mazo");
        return null;
    }
    sacadas.add(cartas.get(0));
    cartas.remove(0);
    return sacadas.get(sacadas.size() - 1);
}

    public void cartasDisponible() {
        System.out.println("La cantidad de cartas disponibles son: " + cartas.size());
    }

   public void darCartas(ArrayList<Carta> baraja) {
        Scanner leer = new Scanner(System.in);
        System.out.print("¿Cuántas cartas desea?: ");
        int num = leer.nextInt();
        for (int i = 0; i < num; i++) {
            siguienteCarta(baraja);
        }
    }

    public void cartasMonton() {
        if (sacadas.isEmpty()) {
            System.out.println("No han salido cartas del mazo");
        } else {
            System.out.println("Las cartas que han salido del mazo son: " + sacadas.toString());
        }
    }

    public void mostrarBaraja(ArrayList<Carta> baraja) {
        System.out.println("Las cartas que quedaron son: " + baraja);
    }
}

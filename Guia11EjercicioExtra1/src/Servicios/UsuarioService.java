package Servicios;

import Entidades.People;
import Entidades.Perro;
import Enumerados.Raza;
import Enumerados.SexoHumano;
import Enumerados.SexoPerro;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class UsuarioService {

    private People people;
    private ArrayList<People> peoples;
    private HashMap<String, Perro> perrosConst;
    private HashMap<String, Perro> perrosModific;

    public void crearPeople() {

        boolean opc = true;
        peoples = new ArrayList();

        do {
            String nombre = JOptionPane.showInputDialog("Ingresa el nombre de la people: ").toUpperCase();
            String apellido = JOptionPane.showInputDialog("Ingresa el apellido: ").toUpperCase();
            int documento = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el DNI: "));
            int edad = parseInt(JOptionPane.showInputDialog("Ingresa la edad: "));
            int sexo = parseInt(JOptionPane.showInputDialog("Ingresa el sexo: \n 1.- Hombre \n 2.- Mujer"));

            people = new People(nombre, apellido, documento, edad);

            switch (sexo) {
                case 1:
                    people.setSexo(SexoHumano.HOMBRE);
                    break;
                case 2:
                    people.setSexo(SexoHumano.MUJER);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion seleccionada inválidad");
            }
            peoples.add(people);

            int ingresarMas = JOptionPane.showConfirmDialog(null, "¿Quieres ingresar más peoples?");

            if (ingresarMas == 1) {
                JOptionPane.showMessageDialog(null, "Se ha cerrado la creacion de peoples");
                opc = false;
            }
        } while (opc);
    }

    public void crearPerro() {

        Perro p1 = new Perro("Dog", Raza.BEAGLE, 4, SexoPerro.MACHO, "Pequeño", false);
        Perro p2 = new Perro("Bingui", Raza.CANICHE, 2, SexoPerro.MACHO, "Pequeño", false);
        Perro p3 = new Perro("Rocky", Raza.PITBULL, 9, SexoPerro.MACHO, "Grande", false);
        Perro p4 = new Perro("Buffo", Raza.GOLDEN, 12, SexoPerro.MACHO, "Grande", false);
        Perro p5 = new Perro("Muñeca", Raza.LABRADOR, 7, SexoPerro.HEMBRA, "Mediana", false);
        Perro p6 = new Perro("Trucky", Raza.BOXER, 5, SexoPerro.HEMBRA, "Mediana", false);

        perrosConst = new HashMap();

        perrosConst.put(p1.getNombre(), p1);
        perrosConst.put(p2.getNombre(), p2);
        perrosConst.put(p3.getNombre(), p3);
        perrosConst.put(p4.getNombre(), p4);
        perrosConst.put(p5.getNombre(), p5);
        perrosConst.put(p6.getNombre(), p6);

        perrosModific = new HashMap(perrosConst);
    }

    public void elegirPerro() {
        for (People peopleU : peoples) {
            boolean aux = false;
            JOptionPane.showMessageDialog(null, "Sr/a. " + peopleU.getNombre() + " " + peopleU.getApellido() + " por favor elija un perrito: ");
            do {
                String elegirPerro = "Lista de Perros: \n";
                for (Map.Entry<String, Perro> entry : perrosConst.entrySet()) {
                    Perro value = entry.getValue();
                    elegirPerro += value + "\n";
                    elegirPerro += "\n";
                }

                String elegido = JOptionPane.showInputDialog(elegirPerro + "\n"
                        + "\nEscribe el nombre del perro que deseas: ");

                boolean perroEncontrado = false; // Variable para verificar si se encuentra el perro elegido

                for (Map.Entry<String, Perro> entry : perrosModific.entrySet()) {
                    String key = entry.getKey();
                    Perro valor = entry.getValue();

                    if (elegido.equalsIgnoreCase(key)) {
                        if (valor.isAdoptado()) {
                            JOptionPane.showMessageDialog(null, valor.getNombre() + " ya fue adoptado. Inténtalo nuevamente! ");
                            perroEncontrado = true;
                            break; // Salir del bucle una vez que se encuentra el perro
                        } else {
                            peopleU.setPerro(valor);
                            JOptionPane.showMessageDialog(null, "Felicidades, haz adoptado a " + valor.getNombre());
                            valor.setAdoptado(true);
                            aux = true;
                            perroEncontrado = true;
                            break;
                        }
                    }
                }
                if (!perroEncontrado) {
                    JOptionPane.showMessageDialog(null, "El nombre del perro no existe en la base de datos, inténtalo de nuevo");
                }
            } while (!aux);
        }
    }

    public void mostrarUsuarios() {
        String usuarios = "Lista de personas que adoptaron: \n";
        for (People people1 : peoples) {
            usuarios += people1 + "\n";
        }
        JOptionPane.showMessageDialog(null, usuarios);
    }
}

package guia11manosalaobra1;

import Entidades.Dni;
import Entidades.Persona;
import java.util.ArrayList;

public class Guia11ManosALaObra1 {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        Dni dni = new Dni();
        p1.setNombre("Eduardo");
        p1.setApellido("Chacon");

        ArrayList<Dni> array = new ArrayList();

        dni.setNumero(123456789);
        dni.setSerie('A');

        array.add(dni);
        p1.setDni(array);

        System.out.println(p1);

    }
}

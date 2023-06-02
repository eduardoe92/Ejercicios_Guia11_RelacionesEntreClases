package guia10ejemplovideo;

import Entidades.Usuario;
import Enumeraciones.Raza;
import Enumeraciones.SexoHumano;

public class Guia11EjemploVideo {

    public static void main(String[] args) {
        
//        System.out.println(Raza.BEAGLE.toString());
        
        Usuario u = new Usuario();
        
        u.setSexo(SexoHumano.MUJER); //Definimos el sexo del usuario
        System.out.println(u.getSexo());
        

//        String razaInput = "BEAGLE";
//
//        for (Raza aux : Raza.values()) {
//            if (aux.toString().equals(razaInput)) {
//                System.out.println("Raza input es igual al Enum " + aux);
//            }
//        }

//        for  (Raza aux : Raza.values()) {
//            System.out.println(aux.ordinal()); //imprime la posicion que ocupa dentro del Enum
//        }

////        for (Raza aux : Raza.values()) {
////            System.out.println(aux.name()); //imprime el nombre que le ponemos
////        }

    }

}

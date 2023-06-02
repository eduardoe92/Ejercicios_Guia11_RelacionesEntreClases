
/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
*/

package guia11ejercicio1;

import Entidades.Perro;
import Entidades.Persona;

public class Guia11Ejercicio1 {
  
    public static void main(String[] args) {
        
        Persona p1 = new Persona();
        Perro perro1 = new Perro();
        
        p1.setNombre("Ramon");
        p1.setApellido("Gonzales");
        p1.setEdad(25);
        p1.setDocumento(12134561);
        
        perro1.setNombre("Buffo");
        perro1.setRaza("Golden");
        perro1.setEdad(13);
        perro1.setTamanio("Grande");
        
        p1.setPerro(perro1);
        
        System.out.println(p1);
        
        Persona p2 = new Persona();
        Perro perro2 = new Perro();
        
        p2.setNombre("Marco");
        p2.setApellido("Ruben");
        p2.setEdad(20);
        p2.setDocumento(121212);
        
        perro2.setNombre("Indio");
        perro2.setRaza("Rockero");
        perro2.setEdad(10);
        perro2.setTamanio("Mediano");
        
        p2.setPerro(perro2);
        
        System.out.println(p2);
       
    }

}

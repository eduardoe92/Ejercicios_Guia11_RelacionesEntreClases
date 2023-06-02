
package Entidades;

import Enumeraciones.Raza;
import Enumeraciones.SexoAnimal;

public class Mascota {

    private String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private Integer edad;
    private boolean cola;
    private Raza raza;
    private SexoAnimal sexo;
    
    private int energia;
    
    public Mascota(){
        this.energia = 1000;
    }
    
}

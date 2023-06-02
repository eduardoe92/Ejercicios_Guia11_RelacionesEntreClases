
package Entidades;

import Enumeraciones.SexoHumano;
import java.util.Date;
import java.util.List;

public class Usuario {
    
    private String nombre;
    private String apellido;
    private Integer dni;
    private Date nacimiento;
    private String pais;
    private SexoHumano sexo;
    
    private List<Mascota> mascotas;
    
    public Usuario(){
        
    }

}

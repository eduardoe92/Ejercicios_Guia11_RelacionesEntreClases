package Enumeraciones;

public enum Apellidos{

    REYES(0), PEREZ(1), GONZALEZ(2), RODRIGUEZ(3), LOPEZ(4), MARTINEZ(5),
    SANCHEZ(6), GOMEZ(7), FERNANDEZ(8), RUIZ(9), DIAZ(10),
    TORRES(11), RAMIREZ(12), VARGAS(13), JIMENEZ(14), ALVAREZ(15),
    MORENO(16), ROMERO(17), HERNANDEZ(18), NAVARRO(19), MORALES(20),
    ORTEGA(21), CRUZ(22), CASTILLO(23), CASTRO(24), RIVAS(25), MENDOZA(26),
    AGUILAR(27), SILVA(28), GARCIA(29);

    private Integer posicion;

    private Apellidos() {
    }

    private Apellidos(Integer posicion) {
        this.posicion = posicion;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public static String getNombrePorPosicion(int posicion) {
        for (Apellidos nombre : Apellidos.values()) {
            if (nombre.getPosicion() == posicion) {
                return nombre.name();
            }
        }
        return null;
    }
    
}

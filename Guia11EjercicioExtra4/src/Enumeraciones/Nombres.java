package Enumeraciones;

public enum Nombres {
    
    ALEJANDRO(0), JUAN(1), MARIA(2), CARLOS(3), LAURA(4), PEDRO(5), ANA(6), LUIS(7),
    ISABELLA(8), MIGUEL(9), SOFIA(10), ANDRES(11), VALENTINA(12), DAVID(13), CAMILA(14),
    DIEGO(15), DANIELA(16), JAVIER(17), CATALINA(18), JOSE(19), LUCIA(20), GABRIEL(21),
    PAULA(22), FELIPE(23), JULIANA(24), OSCAR(25), VICTORIA(26), ANDREA(27), SANTIAGO(28),
    EDUARDO(29);

    private Integer posicion;

    private Nombres() {
    }

    private Nombres(Integer posicion) {
        this.posicion = posicion;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public static String getNombrePorPosicion(int posicion) {
        for (Nombres aux : Nombres.values()) {
            if (aux.getPosicion() == posicion) {
                return aux.name();
            }
        }
        return null;
    }
}

package Enumerados;

public enum Raza {

    PITBULL(123, "Pitbull"), CANICHE(456, "Caniche"), LABRADOR(789, "Labrador"), BEAGLE(147, "Beagle"), BOXER(258, "Boxer"), GOLDEN(369, "Boxer");

    private Integer codigo;
    private String valor;

    private Raza(Integer codigo, String valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getValor() {
        return valor;
    }
}

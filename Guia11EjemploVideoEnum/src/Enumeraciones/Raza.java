package Enumeraciones;

public enum Raza {
    BEAGLE(32131, "Beagle"), COCKERS(32132, "Beagle"), PITBULL(32133, "Beagle"), BORDER_COLLIE(32134, "Border Collie");

    private Integer codigo;
    private String valor;

    private Raza(Integer codigo, String valor) {

        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
    
}

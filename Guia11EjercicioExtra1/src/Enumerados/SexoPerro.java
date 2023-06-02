
package Enumerados;

public enum SexoPerro {
    
    MACHO(159, "Macho"), HEMBRA(753, "Hembra");
    
    private int num;
    private String valor;

    private SexoPerro(int num, String valor) {
        this.num = num;
        this.valor = valor;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}

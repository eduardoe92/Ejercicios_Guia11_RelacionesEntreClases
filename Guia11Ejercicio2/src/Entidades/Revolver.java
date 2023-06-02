package Entidades;

public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public void LlenarRevolver() {
        this.posicionActual = (int) (Math.random() * 6) + 1;
        this.posicionAgua = (int) (Math.random() * 6) + 1;
    }

    public boolean Mojar(){
        return this.posicionActual == this.posicionAgua;
    }

    public void SiguienteChorro(){
        this.posicionActual +=1;
        if (this.posicionActual>6) {
            this.posicionActual = 1;
        }
    }
    
    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

}

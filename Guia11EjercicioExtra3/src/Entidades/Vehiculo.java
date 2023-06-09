
package Entidades;
public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private String numeroMotor;
    private String chasis;
    private String color;
    private String tipo;

    public Vehiculo() {
    }
    
    public Vehiculo(String marca, String modelo, int año, String numeroMotor, String chasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Número de motor: " + numeroMotor);
        System.out.println("Chasis: " + chasis);
        System.out.println("Color: " + color);
        System.out.println("Tipo: " + tipo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo: " + marca + " " +modelo + ", año: " + año + ", Motor: " + numeroMotor + ", Chasis: " + chasis + ", color: " + color + ", tipo: " + tipo + "\n";
    }
    
}

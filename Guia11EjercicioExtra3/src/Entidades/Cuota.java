package Entidades;

import java.util.Date;

public class Cuota {
    private int numeroCuota;
    private double montoTotalCuota;
    private boolean estaPagada;
    private Date fechaVencimiento;
    private String formaPago;
    private Poliza poliza;

    public Cuota() {
    }
    
    public Cuota(int numeroCuota, double montoTotalCuota, boolean estaPagada, Date fechaVencimiento, String formaPago) {
        this.numeroCuota = numeroCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.estaPagada = estaPagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

    public void pagarCuota() {
        estaPagada = true;
    }

    public boolean estaVencida() {
        Date fechaActual = new Date();
        return fechaActual.after(fechaVencimiento);
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public double getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(double montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean isEstaPagada() {
        return estaPagada;
    }

    public void setEstaPagada(boolean estaPagada) {
        this.estaPagada = estaPagada;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    @Override
    public String toString() {
        return "Total cuotas: " + numeroCuota + "\nMonto Total: " + montoTotalCuota + " \nPagada: " + estaPagada + "\nFecha de Vencimiento: " + fechaVencimiento + "\nForma de Pago: " + formaPago + "\nPoliza: " + poliza + "\n";
    }
}


package Service;

import Entidades.Poliza;
import java.util.ArrayList;
import java.util.List;

public class PolizaService {
    private List<Poliza> polizas;

    public PolizaService() {
        this.polizas = new ArrayList<>();
    }

    public void agregarPoliza(Poliza poliza) {
        polizas.add(poliza);
    }

    public void actualizarPoliza(Poliza poliza) {
        for (int i = 0; i < polizas.size(); i++) {
            if (polizas.get(i).getNumeroPoliza().equals(poliza.getNumeroPoliza())) {
                polizas.set(i, poliza);
                break;
            }
        }
    }

    public Poliza buscarPoliza(String numeroPoliza) {
        for (Poliza poliza : polizas) {
            if (poliza.getNumeroPoliza().equals(numeroPoliza)) {
                return poliza;
            }
        }
        return null;
    }

    public void eliminarPoliza(String numeroPoliza) {
        Poliza polizaEliminar = null;
        for (Poliza poliza : polizas) {
            if (poliza.getNumeroPoliza().equals(numeroPoliza)) {
                polizaEliminar = poliza;
                break;
            }
        }
        if (polizaEliminar != null) {
            polizas.remove(polizaEliminar);
        }
    }
}


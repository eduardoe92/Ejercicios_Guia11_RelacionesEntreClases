
package Service;

import Entidades.Cuota;
import java.util.ArrayList;
import java.util.List;

public class CuotaService {
    private List<Cuota> cuotas;

    public CuotaService() {
        this.cuotas = new ArrayList<>();
    }

    public void agregarCuota(Cuota cuota) {
        cuotas.add(cuota);
    }

    public void actualizarCuota(Cuota cuota) {
        for (int i = 0; i < cuotas.size(); i++) {
            if (cuotas.get(i).getNumeroCuota() == cuota.getNumeroCuota()) {
                cuotas.set(i, cuota);
                break;
            }
        }
    }

    public Cuota buscarCuota(int numeroCuota) {
        for (Cuota cuota : cuotas) {
            if (cuota.getNumeroCuota() == numeroCuota) {
                return cuota;
            }
        }
        return null;
    }

    public void eliminarCuota(int numeroCuota) {
        Cuota cuotaEliminar = null;
        for (Cuota cuota : cuotas) {
            if (cuota.getNumeroCuota() == numeroCuota) {
                cuotaEliminar = cuota;
                break;
            }
        }
        if (cuotaEliminar != null) {
            cuotas.remove(cuotaEliminar);
        }
    }
}

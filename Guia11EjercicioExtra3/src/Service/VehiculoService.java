package Service;

import Entidades.Vehiculo;
import java.util.ArrayList;
import java.util.List;

public class VehiculoService {

    private List<Vehiculo> vehiculos;

    public VehiculoService() {
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void actualizarVehiculo(Vehiculo vehiculo) {
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getNumeroMotor().equals(vehiculo.getNumeroMotor())) {
                vehiculos.set(i, vehiculo);
                break;
            }
        }
    }

    public Vehiculo buscarVehiculo(String numeroMotor) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getNumeroMotor().equals(numeroMotor)) {
                return vehiculo;
            }
        }
        return null;
    }

    public void eliminarVehiculo(String numeroMotor) {
        Vehiculo vehiculoEliminar = null;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getNumeroMotor().equals(numeroMotor)) {
                vehiculoEliminar = vehiculo;
                break;
            }
        }
        if (vehiculoEliminar != null) {
            vehiculos.remove(vehiculoEliminar);
        }
    }
}

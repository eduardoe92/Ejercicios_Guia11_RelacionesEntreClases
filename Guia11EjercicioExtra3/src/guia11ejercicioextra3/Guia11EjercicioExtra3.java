
/*
Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a contar que te
ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus clientes
coberturas integrales para vehículos.
Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del sistema
que quiere realizar la empresa.

a. Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
domicilio, teléfono.
b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.). 
c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los
requerimientos arriba descriptos. Modelando clases con atributos y sus correspondientes
relaciones.
 */
package guia11ejercicioextra3;

import Entidades.Cliente;
import Entidades.Poliza;
import Entidades.Vehiculo;
import Service.ClienteService;
import Service.PolizaService;
import Service.VehiculoService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Guia11EjercicioExtra3 {

    public static void main(String[] args) {
        // Crear instancias de las clases de servicio
        ClienteService clienteService = new ClienteService();
        VehiculoService vehiculoService = new VehiculoService();
        PolizaService polizaService = new PolizaService();

        Cliente cliente1 = new Cliente("John Doe", "12345678", "john@example.com", "Calle 123", "1234567890");
        Cliente cliente2 = new Cliente("Jane Smith", "98765432", "jane@example.com", "Calle 456", "0987654321");

        clienteService.agregarCliente(cliente1);
        clienteService.agregarCliente(cliente2);

        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Camry", 2022, "123456789", "987654321", "Blanco", "Sedán");
        Vehiculo vehiculo2 = new Vehiculo("Ford", "Explorer", 2021, "987654321", "123456789", "Gris", "Camioneta");

        vehiculoService.agregarVehiculo(vehiculo1);
        vehiculoService.agregarVehiculo(vehiculo2);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date fechaInicio1 = null;
        Date fechaFin1 = null;
        Date fechaInicio2 = null;
        Date fechaFin2 = null;

        try {
            fechaInicio1 = dateFormat.parse("2023-01-01");
            fechaFin1 = dateFormat.parse("2024-01-01");
            fechaInicio2 = dateFormat.parse("2023-02-01");
            fechaFin2 = dateFormat.parse("2024-02-01");
        } catch (ParseException e) {
        }

        Poliza poliza1 = new Poliza("P001", fechaInicio1, fechaFin1, 12, "Tarjeta de crédito", 10000, true, 5000, "Total");
        Poliza poliza2 = new Poliza("P002", fechaInicio2, fechaFin2, 6, "Transferencia bancaria", 8000, false, 0, "Contra terceros");

        poliza1.asignarVehiculo(vehiculo1);
        poliza1.asignarCliente(cliente1);

        poliza2.asignarVehiculo(vehiculo2);
        poliza2.asignarCliente(cliente2);

        polizaService.agregarPoliza(poliza1);
        polizaService.agregarPoliza(poliza2);

        String numeroPolizaBuscada = "P001";
        Poliza polizaEncontrada = polizaService.buscarPoliza(numeroPolizaBuscada);
        if (polizaEncontrada != null) {
            System.out.println("Póliza encontrada: " + polizaEncontrada);
        } else {
            System.out.println("No se encontró la póliza con el número: " + numeroPolizaBuscada);
        }

    }
}

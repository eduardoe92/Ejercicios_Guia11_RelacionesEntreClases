package Service;

import Entidades.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteService {

    private List<Cliente> clientes;

    public ClienteService() {
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void actualizarCliente(Cliente cliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getDocumento().equals(cliente.getDocumento())) {
                clientes.set(i, cliente);
                break;
            }
        }
    }

    public Cliente buscarCliente(String documento) {
        for (Cliente cliente : clientes) {
            if (cliente.getDocumento().equals(documento)) {
                return cliente;
            }
        }
        return null;
    }

    public void eliminarCliente(String documento) {
        Cliente clienteEliminar = null;
        for (Cliente cliente : clientes) {
            if (cliente.getDocumento().equals(documento)) {
                clienteEliminar = cliente;
                break;
            }
        }
        if (clienteEliminar != null) {
            clientes.remove(clienteEliminar);
        }
    }
}


package Entidades;
public class Cliente {

    private String nombreApellido;
    private String documento;
    private String email;
    private String domicilio;
    private String telefono;

    public Cliente() {
    }
    
    public Cliente(String nombreApellido, String documento, String email, String domicilio, String telefono) {
        this.nombreApellido = nombreApellido;
        this.documento = documento;
        this.email = email;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre y Apellido: " + nombreApellido);
        System.out.println("Documento: " + documento);
        System.out.println("Email: " + email);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Teléfono: " + telefono);
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombreApellido=" + nombreApellido + ", documento=" + documento + ", email=" + email + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
}


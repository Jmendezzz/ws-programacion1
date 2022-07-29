package co.edu.cue;

public class Cliente {
    String tipoDocumento;
    String numeroDocumento;
    String nombreCliente;
    String generoCliente;
    String ciudadCliente;

    public Cliente(String tipoDocumento, String numeroDocumento, String nombreCliente, String generoCliente, String ciudadCliente) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombreCliente = nombreCliente;
        this.generoCliente = generoCliente;
        this.ciudadCliente = ciudadCliente;
    }
}

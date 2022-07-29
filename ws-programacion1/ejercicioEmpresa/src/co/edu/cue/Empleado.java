package co.edu.cue;

public class Empleado {
    String codigoEmpleado;
    String nombreEmpleado;
    String correoEmpleado;
    int experienciaEmpleado;

    public Empleado(String codigoEmpleado, String correoEmpleado,String nombreEmpleado, int experienciaEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.experienciaEmpleado = experienciaEmpleado;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public int getExperienciaEmpleado() {
        return experienciaEmpleado;
    }

    public void setExperienciaEmpleado(int experienciaEmpleado) {
        this.experienciaEmpleado = experienciaEmpleado;
    }
}

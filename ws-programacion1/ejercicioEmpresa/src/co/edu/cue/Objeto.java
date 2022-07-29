package co.edu.cue;

public class Objeto {


    String codigoObjeto;
    String nombreObjeto;

    public String getCodigoObjeto() {
        return codigoObjeto;
    }

    public void setCodigoObjeto(String codigoObjeto) {
        this.codigoObjeto = codigoObjeto;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public void setNombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

    public boolean isEstadoObjeto() {
        return estadoObjeto;
    }

    public void setEstadoObjeto(boolean estadoObjeto) {
        this.estadoObjeto = estadoObjeto;
    }

    public int getUnidadDisponible() {
        return unidadDisponible;
    }

    public void setUnidadDisponible(int unidadDisponible) {
        this.unidadDisponible = unidadDisponible;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    int unidadDisponible;
    int precioAlquiler;

    public Objeto(String codigoObjeto, String nombreObjeto, int unidadDisponible, int precioAlquiler, boolean estadoObjeto) {
        this.codigoObjeto = codigoObjeto;
        this.nombreObjeto = nombreObjeto;
        this.unidadDisponible = unidadDisponible;
        this.precioAlquiler = precioAlquiler;
        this.estadoObjeto = estadoObjeto;
    }

    boolean estadoObjeto;



}



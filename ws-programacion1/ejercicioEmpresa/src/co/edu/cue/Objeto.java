package co.edu.cue;

public class Objeto {


    String codigoObjeto;
    String nombreObjeto;
    int unidadDisponible;
    int precioAlquiler;
    boolean estadoObjeto=true;

    public Objeto(String codigoObjeto, String nombreObjeto, int unidadDisponible, int precioAlquiler) {
        this.codigoObjeto = codigoObjeto;
        this.nombreObjeto = nombreObjeto;
        this.unidadDisponible = unidadDisponible;
        this.precioAlquiler = precioAlquiler;
    }
    public Objeto(){

    }

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
    public void showDetailsObject(String code, Objeto arrayObjeto[]){
        for (int i = 0 ; i<arrayObjeto.length;i++){
            if(arrayObjeto[i].getCodigoObjeto().equals(code)){
                System.out.println("Nombre : "+arrayObjeto[i].getNombreObjeto() + "\n"
                        + "Unidades disponibles: "+arrayObjeto[i].getUnidadDisponible()+ "\n"+
                        "Precio alquiler: "+arrayObjeto[i].getPrecioAlquiler() + "\n" +
                        "Disponibilidad: " + arrayObjeto[i].isEstadoObjeto());
            }
        }
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "codigoObjeto='" + codigoObjeto + '\'' +
                ", nombreObjeto='" + nombreObjeto + '\'' +
                ", unidadDisponible=" + unidadDisponible +
                ", precioAlquiler=" + precioAlquiler +
                ", estadoObjeto=" + estadoObjeto +
                '}';
    }
}



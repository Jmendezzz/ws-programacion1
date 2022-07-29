package co.edu.cue;

public class Prestamo {
    String codigoPrestamo;
    int diasSolicitado;
    int diasTranscurridos;
    int valorPrestamo;
    Detalle_prestamo[] objectosPrestados;

    public Prestamo(String codigoPrestamo, int diasSolicitado, int diasTranscurridos, int valorPrestamo) {
        this.codigoPrestamo = codigoPrestamo;
        this.diasSolicitado = diasSolicitado;
        this.diasTranscurridos = diasTranscurridos;
        this.valorPrestamo = valorPrestamo;
        objectosPrestados =new Detalle_prestamo[2];
    }

    public void agregarObjetoPrestamo(Objeto objeto,int cantidad){

        if(objeto.getUnidadDisponible()>=cantidad){
            Detalle_prestamo detalle_prestamo = new Detalle_prestamo(objeto,5);
            objeto.setUnidadDisponible(objeto.getUnidadDisponible()-cantidad);
            objectosPrestados[0]=detalle_prestamo;
            //
        }else System.out.println("No hay disponible la cantidad ingresada");
    }

    public String getCodigoPrestamo() {
        return codigoPrestamo;
    }

    public int getDiasSolicitado() {
        return diasSolicitado;
    }

    public void setDiasSolicitado(int diasSolicitado) {
        this.diasSolicitado = diasSolicitado;
    }

    public void setCodigoPrestamo(String codigoPrestamo) {
        this.codigoPrestamo = codigoPrestamo;
    }

    public int getDiasTranscurridos() {
        return diasTranscurridos;
    }

    public void setDiasTranscurridos(int diasTranscurridos) {
        this.diasTranscurridos = diasTranscurridos;
    }

    public int getValorPrestamo() {
        return valorPrestamo;
    }

    public void setValorPrestamo(int valorPrestamo) {
        this.valorPrestamo = valorPrestamo;
    }

}

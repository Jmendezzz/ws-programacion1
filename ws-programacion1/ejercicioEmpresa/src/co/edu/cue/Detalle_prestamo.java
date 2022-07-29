package co.edu.cue;

public class Detalle_prestamo {
    Objeto objetoPrestado;
    int cantidadPrestada;
    int valorPrestamo;

    public Detalle_prestamo(Objeto objetoPrestado, int cantidadPrestada) {

        this.objetoPrestado = objetoPrestado;
        this.cantidadPrestada = cantidadPrestada;
        calcularValor();
    }

    private void calcularValor(){
        valorPrestamo=objetoPrestado.getPrecioAlquiler()*cantidadPrestada;
    }

    public Objeto getObjetoPrestado() {
        return objetoPrestado;
    }

    public void setObjetoPrestado(Objeto objetoPrestado) {
        this.objetoPrestado = objetoPrestado;
    }

    public int getCantidadPrestada() {
        return cantidadPrestada;
    }

    public void setCantidadPrestada(int cantidadPrestada) {
        this.cantidadPrestada = cantidadPrestada;
    }

    public int getValorPrestamo() {
        return valorPrestamo;
    }

    public void setValorPrestamo(int valorPrestamo) {
        this.valorPrestamo = valorPrestamo;
    }
}

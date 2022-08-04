package co.edu.cue;

public class Detalle_prestamo {
    Objeto objetoPrestado;
    int cantidadPrestada;
    Cliente cliente;
    Empleado empleado;
    int valorPrestamo;

    public Detalle_prestamo(Objeto objetoPrestado, int cantidadPrestada, Cliente cliente, Empleado empleado) {

        this.objetoPrestado = objetoPrestado;
        this.cantidadPrestada = cantidadPrestada;
        this.cliente = cliente;
        this.empleado= empleado;
        calcularValor();
    }

    private void calcularValor(){
        valorPrestamo=objetoPrestado.getPrecioAlquiler()*cantidadPrestada;
    }
    public void printPrestamoDetails(Detalle_prestamo detalle_prestamo){
        System.out.println("Objeto prestado: "+detalle_prestamo.getObjetoPrestado().getNombreObjeto() + "\n"+
                " Cantidad prestada " +  detalle_prestamo.getCantidadPrestada() +"\n"+
                " Valor del prestamo: "+ detalle_prestamo.getValorPrestamo()+
                " Atendió: "+ detalle_prestamo.getEmpleado().getNombreEmpleado()+
                " Prestamo a nombre de: "+detalle_prestamo.getCliente().getNombreCliente());
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Detalle_prestamo(){

    }

}

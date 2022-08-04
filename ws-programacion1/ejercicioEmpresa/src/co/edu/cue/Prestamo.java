package co.edu.cue;

import java.sql.PreparedStatement;

public class Prestamo {
    String codigoPrestamo;
    int diasSolicitado;
    Detalle_prestamo objectosPrestados[];

    public Detalle_prestamo[] getObjectosPrestados() {
        return objectosPrestados;
    }
    public Prestamo(String codigoPrestamo, int diasSolicitado) {
        this.codigoPrestamo = codigoPrestamo;
        this.diasSolicitado = diasSolicitado;
    }

    public int agregarObjetoPrestamo(Objeto objeto,int cantidad, int position, Cliente cliente, Empleado empleado){
        if(objeto.getUnidadDisponible()>=cantidad){
            objectosPrestados[position] = new Detalle_prestamo(objeto,cantidad,cliente,empleado);
            objeto.setUnidadDisponible(objeto.getUnidadDisponible()-cantidad);
            if(objeto.getUnidadDisponible()==0){
                objeto.setEstadoObjeto(false);
            }
            System.out.println("Prestamo agregado correctamente");
            return 1;
        }else System.out.println("No hay disponible la cantidad ingresada");
        return 0;
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

    public  Prestamo(){
        objectosPrestados = new Detalle_prestamo[3];
    }
    public void cantidadPrestamo(String objectName,int limit){
        int cont=0;
        System.out.println(limit);
        for (int i = 0 ; i< limit;i++){
            if(objectosPrestados[i].getObjetoPrestado().getNombreObjeto().equals(objectName)){
                cont++;
            }
        }
        if(cont>0){
            System.out.println("El objeto está incluido en "+cont+" prestamos");
        }else System.out.println("El objeto no está incluido en ningún prestamo");
    }
    public void totalUnidadesPrestadas(int limit){
        for(int i = 0; i< limit;i++){
            System.out.println("El objeto "+objectosPrestados[i].getObjetoPrestado().getNombreObjeto() + " tiene un total de unidades prestadas de: "+objectosPrestados[i].getCantidadPrestada());

        }
    }


}

package co.edu.cue;

import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Detalle_prestamo detallePrestamoFunctions = new Detalle_prestamo();
        Menu menu = new Menu();
        Prestamo prestamoFunctions= new Prestamo();
        Empleado arrayEmpleado[];
        arrayEmpleado= new Empleado[3];
        Cliente arrayCliente[]= new Cliente[2];
        Objeto funcionesObjeto= new Objeto();
        Objeto arrayObjetos[]=new Objeto[3];
        Prestamo arrayPrestamos[]= new Prestamo[3];
        arrayObjetos[0] = new Objeto("1093","Impresora",20,50000);
        arrayObjetos[1] = new Objeto("7932","Computador",15,20000);
        arrayObjetos[2] = new Objeto("8890","Video Beam",10,50000);
        int positionPrestamos = 0;
        int positionClientes = 0;
        int positionObjects = 0;
        int positionEmpleados = 0;
        boolean band = true;
        while(band){
            int option=menu.printMenu();
            switch (option){
                case 1:

                        System.out.println("Ingrese el codigo del empleado " );
                        String codeObject = sc.next();
                        System.out.println("Ingrese el nombre del empleado");
                        String name = sc.next();
                        System.out.println("Ingrese el correo del empleado");
                        String correo = sc.next();
                        System.out.println( "Ingrese años de antiguedad del empleado en la empresa");
                        int years = sc.nextInt();
                        arrayEmpleado[positionEmpleados]=new Empleado(codeObject,correo,name,years);
                        System.out.println("Empleado agregado correctamente.");
                        positionEmpleados++;
                    break;
                case 2:
                        System.out.println("Ingrese el tipo de documento");
                        String type = sc.next();
                        System.out.println("Ingrese el numero del documento");
                        String document = sc.next();
                        System.out.println("Ingrese el nombre del cliente");
                        String clientName = sc.next();
                        System.out.println("Ingrese el genero del cliente");
                        String genero = sc.next();
                        System.out.println("Ingrese la ciudad del cliente");
                        String ciudad = sc.next();
                        arrayCliente[positionClientes]=new Cliente(type,document,clientName,genero,ciudad);
                        System.out.println("Cliente registrado con existo!");
                        positionClientes++;
                    break;
                case 3:
                    int optionMenuObjeto = menu.menuObjeto();
                    switch (optionMenuObjeto){
                        case 1:
                                System.out.println("Ingrese el codigo del objeto");
                                String objectCode = sc.next();
                                System.out.println("Ingrese el nombre del objeto");
                                String nameProducto=sc.next();
                                System.out.println("Ingrese las unidades disponibles del producto");
                                int cantidad = sc.nextInt();
                                System.out.println("Ingrese el precio del alquiler del producto");
                                int price = sc.nextInt();
                                arrayObjetos[positionObjects] = new Objeto(objectCode,nameProducto,cantidad,price);
                                System.out.println("Objeto agregado correctamente");
                                break;
                        case 2:
                            System.out.println("Ingrese el codigo del producto");
                            String code = sc.next();
                            funcionesObjeto.showDetailsObject(code,arrayObjetos);
                            break;
                        case 3:
                            System.out.println("Ingrese el nombre del objeto");
                            prestamoFunctions.cantidadPrestamo(sc.next(),positionPrestamos);
                            break;
                        case 4:
                            prestamoFunctions.totalUnidadesPrestadas(positionPrestamos);
                            break;
                        case 5:
                            System.out.println("Ingrese el numero del objeto que quiere reemplazar");
                            int numeroRemplazarObjeto=sc.nextInt();
                            System.out.println("Ingrese el codigo del objeto");
                            String codeNuevo = sc.next();
                            System.out.println("Ingrese el nombre del objeto");
                            String nameNuevo=sc.next();
                            System.out.println("Ingrese las unidades disponibles del producto");
                            int nuevasUnidadesDisponibles=sc.nextInt();
                            System.out.println("Ingrese el precio del alquiler del producto");
                            int priceAlquiler = sc.nextInt();
                            arrayObjetos[numeroRemplazarObjeto-1]=new Objeto(codeNuevo,nameNuevo,nuevasUnidadesDisponibles,priceAlquiler);
                           break;
                    }
                    break;
                case 4:
                    switch (menu.menuPrestamos()){
                        case 1:
                            System.out.println("Ingrese el codigo del prestamo");
                            String code = sc.next();
                            System.out.println("Ingrese los días solicitados del prestamo");
                            int days = sc.nextInt();
                            System.out.println("Ingrese el nombre del objeto");
                            String objectName = sc.next();
                            System.out.println("Ingrese la cantidad de unidades prestadas");
                            int cantidad = sc.nextInt();
                            System.out.println("Ingrese el nombre del cliente al que se le hizo el prestamo");
                            String clienteName =sc.next();
                            int auxClient=0;
                            int clientCont = 0;
                            boolean verify = true;
                            for(int i =0; i<positionClientes;i++){
                                if(arrayCliente[i].getNombreCliente().equals(clienteName)){
                                    auxClient=i;
                                    clientCont++;
                                    break;
                                }
                            }
                            System.out.println("¿Qué empleado atendió? Ingrese su nombre");
                            String empleadoName = sc.next();
                            int auxEmpleado=0;
                            int contEmpleado = 0;
                            for(int i =0; i <positionEmpleados;i++){
                                if(arrayEmpleado[i].getNombreEmpleado().equals(empleadoName)){
                                    auxEmpleado=i;
                                    contEmpleado++;
                                    break;
                                }
                            }
                            boolean found = false;
                            for(int i=0;i<arrayObjetos.length;i++){
                                if((arrayObjetos[i].getNombreObjeto().equals(objectName)) && (clientCont>0)&&(contEmpleado>0)){
                                    if(arrayObjetos[i].isEstadoObjeto()){
                                        int add=prestamoFunctions.agregarObjetoPrestamo(arrayObjetos[i],cantidad,positionPrestamos,arrayCliente[auxClient],arrayEmpleado[auxEmpleado]);
                                        arrayPrestamos[positionPrestamos] = new Prestamo(code,days);
                                        positionPrestamos = positionPrestamos+add;
                                    }else {System.out.println("No hay unidades disponibles de este producto");}
                                    found = true;
                                    break;
                                }
                            }
                            if (!found){
                                System.out.println("El objeto ingresado no fue encontrado o hubo un problema con el nombre del cliente o empleado");
                            }
                            break;
                        case 2:
                            System.out.println("Digite el código del prestamo para consultar  los datos  del prestamo");
                            String codigoPrestamo=sc.next();
                            boolean foundCode = false;
                            for (int i=0 ; i<positionPrestamos;i++){
                                if (arrayPrestamos[i].getCodigoPrestamo().equals(codigoPrestamo)){
                                    System.out.println(arrayPrestamos[i].getCodigoPrestamo());
                                    detallePrestamoFunctions.printPrestamoDetails(prestamoFunctions.getObjectosPrestados()[i]);
                                    foundCode=true;
                                }
                            }
                            if(!foundCode){
                                System.out.println("El código ingresado no existe");
                            }

                    }
            }
        }
    }

}
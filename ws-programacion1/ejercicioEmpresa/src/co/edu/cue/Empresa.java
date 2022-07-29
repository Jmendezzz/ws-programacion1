package co.edu.cue;

import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        boolean band = true;
        Empleado arrayEmpleado[];
        arrayEmpleado= new Empleado[3];
        Cliente arrayCliente[];
        arrayCliente= new Cliente[2];

        crearObjeto("Juan");

        Objeto objeto1 = new Objeto("2003","Buñuelo",10,1000,true);
        Objeto objeto2 = new Objeto("2003","Buñuelo",10,1000,true);
        Objeto objeto3 = new Objeto("2003","Buñuelo",10,1000,true);

        Detalle_prestamo detalle_prestamo2 = new Detalle_prestamo(objeto2,3);
        Prestamo prestamo = new Prestamo("2323",3,0,0);


        while(band){
            int option=menu.printMenu();
            switch (option){
                case 1:
                    for (int i=0 ; i < arrayEmpleado.length;i++){
                        System.out.println("Ingrese el codigo del empleado");
                        String code = sc.next();
                        System.out.println("Ingrese el nombre del empleado");
                        String name = sc.next();
                        System.out.println("Ingrese el correo del empleado");
                        String correo = sc.next();
                        System.out.println( "Ingrese años de antiguedad del empleado en la empresa");
                        int years = sc.nextInt();
                        arrayEmpleado[i]=new Empleado(code,correo,name,years);


                    }
                    break;
                case 2:
                    for (int i = 0;i<arrayCliente.length;i++){
                        System.out.println("Ingrese el tipo de documento");
                        String type = sc.next();
                        System.out.println("Ingrese el numero del documento");
                        String document = sc.next();
                        System.out.println("Ingrese el nombre del cliente");
                        String name = sc.next();
                        System.out.println("Ingrese el genero del cliente");
                        String genero = sc.next();
                        System.out.println("Ingrese la ciudad del cliente");
                        String ciudad = sc.next();
                        arrayCliente[i]=new Cliente(type,document,name,genero,ciudad);

                    }
                    break;
                case 3:
                    int optionMenuObjeto = menu.menuObjeto();
                    switch (optionMenuObjeto){

                    }



            }
        }
    }

    public static void crearObjeto(String nombre){


    }
}
package co.edu.cue;

import java.util.Scanner;

public class Menu {

   Scanner sc = new Scanner(System.in);
    public int printMenu(){
        System.out.println("Seleccione una opción \n" +
                "1. Crear empleado\n" +
                "2. Crear cliente\n" +
                "3. Administrar objetos\n" +
                "4. Administrar prestamos\n"
                );
        return sc.nextInt();
    }
    public int menuObjeto(){
        System.out.println("Seleccione una opción \n" +
                "1. Crear Objeto\n" +
                "2. Consultar datos de objeto\n" +
                "3. Consultar cantidad de prestamos de un objeto\n" +
                "4. Consultar unidades prestadas de cada objeto\n"+
                "5. Reemplazar un objeto\n"
        );
        return sc.nextInt();
    }
    public  int menuPrestamos (){
        System.out.println("Seleccione una opción \n" +
                "1. Crear préstamo\n" +
                "2. Consultar datos de un préstamo\n"
        );

        return sc.nextInt();
    }

}

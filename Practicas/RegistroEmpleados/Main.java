package Practicas.RegistroEmpleados;
import java.util.Scanner;

public class Main {
    
    public static void main(String[]args){

        


        int opcion;
        Scanner menu= new Scanner(System.in);

        System.out.println("Bienvenido");
        System.out.println("1.- Verificar informacion empleado");
        System.out.println("2.- Registrar empleado");
        System.out.println("Seleccione la opcion deseada: ");

        opcion = menu.nextInt();

        switch(opcion){
        case 1:
        System.out.println("Ingrese nombre empleado");


        break;

        case 2:
        System.out.println("Ingrese el area de trabajo empleado");
        

        break;


            
        }


    }

}

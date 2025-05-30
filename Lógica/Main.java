package Lógica;
import java.util.Scanner;


public class Main {
 
    public static void main(String[]args){

        Scanner Datos = new Scanner(System.in);

        Alumno alumno1 = new Alumno(0, "Raul", "Perez");
        
        //Alumno vacio
        Alumno alumno2 = new Alumno();

        //Mostrar dato
        System.out.print("El ID del alumno es: "+ alumno1.getId());
        //Mostrar Datos usando getters
        System.out.println("El nombre del alumno es: "+ alumno1.getNombre() + " "+ alumno1.getApellido());
        
        
        alumno2.setId(Datos.nextInt());
        alumno2.setNombre(Datos.nextLine());
        alumno2.setApellido(Datos.nextLine());


    }


}

package practicas.registroempleados;
import java.util.Scanner;
import java.util.ArrayList;

// Añadir estos imports
//import practicas.registroempleados.Empleado;
//import practicas.registroempleados.Administrativo;
//import practicas.registroempleados.Desarrollador;


public class Principal {
    
    public static void main(String[]args){

        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new Empleado(25, "Luis", 500.00));
        empleados.add(new Empleado(21, "Laura", 100.00));
        empleados.add(new Administrativo(25, "Raul", 10.000, "Derecho"));
        empleados.add(new Administrativo(26, "Lucia", 6.000, "Inteligencia"));
        empleados.add(new Desarrollador(28, "Mario", 4.000, "C"));
        empleados.add(new Desarrollador(19, "Coba", 10.000, "Java"));


        int opcion;
        String nombreBuscado;

        Scanner menu= new Scanner(System.in);

        System.out.println("Bienvenido");
        System.out.println("Ingrese el nombre de su empleado");
        
        nombreBuscado = menu.nextLine();
        
        //Variable Bandera
        boolean encontrado = false;

        for(Empleado emp : empleados) {

            if(emp.getNombre().equalsIgnoreCase(nombreBuscado)) {
                    System.out.println("Empleado encontrado: " + emp.getNombre()+ " "+ emp.getEdad()+ " "+ emp.getSalario_base());
                
                if(emp instanceof Desarrollador){
                Desarrollador dev = (Desarrollador)emp;
                System.out.println("Tipo: Desarrollador - Lenguaje: "+ dev.getNombre()+ " "+ dev.getEdad()+ " "+ dev.getSalario_base()+ " " + dev.getLenguaje());
                }    
                else if(emp instanceof Administrativo){
                Administrativo admin = (Administrativo)emp;
                System.out.println("Tipo: Administrativo - Especialidad: "+ admin.getNombre()+ " "+ admin.getEdad()+ " " + emp.getSalario_base()+ " " + admin.getDepartamento());

                }   
                    encontrado = true;
                    break;
            }

        }
        
        if(!encontrado) {
            System.out.println("Empleado no encontrado");
        }

            
        }


    }



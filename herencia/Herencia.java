package herencia;
import java.util.Scanner;

public class Herencia {
    
    public static void main(String[]args){

        Scanner datos = new Scanner(System.in);

        Empleado emple2 = new Empleado();
        Empleado emple = new Empleado("MOVA020612HPLNLNA5", "Antonio", "Montiel", "Castillo", "222222", 01, "Supervisor", 10.000);
        Consultor consu2 = new Consultor();
        Consultor consu = new Consultor("Empleado", 2222, "BASA", "Jose", "Villegas", "Castillo", "321321312");

        //Ingresar datos de empleado con el constructor

        System.out.println("Nombre: "+ emple.getNombre()+ " "+ emple.getApellido());
       
        
        consu.getNombre();
        consu.getApellido();

    }

}

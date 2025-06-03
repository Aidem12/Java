package practicas.empleados_tienda;
import java.util.ArrayList;
import java.util.Scanner;

public record Main() {
    
    public static void main(String[]args){

        Scanner datos = new Scanner(System.in);

        ArrayList<Encargado> encargado= new ArrayList<>();
        ArrayList<Vendedor> vendedor= new ArrayList<>();

        encargado.add(new Encargado(50, "Meliza", 500));
        encargado.add(new Encargado(100, "Raul", 500));
        encargado.add(new Encargado(50, "Caro", 500));
        vendedor.add(new Vendedor(40, "Laura", 1000));
    

        for(int i=0;i<encargado.size();i++){

            System.out.println("El engarfado: "+ encargado.get(i).getNombre()+ " Sueldo: "+ encargado.get(i).getSueldo_base()+" Bono: "+ encargado.get(i).getBono()+ " Calculo salario: "+encargado.get(i).calcularSalario());
            
        }
        

    }
}

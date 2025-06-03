import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    
    String tipo_vehiculo;
    int dias=0;

    public static void main(String[]args){

        Scanner datos = new Scanner(System.in);

        ArrayList<Camioneta> camionetas = new ArrayList<>();
        ArrayList<Moto> motos = new ArrayList<>();
        ArrayList<Coche> coches = new ArrayList<>();

        camionetas.add(new Camioneta(null, null, 0, null, 0, 0, 0));
        motos.add(new Moto(0, null, null, 0, null, 0, 0));
        

        System.out.println("Ingrese seleccione el tipo de vehiculo a rentar");
        System.out.println("1.- Coche");
        System.out.println("2.- Camioneta");
        System.out.println("3.- Moto");

        int opcion=0;
        opcion = datos.nextInt();

        System.out.println("Ingrese los dias a rentar");
        int dias = datos.nextInt();

        
        switch(opcion){
        case 1:
        Coche coche = new Coche();

        System.out.println("Ingrese los dias a rentar");
        coche.setDiasRentados(dias);
        System.out.println("El costo del alquiler es: "+ coche.costoAlquiler());
        break;

        case 2:
        Moto moto = new Moto();

        System.out.println("Ingrese los dias a rentar");
        moto.setDiasRentados(dias);
        System.out.println("El costo del alquiler es: "+ moto.costoAlquiler());
        break;

        case 3:
        Camioneta camioneta = new Camioneta();

        System.out.println("Ingrese los dias a rentar");
        camioneta.setDiasRentados(dias);
        System.out.println("El costo del alquiler es: "+ camioneta.costoAlquiler());
        break;
        }

    }


}

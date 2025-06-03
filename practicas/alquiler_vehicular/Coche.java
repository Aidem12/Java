public class Coche extends Vehiculo{

    private int tarifaTotalCoche;

    public int costoAlquiler(){
        
        
        return (int)(tarifaPorDia * diasRentados);

    }

}
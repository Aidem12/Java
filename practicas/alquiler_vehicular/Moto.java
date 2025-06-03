public class Moto extends Vehiculo{
    
    private int tarifaTotalMoto;

    public Moto(int tarifaTotalMoto, String marca, String modelo, int año, String placa, int tarifaPorDia, int diasRentados) {
        super(marca, modelo, año, placa, tarifaPorDia, diasRentados);
        this.tarifaTotalMoto = tarifaTotalMoto;
    }

    public Moto(){

    }
    
    public int costoAlquiler(){

        double descuento = 0.8;
        return (int)(tarifaPorDia * diasRentados * descuento);

    }

    public int getTarifaTotalMoto() {
        return tarifaTotalMoto;
    }

    public void setTarifaTotalMoto(int tarifaTotalMoto) {
        this.tarifaTotalMoto = tarifaTotalMoto;
    }

    

}

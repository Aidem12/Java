public class Camioneta extends Vehiculo{
    
    private int tarifaTotalCamioneta;


    
    public Camioneta() {
        super();
    }

    public Camioneta(String marca, String modelo, int año, String placa, int tarifaPorDia, int diasRentados,
            int tarifaTotalCamioneta) {
        super(marca, modelo, año, placa, tarifaPorDia, diasRentados);
        this.tarifaTotalCamioneta = tarifaTotalCamioneta;
    }



    public int costoAlquiler(){

        double descuento = 1.1;
        return (int)(tarifaPorDia * diasRentados * descuento);

    }




    public int getTarifaTotalCamioneta() {
        return tarifaTotalCamioneta;
    }




    public void setTarifaTotalCamioneta(int tarifaTotalCamioneta) {
        this.tarifaTotalCamioneta = tarifaTotalCamioneta;
    }



}

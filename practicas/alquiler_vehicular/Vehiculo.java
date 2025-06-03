
abstract class Vehiculo{

    protected String marca;
    protected String modelo;
    protected int año;
    protected String placa;
    protected int tarifaPorDia=100;
    protected int diasRentados;

    public abstract int costoAlquiler();

    public  Vehiculo(){
    }

    public  Vehiculo(String marca, String modelo, int año, String placa, int tarifaPorDia, int diasRentados) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.placa = placa;
        this.tarifaPorDia = tarifaPorDia;
        this.diasRentados = diasRentados;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getTarifaPorDia() {
        return tarifaPorDia;
    }

    public void setTarifaPorDia(int tarifaPorDia) {
        this.tarifaPorDia = tarifaPorDia;
    }

    public int getDiasRentados() {
        return diasRentados;
    }

    public  void setDiasRentados(int diasRentados) {
        this.diasRentados = diasRentados;
    }

    





}
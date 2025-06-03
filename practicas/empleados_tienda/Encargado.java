package practicas.empleados_tienda;

public class Encargado extends Empleado{

    int bono; 

    public Encargado(int bono, String nombre, double sueldo_base) {
        super(nombre, sueldo_base);
        this.bono = bono;
    }


    public Encargado(){
        super();
    }

    public double calcularSalario(){

        return sueldo_base + bono;

    }


    public int getBono() {
        return bono;
    }
    

}
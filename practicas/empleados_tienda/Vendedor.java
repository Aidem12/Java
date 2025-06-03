package practicas.empleados_tienda;

public class Vendedor extends Empleado{
    
    double comision;

    public Vendedor(double comision, String nombre, double sueldo_base) {
        super(nombre, sueldo_base);
        this.comision = comision;
    }

    public Vendedor(){
    super();
    }

    public double calcularSalario(){

        return sueldo_base + (sueldo_base * comision);

    }

    public double getComision() {
        return comision;
    }


    
}

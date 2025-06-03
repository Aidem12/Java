package practicas.empleados_tienda;

abstract public class Empleado {
    
    public String nombre;
    public double sueldo_base;

    public Empleado(String nombre, double sueldo_base) {
        this.nombre = nombre;
        this.sueldo_base = sueldo_base;
    }

    public Empleado(){}



    public abstract double calcularSalario();

    



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getSueldo_base() {
        return sueldo_base;
    }


    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    


}

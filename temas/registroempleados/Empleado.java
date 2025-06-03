package practicas.registroempleados;

public class Empleado {
    
    String nombre;
    int Edad;
    Double salario_base;

    //Constructor vacio
    public Empleado() {
    }
    //ConstructorParametros
    public Empleado(int Edad, String nombre, Double salario_base) {
        this.Edad = Edad;
        this.nombre = nombre;
        this.salario_base = salario_base;
    }


    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return Edad;
    }


    public Double getSalario_base() {
        return salario_base;
    }

    


}

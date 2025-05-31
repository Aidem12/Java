package Practicas.RegistroEmpleados;

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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }


    public void setEdad(int edad) {
        Edad = edad;
    }


    public Double getSalario_base() {
        return salario_base;
    }


    public void setSalario_base(Double salario_base) {
        this.salario_base = salario_base;
    }
    
    


}

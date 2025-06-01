package practicas.registroempleados;

public class Desarrollador extends Empleado{
    
    String lenguaje;

    public Desarrollador(int Edad, String nombre, Double salario_base, String lenguaje) {
        super(Edad, nombre, salario_base);
        this.lenguaje = lenguaje;
    }

    public Desarrollador(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

   

    


}

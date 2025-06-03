package practicas.registroempleados;

public class Administrativo extends Empleado {
    
    String departamento;

    public Administrativo(int Edad, String nombre, Double salario_base, String departamento) {
        super(Edad, nombre, salario_base);
        this.departamento = departamento;
    }

    public Administrativo(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }


    


}

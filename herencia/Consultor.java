package herencia;

public class Consultor extends Persona{
    

    String nombre_consulto;
    int num_constructor;

    public Consultor() {
    }

    public Consultor(String nombre_consulto, int num_constructor, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(dni, nombre, apellido, domicilio, telefono);
        this.nombre_consulto = nombre_consulto;
        this.num_constructor = num_constructor;
    }


    

}

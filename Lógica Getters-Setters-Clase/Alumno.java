package Lógica;

public class Alumno {
    
    int id;
    String nombre;
    String apellido;

    //Constructor parametros --- Crear objeto con atributos
    public Alumno(int id, String nombre, String apellido){

        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    
    }

    //Constructor vacio sin Parametros
    public Alumno() {
    }
    
     //Getters Setters

    public int getId() {
        return id;
    }

    

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }




    //Metodo aprobado - reporbado
    public void mostrarNombre(){

    System.out.println("Hola soy un alumno");

    }

    public void saberAprobado(double calificacion){

        if(calificacion >= 6){
            System.out.println("Aprobe");


        }else{

            System.out.println("No aprobe");

        }

    }


}

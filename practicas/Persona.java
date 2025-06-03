package POO;


public class Persona{

    String nombre;
    String apellido;
    int edad;

    //Metodo saludo
    public void saludo(){
    
        //Toma el nombre del objeto que esta llamando al metodo
        System.out.println("Hola, soy "+ nombre + " " + apellido +" mi edad es " + edad);

    };


    public static void main(String args[]){

        //Creacion del objeto U1
        Persona U1 = new Persona(); 
        Persona U2 = new Persona(); 

        //Caracteristicas del objeto
        U1.nombre= "Pedro";
        U1.apellido= "Martinez";
        U1.edad= 12; 

        U2.nombre= "Marco";
        U2.apellido= "Ruiz";
        U2.edad= 13; 



        //Objeto U1 llama al metodo saludo
        U1.saludo();
        U2.saludo();
    };


}
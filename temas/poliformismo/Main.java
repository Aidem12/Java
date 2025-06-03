package practicas.poliformismo;

public class Main {
    
    public static void main(String[]args){

    Animal perrito = new Perro();
    Animal gatito = new Gato();

    ((Perro) perrito).Ladrar();
    

    }
}

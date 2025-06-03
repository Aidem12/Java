package practicas.poliformismo;

public class Gato extends Animal{
    
    String Color;

    public Gato(){

    }

    public Gato(String Color, String Especie, int nombre) {
        super(Especie, nombre);
        this.Color = Color;
    }

    

    public void Maullar(){

        System.out.println("Maulla");

    }


}

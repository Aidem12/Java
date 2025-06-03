package practicas.poliformismo;

public class Animal {
    
    int nombre;
    String Especie;

    public Animal(String Especie, int nombre) {
        this.Especie = Especie;
        this.nombre = nombre;
    }

    public Animal() {
    }

    

    
    public void Respirar(){

        System.out.println("Respira");
    }

    public void Comer(){

        System.out.println("Como");
    }

    public void Ver(){

        System.out.println("Miro");
    }

   

}

package practicas.poliformismo;

public class Perro extends Animal {

    String raza;

    public Perro() {
    }

    public Perro(String raza, String Especie, int nombre) {
        super(Especie, nombre);
        this.raza = raza;
    }

    public void Ladrar(){

        System.out.println("Ladrar");

    }

}

package POO.SistemaTienda;

import java.util.Scanner;


   
    public class SistemaTienda {
        //Variables

        float precio;
        String nombre;
        int ID;
        int Inventario;

        String NCliente;
        int Saldo;



            //Metodos



            public void MostrarInfo(){


            }

            public void Actualizarinventario(){


            }

            public void SimularCompra(){


            }
            //Metodos 

    //Clase main
    public void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        SistemaTienda IngresarDatos = new SistemaTienda();



        System.out.println("Hola, ingrese su nombre:");
        IngresarDatos.NCliente = scanner.nextLine();



        //Objetos
        SistemaTienda p1 = new SistemaTienda();
        SistemaTienda p2 = new SistemaTienda();
        SistemaTienda p3 = new SistemaTienda();

        //Atributos
        p1.ID = 01;
        p1.nombre= "Papas";
        p1.Inventario= 3;
        p1.precio= (float) 100.00;

        p2.ID = 02;
        p2.nombre= "Cereal";
        p2.Inventario= 5;
        p2.precio= (float) 50.50;

        p3.ID = 02;
        p3.nombre= "Pasta";
        p3.Inventario= 3;
        p3.precio= (float) 10.50;


    };



    };

    

    
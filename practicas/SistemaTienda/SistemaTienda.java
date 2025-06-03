package POO.SistemaTienda;

import java.util.Scanner;


   
    public class SistemaTienda {

        
        

        
        



            //Metodos

            public static void LimpiarConsola(){

                try {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } catch (Exception e) {
                    System.out.println("Error al limpiar la consola");
                }

            }

            /*Metodo constructor
            public SistemaTienda(int ID, String nombre, int Inventario, float precio) {
                 this.ID = ID;
                 this.nombre = nombre;
                 this.Inventario = Inventario;
                 this.precio = precio;
            } */

            public void SolicitarNombre(){

                Scanner scanner = new Scanner(System.in);
                

                System.out.println("Hola, ingrese su nombre:");
                this.NCliente = scanner.nextLine();
                LimpiarConsola();

            }

            public void SolicitarSaldo(){

                Scanner scanner1 = new Scanner(System.in);
                

                System.out.println("Ingrese la cantidad de saldo disponible");
                this.Saldo = scanner1.nextInt();
                LimpiarConsola();

            }


            public void MostrarInfo(){


            }

            public void Actualizarinventario(){


            }

            public void SimularCompra(){


            }
            //Metodos 


    //Clase main
    public static void main(String args[]){

        
       SistemaTienda Cliente1 = new SistemaTienda();
        SistemaTienda P1 = new SistemaTienda();
        SistemaTienda P2 = new SistemaTienda();
        SistemaTienda P3 = new SistemaTienda();
       


        //Objeto llama meotods
        Cliente1.SolicitarNombre();
        Cliente1.SolicitarSaldo();


        System.out.println("Hola " + Cliente1.NCliente);


        P1.nombre= "Papas";
        P1.precio= 2;
        P1.ID= 01;
        P1.Inventario = 10;

        

        
        
    }



    }

    

    
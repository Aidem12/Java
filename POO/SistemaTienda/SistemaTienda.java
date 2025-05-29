package POO.SistemaTienda;

import java.util.Scanner;


   
    public class SistemaTienda {

        //Objetos Productos
        private static SistemaTienda p1;
        private static SistemaTienda p2;
        private static SistemaTienda p3;

        //Creacion del objeto cliente
        private static SistemaTienda Cliente1;

        //Variables

        float precio;
        String nombre;
        int ID;
        int Inventario;

        String NCliente;
        int Saldo;



            //Metodos

            public static void LimpiarConsola(){

                try {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } catch (Exception e) {
                    System.out.println("Error al limpiar la consola");
                }

            }

            //Metodo constructor
            public SistemaTienda(int ID, String nombre, int Inventario, float precio) {
                 this.ID = ID;
                 this.nombre = nombre;
                 this.Inventario = Inventario;
                 this.precio = precio;
            }

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

        
       


        //Objeto llama meotods
        Cliente1.SolicitarNombre();
        Cliente1.SolicitarSaldo();


        System.out.println("Hola " + Cliente1.NCliente);
        

        
        //Atributos del constructor Producto
       
        p1 = new SistemaTienda(01, "Papas", 3, 5);
        p2 = new SistemaTienda(02, "Catsu", 1, 1);
        p3 = new SistemaTienda(03, "Sopa", 2, 3);
    }



    }

    

    
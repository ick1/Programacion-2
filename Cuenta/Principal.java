package Cuenta; 

import java.util.Scanner;

public class Principal { 
    static Scanner leer = new Scanner(System.in);
    
    /* Objeto e instancia */
    /* Identidad */
    static Cuenta n1 = new Cuenta();
    
    static int opt;
    static double monto;
    
    /* Metodos */
    /* Estado */
    static void mostrar_Datos(Cuenta n1){
        System.out.println("\nInformacion del usuario: ");  
        System.out.println("Numero de cuenta: "+n1.getNum());
        System.out.println("Titular: "+n1.getTitular());
        System.out.println("Saldo: "+n1.getSaldo());
    }
    
    /* Metodos definidos por el usuario */
    /* Comportamiento */
    static void menu(Cuenta n1){
        do{ 
            System.out.println("\nMenu");
            System.out.println("1. Informacion del usuario.");
            System.out.println("2. Agregar fondos.");
            System.out.println("3. Retirar fondos.");
            System.out.println("4. Cambiar nombre del titular.");
            System.out.println("5. Salir.");
            System.out.print("\nFavor de seleccionar una opcion: ");
            opt = leer.nextInt();
            
            switch(opt){ 
                case 1 ->{ 
                    mostrar_Datos(n1);
                    break; 
                }
                case 2 ->{ 
                    System.out.print("Indicar el monto a ingresar: ");
                    monto = leer.nextFloat();
                    if(monto <= 0){
                        System.out.println("No es posible ingresar esa cantidad.");
                    } else {
                        /* Mensaje */
                        n1.depositar(monto);
                    }
                    break; 
                }
                case 3 ->{ 
                    System.out.print("Ingrese el monto a retirar: ");
                    monto = leer.nextFloat();
                    if((monto > n1.getSaldo())||(n1.getSaldo() == 0)){
                        System.out.println("No es posible realizar esta accion.");
                    } else {
                        n1.retirar(monto);
                    }
                    break;
                }
                case 4 ->{ 
                    System.out.println("El titular actual es: "+n1.getTitular());
                    System.out.println("A continuacion ingrese el nombre del nuevo titular: ");
                    leer.nextLine();
                    n1.setTitular(leer.nextLine());
                    break; 
                }
                case 5 ->{
                    System.out.println("Saliendo...");
                    return; 
                }
                default ->{
                    System.out.println("Opcion invalida.");
                    break;
                }
            }
        }while(true);
    }
    
    /*Funcion Main*/
    public static void main(String[] args){
        System.out.print("Indicar el nombre del usuario: ");
        n1.setTitular(leer.nextLine());
        menu(n1); 
    }
    
    
}

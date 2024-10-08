package Polimorfismo;

import java.util.Scanner; 

public class Principal {  
    static int i=0, opc; 
    static char ocp; 
    static Scanner leer = new Scanner(System.in); 
    static Cuenta [] C = new Cuenta[10];

    public static void menu(){
        do{ 
            System.out.println("  1. Crear cuenta.");
            System.out.println("  2. Eliminar cuenta.");
            System.out.println("  3. Depositar.");
            System.out.println("  4. Retirar.");
            System.out.println("  5. Mostrar cuentas.");
            System.out.println("  6. Actualizar.");
            System.out.println("  7. Salir");
            System.out.print("Seleccionar una opcion: ");
            opc = leer.nextInt(); 
            acciones(opc); 
        } while(true); 
    }

    public static void crearCuentaAhorro(){
        int numero;  
        double interes; 

        numero = (int)(Math.random()*1000);
        interes = (Math.random()*10); 
    
        C[i] = new CuentaAhorro(numero, interes);
        i++;  
    }

    public static void crearCuentaCorriente(){
        int numero; 
        double limiteSobregiro; 

        numero = (int)(Math.random()*1000);
        limiteSobregiro = 500; 

        C[i] = new CuentaCorriente(numero, limiteSobregiro); 
        i++; 
    }

    public static void acciones1(char ocp){
        switch(ocp){
            case 'a': 
                crearCuentaAhorro();
                break; 
            case 'b': 
                crearCuentaCorriente(); 
                break; 
            case 'c':  
                return; 
            default: 
                System.out.println("Opcion no valida.");
        }
    }

    public static void eliminarCuenta(){
        int numero; 
        System.out.print("Indicar el numero de cuenta a elminar: ");
        numero = leer.nextInt(); 

        for(int n = 0; n < 10; n++){
            if(n == 9){
                C[n] = null; 
            } else {
                for(int m = n; m < 8; m++){
                C[m] = C[m+1]; 
                }
            }
        }
    }

    public static void acciones(int opc){
        switch(opc){
            case 1: 
                System.out.println("  a. Cuenta Ahorros.");
                System.out.println("  b. Cuenta Corriente.");
                System.out.println("  c. Regresar.");
                ocp = leer.nextLine().charAt(0);
                acciones1(ocp); 
                break; 
            case 2: 
                eliminarCuenta();
        }
    }

    public static void main(String[] args) {
  
    }
}

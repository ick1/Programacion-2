package Polimorfismo;

import Cuenta.Cuenta;
import java.util.Scanner; 

public class Principal {    
    int i, opc; 
    char ocp; 
    Scanner leer = new Scanner(System.in); 
    Cuenta [] C = new Cuenta[5];

    public void menu(){
        System.out.println("  1.Crear cuenta.");
        System.out.println("  2.Eliminar cuenta.");
        System.out.println("  3. Depositar.");
        System.out.println("  4. Retirar.");
        System.out.println("  5. Mostrar cuentas.");
        System.out.println("  6. Actualizar.");
        System.out.println("  7. Salir");
        System.out.print("Seleccionar una opcion: ");
        opc = leer.nextInt(); 
        acciones(opc); 
    }

    public void acciones(int opc){
        switch(opc){
            case 1: 
                System.out.println("  a. Cuenta Ahorros.");
                System.out.println("  b. Cuenta Corriente.");
                ocp = leer.nextLine().charAt(0); 
                cuenta(ocp); 
        }
    }

    public static void main(String[] args) {
  
    }
}

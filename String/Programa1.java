package String;

import java.util.Scanner; 

public class Programa1 {
    static String cadena, pal1, pal2; 
    static Scanner leer = new Scanner(System.in); 

    public static void main(String[] args) {
        System.out.println("Favor de ingresar una oracion: ");
        cadena = leer.nextLine();
        System.out.println("\nIndicar la palabra a remplazar: ");
        pal1 = leer.nextLine(); 
        System.out.println("\nIndicar la nueva palabra a colocar: ");
        pal2 = leer.nextLine(); 

        cadena = cadena.replace(pal1, pal2);
        System.out.println("\nLa nueva cadena es: " + cadena);
    } 
}

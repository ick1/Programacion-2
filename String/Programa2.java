package String;

import java.util.Scanner; 

public class Programa2 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) { 
        String cadena, invertida="";     
        int i; 
        
        System.out.println("Favor de introducir una cadena: ");
        cadena = in.nextLine(); 
        
        for(i=cadena.length()-1; i>=0; i--){
            invertida += cadena.charAt(i); 
        }

        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + invertida);
    }
}

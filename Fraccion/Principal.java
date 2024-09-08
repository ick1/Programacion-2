package Fraccion;

import java.util.Scanner;

public class Principal {
    static Fraccion f1 = new Fraccion();
    static Fraccion f2 = new Fraccion();
    static Fraccion f3 = new Fraccion();
    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
            System.out.println("Proporcione la primera fraccion.");
            System.out.print("Numerador = ");
            f1.setNumerador(leer.nextInt());
            System.out.print("Denominador = ");
            f1.setDenominador(leer.nextInt());
            
            System.out.println("\nProporcione la segunda fraccion.");
            System.out.print("Numerador = ");
            f2.setNumerador(leer.nextInt());
            System.out.print("Denominador = ");
            f2.setDenominador(leer.nextInt());
            leer.nextLine();
            
            f3 = f1.suma(f2);
            System.out.println("\nSuma: " + f3.simplificacion(f3));
            f3 = f1.resta(f2);
            System.out.println("\nResta: " + f3.simplificacion(f3));
            f3 = f1.multiplicacion(f2);
            System.out.println("\nMultiplicacion: " + f3.simplificacion(f3));
            f3 = f1.division(f2);
            System.out.println("\nDivision: " + f3.simplificacion(f3));
    }
}

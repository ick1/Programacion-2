package Recta;

import Punto.PuntoR2;
import java.util.Scanner; 

public class Principal {
    static Scanner leer = new Scanner(System.in);
    static PuntoR2 p1 = new PuntoR2();
    static PuntoR2 p2 = new PuntoR2();
    static PuntoR2 p3 = new PuntoR2();
    static Triangulo t1 = new Triangulo(new PuntoR2(), new PuntoR2(), new PuntoR2());
    static int opt = 0;

    static void validar(){
        do{
           System.out.print("Punto 1.- ");
            p1.setX(leer.nextDouble());
            p1.setY(leer.nextDouble());
            t1.setP1(p1);

            System.out.print("Punto 2.- ");
            p2.setX(leer.nextDouble());
            p2.setY(leer.nextDouble());
            t1.setP2(p2);

            System.out.print("Punto 3.- ");
            p3.setX(leer.nextDouble());
            p3.setY(leer.nextDouble());
            t1.setP3(p3);
            
            System.out.println(t1);
        }while(t1.validacion() != true);
    }
    
    static void menu(){
        do{
            System.out.println("\nMenu:");
            System.out.println("1.- Area\n2.- Perimetro\n3.- Salir");
            System.out.print("Eliga una opcion: ");
            opt = leer.nextInt();
            
            switch (opt){
                case 1:{
                    System.out.println("El area de la figura es " + t1.area());
                    break;
                }
                
                case 2:{
                    System.out.println("El perimetro de la figura es " + t1.perimetro());
                    break;
                }
                
                case 3:{
                    System.out.println("Saliendo...");
                    return;
                }
                default:{
                    System.out.println("Opcion no valida");
                    break;
                }
            }
        }while(true);
    }
    public static void main(String[] args) {
        validar();
        menu();
    }
}
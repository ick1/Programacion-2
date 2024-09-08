package Complejos;

import java.util.Scanner;

public class Principal {
    static Complejo c1 = new Complejo();
    static Complejo c2 = new Complejo();
    static Scanner leer = new Scanner(System.in);
    static int opt;

    static void menu(Complejo c1, Complejo c2){
        do{
            System.out.println("\nMenu");
            System.out.println("1) Suma.");
            System.out.println("2) Resta.");
            System.out.println("3) Multiplicacion.");
            System.out.println("4) Conjugado de un comlejo.");
            System.out.println("5) Angulo de un complejo.");
            System.out.println("6) Salir.");
            System.out.print("\nSeleccione una opcion... ");
            opt = leer.nextInt();
            
            switch (opt){
                case 1:{
                    System.out.println("LA SUMA ES: " + c1.sumaComplejos(c2));
                    break;
                }
                case 2:{
                    System.out.println("lA RESTA ES: " + c1.restaComplejos(c2));
                    break;
                }
                case 3:{
                    System.out.println("LA MULTIPLICAION ES :" + c1.multiplicacionComplejos(c2));
                    break;
                }
                case 4:{
                    System.out.println("PRIMER COMPLEJO\n");
                    System.out.println("SU CONJUGADO ES: " + c1.conjugadoComplejos());
                    System.out.println("SEGUNDO COMPLEJO\n");
                    System.out.println("SU CONJUGADO ES: " + c2.conjugadoComplejos());
                    break;
                }
                case 5:{
                    System.out.println("\nPRIMER COMPLEJO\n");
                    System.out.println("SU ANGULO ES: " + c1.anguloComplejos());
                    System.out.println("\nSEGUNDO COMPLEJO\n");
                    System.out.println("SU ANGULO ES: " + c2.anguloComplejos());
                    break;
                }
                case 6:{
                    System.out.println("Saliendo...");
                    return;
                }
                default:{
                    System.out.println("Opcion invalida");
                    break;
                }
            }
        }while (true);
    }

    public static void main(String[] args) {
        System.out.println("Proporcione un numero complejo.");
        System.out.print("Parte real: ");
        c1.setReal(leer.nextDouble());
        System.out.print("Parte imaginaria: ");
        c1.setImaginaria(leer.nextDouble());
        
        System.out.println("Proporcione un segundo numero complejo.");
        System.out.print("Parte real: ");
        c2.setReal(leer.nextDouble());
        System.out.print("Parte imaginaria: ");
        c2.setImaginaria(leer.nextDouble());
        
        menu(c1, c2);
        
    }
}
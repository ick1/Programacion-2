package Fecha;

import java.util.Scanner; 

public class Principal {
    static Scanner leer = new Scanner(System.in); 

    static Fecha f1 = new Fecha(); 

    static int dd,mm,yy;

    public static void main(String[] args) {
        f1.setDay(39);
        f1.setMonth(2);
        f1.setYear(2003);
        System.out.println(f1.diasTranscurridos());
        System.out.println(f1.diaSemana());
        /*if (f1.bisiesto()){
            System.out.println("True");
        } else {
            System.out.println("False");
        }*/
        f1.larga();
    }
}

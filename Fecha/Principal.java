package Fecha;

import java.util.Scanner; 

public class Principal {
    static Scanner leer = new Scanner(System.in); 

    static Fecha f1 = new Fecha(); 

    static int dd,mm,yy;

    public static void main(String[] args) {
        System.out.println(f1.diasMes());
    }
}

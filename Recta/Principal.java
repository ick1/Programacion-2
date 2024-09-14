package Recta;

import Punto.PuntoR2;

public class Principal {
    public static void main(String[] args) {
        //Agregacion
        PuntoR2 p1 = new PuntoR2(5,3);
        PuntoR2 p2 = new PuntoR2(2,12); 
        Recta r = new Recta(p1, p2);

        //Composicion
        Recta r2 = new Recta(-1,7,3,8);
        r2.getP1().setX(-4); 

        Recta r3 = new Recta(new PuntoR2(-1,7), new PuntoR2(3,8)); 
        r3.getP1().setX(-4);
        
        System.out.println(r);
    }
}

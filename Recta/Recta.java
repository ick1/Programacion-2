package Recta;

import Punto.PuntoR2;

public class Recta {
    private PuntoR2 p1; 
    private PuntoR2 p2; 

    public Recta(PuntoR2 p1, PuntoR2 p2){
        this.p1 = p1;   
        this.p2 = p2; 
    }

    public Recta(double x1, double y1, double x2, double y2){
        p1 = new PuntoR2(x1,y1);
        p2 = new PuntoR2(x2,y2); 
    }

    public PuntoR2 getP1(){
        return p1; 
    }

    public PuntoR2 getP2(){
        return p2; 
    }

    public void setP1(PuntoR2 p1){
        this.p1 = p1; 
    }

    public void setP2(PuntoR2 p2){
        this.p2 = p2; 
    }

    public double pendiente(){
        return (p2.getY()-p1.getY())/p2.getX()-p1.getX();
    }

    public double distancia(PuntoR2 p){
        double m = pendiente(); 
        return Math.abs(m*p.getX()-1*p.getY()-m*p1.getX()+p1.getY())/Math.sqrt(Math.pow(m,2)+1); 
    }

    @Override
    public String toString(){
        return "La recta que pasa por " + p1 + " y " + p2 + " es " + (p1.getY()-p2.getY()) +
                "x" + " + " + (-1)*(p1.getX()-p2.getX()) +"y" + " + " +(-1)*((-1)*p1.getX()*p2.getY()+p1.getY()*p2.getX()) + " = 0";
    }
}

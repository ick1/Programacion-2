package Fraccion;

public class Fraccion {
    private int numerador;
    private int denominador;
    
    public Fraccion()   {
        numerador = 0;
        denominador = 0;
    }
    
    public Fraccion(int n, int d) {
        numerador = n;
        denominador = d;
    }
    
    public int getNumerador() {
        return numerador;
    }
    
    public int getDenominador() {
        return denominador;
    }
    
    public void setNumerador(int n) {
        numerador = n;
    }
    
    public void setDenominador(int d) {
        denominador = d;
    }
    
    public Fraccion suma(Fraccion f) {
        int ns, ds;
        ns = (numerador * f.getDenominador()) + (f.getNumerador() * denominador);
        ds = denominador * f.getDenominador();
        return new Fraccion(ns, ds);
    }
    
    public Fraccion resta(Fraccion f) {
        int nr, dr;
        nr = (numerador * f.getDenominador()) - (f.getNumerador() * denominador);
        dr = denominador * f.getDenominador();
        return new Fraccion(nr, dr);
    }
    
    public Fraccion multiplicacion(Fraccion f) {
        int nm, dm;
        nm = numerador * f.getNumerador();
        dm = denominador * f.getDenominador();
        return new Fraccion(nm, dm);
    }
    
    public Fraccion division(Fraccion f){
        int nd, dd;
        nd = numerador * f.getDenominador();
        dd = denominador * f.getNumerador();
        return new Fraccion(nd, dd);
    }
    
    public Fraccion simplificacion(Fraccion f){
        int numsimp, demsimp, i = 2;
        numsimp = numerador;
        demsimp = denominador;
        while(numsimp >= i){
            if(((numsimp % i) != 0) || ((demsimp % i)!= 0)) {
                i = i + 1;
            }else{
                numsimp = numsimp / i;
                demsimp = demsimp / i;
                i = 2;
            }
        }
        
        return new Fraccion(numsimp, demsimp);
    }
    
    @Override
    public String toString(){
        return numerador + "/" + denominador;
    }
}
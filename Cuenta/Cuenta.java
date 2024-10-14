package Cuenta; 
/* Clase */
public class Cuenta {
    
    /* Atributos */
    private int numdeCuenta; 
    private String titular; 
    private double saldo; 
    
    /* Constructores */             
    
    /* Por defecto sin parámetros */
    public Cuenta(){ 
        numdeCuenta=0; 
        titular = null; 
        saldo = 0;
    }
    
    /* Constructor con parámetros */
    public Cuenta(int n, String t, double c){
        numdeCuenta = n;
        titular = t; 
        saldo = c;
    }
    
    /* Métodos */
      
    /* Setter */
    public void setTitular(String t){
        titular = t;
    }
   
    /* Getters */
    public int getNum(){
        return numdeCuenta;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public double getSaldo(){
        return saldo;
    }   

    public void depositar(double m){
        if(m > 0) {
            saldo += m;
        } else {
            System.out.println("Cantidad no valida.");
        }
        
    }
    
    public void retirar(double m){
        if(m > 0 && saldo >= m){
            saldo -= m;
        } else {
            System.out.println("Cantidad no valida.");
        }
    }
    
    @Override 
    public String toString(){
        return "\nNumero de Cuenta: "+numdeCuenta+"\nTitular: "+titular
                +"\nSaldo actual: "+saldo;
    }
}
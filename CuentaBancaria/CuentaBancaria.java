/* Clase */
public class CuentaBancaria {
    
    /* Atributos */
    private int numdeCuenta; 
    private String titular; 
    private float saldo; 
    
    /* Constructores */
    
    /* Por defecto sin parámetros */
    public CuentaBancaria(){ 
        numdeCuenta=0; 
        titular = null; 
        saldo = 0;
    }
    
    /* Constructor con parámetros */
    public CuentaBancaria(int n, String t, float tf){
        numdeCuenta = n;
        titular = t; 
        saldo = tf;
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
    
    public float getSaldo(){
        return saldo;
    }   

    public void depositar(float mf){
        saldo += mf;
    }
    
    public void retirar(float mf){
        saldo -= mf;
    }
    
    @Override 
    public String toString(){
        return "\nNumero de Cuenta: "+numdeCuenta+"\nTitular: "+titular
                +"\nSaldo actual: "+saldo;
    }
}

package Polimorfismo;

import Cuenta.Cuenta;

public class CuentaAhorro extends Cuenta {
    private double interes;
    
    public CuentaAhorro(int numero, String titular, double saldo, double interes){
        super(numero, titular, saldo);
        this.interes = interes;  
    }

    public void agregarIntereses(){
        saldo += saldo * interes / 100; 
    }

    @Override
    public String toString(){
        return super.toString() + "\nInteres: " + interes + "%";     
    }
}

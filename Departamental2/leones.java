package Departamental2;

public class leones extends felinos{
    public leones(String n){
        super(n);
    }

    public void rugir(){
        System.out.println("Rugiendo...");
    }

    @Override
    public void cazar(){
        System.out.println(super.getNombre() + " esta cazando cebras...");
    }

    @Override
    public String toString(){
        return "Hola mi nombre es " + super.getNombre() + " y soy un leon."; 
    }
}

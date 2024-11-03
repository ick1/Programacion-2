package Departamental2;

public abstract class felinos {
    private String nombre; 

    public felinos(String n){
        nombre = n; 
    }

    public String getNombre(){
        return nombre; 
    }

    public void alimentar(){
        System.out.println("Alimentado a " + nombre);
    }

    public void cazar(){
        System.out.println("Cazando...");
    }; 
}

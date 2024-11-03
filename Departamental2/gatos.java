package Departamental2;

public class gatos extends felinos{
    private static int vidas;

    public gatos(String n){
        super(n); 
    }

    public  void ronronear(){
        System.out.println("Ronroneando...");
    }

    @Override
    public void cazar(){
        System.out.println(super.getNombre() + " esta cazando ratones..."); 
    }

    @Override
    public String toString(){
        return "Hola mi nombre es " + super.getNombre() + "y tengo " + vidas + "vidas."; 
    }
}

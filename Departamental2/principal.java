package Departamental2;

import java.util.Scanner; 

public class principal{
    static Scanner leer = new Scanner(System.in); 
    static felinos[] F = new felinos[5]; 
    static int n;   

    public static void nombres(){
        F[0] = new gatos("Pato");
        F[1] = new leones("Garfild"); 
        F[2] = new leones("Leon 2"); 
        F[3] = new gatos("Robocop"); 
        F[4] = new leones("Ultimo");
    }

    public static void darAlimentos(){
        for(int i = 0; i < 5; i++){
            F[i].alimentar();
        }
    }

    public static void cazar(){
        for(int i = 0; i < 5; i++){
            if(F[i] instanceof leones){
                ((leones)F[i]).cazar();
            } else {
                ((gatos)F[i]).cazar();
            }
        }
    }

    public static void expresar(){
        for(int i = 0; i < 5; i++){
            if(F[i] instanceof leones){
                ((leones)F[i]).rugir();; 
            } else {
                ((gatos)F[i]).ronronear();; 
            }
        }
    }

    public static void datos(){
        for(int i = 0; i < 5; i++){
            if(F[i] instanceof leones){
                ((leones)F[i]).toString(); 
            } else {
                ((gatos)F[i]).toString(); 
            }
        }
    }

    public static void menu(){
       do{
        System.out.println("1. Alimentar felinos");
        System.out.println("2. Cazar");
        System.out.println("3. Expresar");
        System.out.println("4. Salir" );
        System.out.print("Seleccionar una opcion: ");
        n = leer.nextInt();

        switch(n){
            case 1:
                darAlimentos();  
                break; 
            case 2: 
                cazar();
                break;
            case 3: 
                expresar();
                break; 
            case 4: 
                System.out.println("Hasta luego...");
                return;
            default: 
                System.out.println("Opcion invalida.");
                break; 
        }
        } while(true); 
    }

    public static void main(String[] args) {
        nombres();
        menu(); 
    }
}

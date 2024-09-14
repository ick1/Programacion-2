package Materia;

public class Principal {
    public static void main(String[] args) {
        Materia m1 = new Materia("Matematicas Discretas", 12451);
        Materia m2 = new Materia("Programacion 2", 24310); 
        Estudiante e1 = new Estudiante("Luisa Aro", 20248163); 
        Estudiante e2 = new Estudiante("Elizabeth", 20241739); 
        Estudiante e3 = new Estudiante("Sebastian", 20241214); 

        e1.agregar(m1);
        e2.agregar(m1);
        e3.agregar(m1);
        
        e1.agregar(m2);
        //e2.agregar(m2);
        e3.agregar(m2);

        System.out.println(m1);
        System.out.println(m2);
    }
}

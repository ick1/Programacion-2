package Materia;

public class Estudiante {
    private String nombre; 
    private int id; 
    private Materia materias[];
    private int nM; 
    
    public Estudiante(){
        nombre = ""; 
        id = 0; 
        materias = new Materia[0];
        nM = 0;  
    }
    
    public Estudiante(String nombre, int id){
        this.nombre = nombre; 
        this.id = id; 
        materias = new Materia[6];
        nM = 0; 
    }

    public String getNombre(){
        return nombre; 
    }

    public int getID(){
        return id; 
    }

    public int getNM(){
        return nM; 
    }

    public void setNombre(String n){
        nombre = n; 
    }

    public void setID(int d){
        id = d; 
    }

    public void setNM(int m){
        nM = m; 
    }

    public void agregar(Materia m){
        materias[nM++] = m; 
        m.agregar(this); 
    }

    @Override
    public String toString(){
        return id + " - " + nombre; 
    }
}

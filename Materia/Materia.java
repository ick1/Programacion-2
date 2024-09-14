package Materia;

public class Materia {
    private String nombre;
    private int nrc;
    private Estudiante[] estudiantes;
    private int nE;

    public Materia(){
        nombre = "";
        nrc = 0;
        estudiantes = new Estudiante[0];
        nE = 0; 
    }

    public Materia(String nombre, int nrc){
        this.nombre = nombre; 
        this.nrc = nrc;
        estudiantes = new Estudiante[45]; 
        nE = 0;  
    }

    public String getNombre(){
        return nombre; 
    }

    public int getNRC(){
        return nrc; 
    }

    public int getNE(){
        return nE; 
    }

    public void setNombre(String s){
        nombre = s; 
    }

    public void setNRC(int n){
        nrc = n; 
    }

    public setNE(int m){
        nE = m; 
    }

    public void agregar(Estudiante e){
        estudiantes(nE++) = e; 
    }

    @Override
    public String toString(){
        int i; 
        String cad = ""; 
        for(i=0; i<nE; i++){
            cad += (i+1); 
            cad += estudiantes[i] + "\n";
        }
        return nrc + "-" + nombre + cad; 
    }
}

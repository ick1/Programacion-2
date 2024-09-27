package Bidireccional;

import java.util.ArrayList;

public class Libro {
    private String titulo; 
    private String editorial; 
    private int noPag; 
    private ArrayList<Autor> autores;

    public Libro(String t, String e, int n){
        titulo = t; 
        editorial = e; 
        noPag = n; 
        autores = new ArrayList<>(); 
    }

    public String getTitulo(){
        return titulo; 
    }

    public String getEditorial(){
        return editorial; 
    }

    public int getNoPag(){
        return noPag; 
    }

    public void asignarAutor(Autor a){
        autores.add(a);  
    }

    @Override
    public String toString() {
        String cadena = ""; 
        for(int i = 0; i < autores.size(); i++){
            cadena += "       " + autores.get(i).getNombre() + "\n"; 
        }
        return "Titulo: " + titulo + "\nEditorial: " + editorial + "\nNumero de paginas: " + noPag
        + "\nAutores: \n" + cadena;
    }
}
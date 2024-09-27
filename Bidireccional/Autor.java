package Bidireccional;

import Fecha.Fecha;
import java.util.ArrayList;

public class Autor {
    private String nombre; 
    private String nacionalidad; 
    private Fecha fecha; 
    private ArrayList<Libro> libros; 

    public Autor(String no, String na, Fecha f){
        nombre = no; 
        nacionalidad = na; 
        fecha = f; 
        libros = new ArrayList<>(); 
    }

    public String getNombre(){
        return nombre;
    }

    public String getNacionalidad(){
        return nacionalidad; 
    }

    public Fecha getFecha(){
        return fecha; 
    }

    public void asignarLibro(Libro libro){
        libros.add(libro);     
    }

    @Override
    public String toString() {
        String cadena = ""; 
        for(int i = 0; i < libros.size(); i++){
            cadena += libros.get(i).getTitulo() + "\n"; 
        }
        return "Autor: " + nombre + "\nNacionalidad: " + nacionalidad + "\nFecha: " + fecha + "\nLibros:\n" + cadena;
    }
}
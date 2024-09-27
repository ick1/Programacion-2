package Bidireccional;

import Fecha.Fecha;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    static Scanner leer = new Scanner(System.in); 
    static Autor at = new Autor("", "", new Fecha()); 
    static Libro lb = new Libro("", "", 0); 
    static Fecha fecha; 
    static ArrayList<Autor> a = new ArrayList<>();
    static ArrayList<Libro> l = new ArrayList<>(); 
    static int opc, pag, dd, mm, yy;  
    static String nombre, nacionalidad, editorial; 

    static int validar(){
        int posicion = 0; 
        while(posicion < a.size()){
            if(a.get(posicion).equals(at)){
                return posicion; 
            }
            posicion++; 
        }
        return -1; 
    }

    static void agregarNuevoAutor(){
        at.asignarLibro(lb);
        lb.asignarAutor(at);
        a.add(at); 
    }

    static void modificarAutor(int pos){
        a.get(pos).asignarLibro(lb);
    }

    static void agregarAutor(){
        int posicion = 0; 
        System.out.print("\nFavor de proporcionar la fecha en el formato dd mm yy: ");
        dd = leer.nextInt(); 
        mm = leer.nextInt(); 
        yy = leer.nextInt(); 
        System.out.print("Nombre: ");
        leer.nextLine(); 
        nombre = leer.nextLine(); 
        System.out.print("Nacionalidad: ");
        nacionalidad = leer.nextLine(); 
        
        fecha = new Fecha(dd,mm,yy);
        at = new Autor(nombre, nacionalidad, fecha);

        posicion = validar();

        if(posicion == -1){
            agregarNuevoAutor();
        } else {
            modificarAutor(posicion);
        }
    }

    static void listaAutores(int pos){
        if(pos == -1){
            System.out.println("Lista vacia.");
            return; 
        }
        System.out.println(a.get(pos));
    }

    static void menuSecundario(){
        int posicion = 0; 
        System.out.print("\nTitulo: ");
        nombre = leer.nextLine(); 
        System.out.print("Editorial: ");
        editorial = leer.nextLine(); 
        System.out.print("Numero de paginas: ");
        pag = leer.nextInt(); 
        leer.nextLine(); 

        lb = new Libro(nombre, editorial, pag); 

        do{
            System.out.println("\n");
            System.out.println("  1. Agregar autor.");
            System.out.println("  2. Mostrar autor.");
            System.out.println("  3. Regresar.");
            System.out.print("\nSeleccionar una opcion: ");
            opc = leer.nextInt(); 
            leer.nextLine(); 

            switch(opc){
                case 1:{
                    agregarAutor();
                    break; 
                }
                case 2:{
                    posicion = validar();
                    System.out.println("Lista de autores: ");
                    listaAutores(posicion);
                    break; 
                }
                case 3:{
                    l.add(lb); 
                    System.out.println("Regresando...");
                    return; 
                }
                default:{
                    System.out.println("Opcion invalida");
                    break; 
                }
            }
        } while (true); 
    }

    static void listaLibros(){
        if(l.isEmpty()){
            System.out.println("La lista esta vacia.");
            return; 
        }

        for(int i = 0; i < l.size(); i++){
            System.out.println(l.get(i));
        }
        System.out.println("\n");
    }

    static void menu(){
        do{
            System.out.println("Bienvenido al registro de libros.");
            System.out.println("  1. Nuevo libro.");
            System.out.println("  2. Mostrar libros." );
            System.out.println("  3. Salir.");
            System.out.print("\nFavor de seleccionar alguna de las opciones: ");
            opc = leer.nextInt();
            leer.nextLine();  

            switch(opc){
                case 1:{
                    menuSecundario();
                    break; 
                } 
                case 2:{
                    listaLibros(); 
                    break; 
                }
                case 3:{
                    System.out.println("Adios. :D");
                    return; 
                }
                default:{
                    System.out.println("\nLa opcion no es valida.");
                }
            }
        } while(true);
    }
     
    public static void main(String[] args){
        menu();
    }
}
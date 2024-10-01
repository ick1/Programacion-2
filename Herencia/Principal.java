package Herencia;

import java.util.Scanner; 

public class Principal {
   static Scanner scan = new Scanner(System.in); 
   static String name; 
   static int quantity; 
   static double weight, unitPrice;
   static WeighedItem w; 
   static CountedItem c; 

   public static void namePrice(){
      System.out.print("Indicate the name of the product: ");
      name = scan.nextLine(); 
      System.out.print("Indicate the price per unit: ");
      unitPrice = scan.nextDouble();
   }

   public static void PerWeight(){ 
      namePrice();
      System.out.print("Indicate the weight: ");
      weight = scan.nextDouble(); 
      scan.nextLine(); 

      w = new WeighedItem(name, unitPrice, weight); 
   }

   public static void PerUnits(){
      namePrice();
      System.out.print("Indicate the units: ");
      quantity = scan.nextInt();
      
      c = new CountedItem(name, unitPrice, quantity); 
   }

   public static void main(String[] args) {
      PerWeight();
      PerUnits();
      
      System.out.println(w);
      System.out.println(c);
   }   
}
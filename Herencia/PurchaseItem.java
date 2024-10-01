package Herencia;

public class PurchaseItem {
    private String name; 
    private double unitPrice; 

    public PurchaseItem(){
        name = "no Item"; 
        unitPrice = 0;
    }

    public PurchaseItem(String name, double unitPrice){
        this.name = name; 
        this.unitPrice = unitPrice; 
    }

    public double getPrice(){
        return unitPrice; 
    }

    public String getName(){
        return name; 
    }

    public void setPrice(double unitPrice){
        this.unitPrice = unitPrice; 
    }

    public void setName(String name){
        this.name = name; 
    }

    @Override
    public String toString(){
        return name + " @ " + unitPrice;  
    };
}

package Herencia;

public class CountedItem extends PurchaseItem {
    private int quantity; 

    public CountedItem(String name, double unitPrice, int quantity){
        super(name, unitPrice); 
        this.quantity = quantity; 
    }

    public int getQuantity(){
        return quantity; 
    }

    public void setQuantity(int quantity){
        this.quantity = quantity; 
    }

    @Override
    public double getPrice(){
        return super.getPrice() * quantity; 
    }

    @Override
    public String toString(){
        return super.toString() + " " + quantity + " units " + getPrice() + " SR"; 
    }
}

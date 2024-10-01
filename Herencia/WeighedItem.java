package Herencia;

public class WeighedItem extends PurchaseItem {
    private double weight;
    
    public WeighedItem(String name, double unitPrice, double weight) {
        super(name, unitPrice);
        this.weight = weight; 
    }

    public double getWeight(){
        return weight; 
    }

    public void setWeight(double weight) {
        this.weight = weight; 
    }

    @Override
    public double getPrice(){
        return super.getPrice() * weight; 
    }

    @Override
    public String toString(){
        return super.toString() + " " + weight + " Kg " + getPrice() + " SR"; 
    }
}

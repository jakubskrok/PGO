public class Furniture {
    private String name;
    private double price;
    private double VAT = 0.23;

public Furniture(String name, double price, double VAT){
    this.name = name;
    this.price = price;
    this.VAT = price + (price * VAT);
}
@Override
public String toString(){
    return name;
}

    public double getPrice() {
        return price;
    }

    public double getVAT() {
    double roundOff = Math.round(VAT *100.0)/100.0;
    return roundOff;
    }
}
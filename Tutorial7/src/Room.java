
import java.util.ArrayList;
import java.util.List;

public class Room{

    private String Name;
    double VAT = 0.23;
    List<Furniture> furnitures;

    public Room(String name) {
        Name = name;
        furnitures = new ArrayList<>();
    }

    public void addFurniture(Furniture Furniture){
        furnitures.add(Furniture);
    }

    public String getName() {
        return Name;
    }

    public double getRoomPrice() {

        double prices = 0;
        for (int a = 0; a < furnitures.size(); a++) {
            prices += furnitures.get(a).getPrice();
        }
        prices += (VAT * prices);
        double roundOff = Math.round(prices *100.0)/100.0;
        return roundOff;
    }
}
import java.util.ArrayList;
import java.util.List;

public class House {

    private String NAME;
    double VAT = 0.23;
    List<Room> roomList;

    public House(String name){
        this.NAME = name;
        roomList =  new ArrayList<>();
    }
    public void addRoom(Room Room){
        roomList.add(Room);
    }

    public String getNAME() {
        return NAME;
    }

    public double getHousePrice() {

        double prices = 0;
        for (int b = 0; b < roomList.size(); b++) {
            prices += roomList.get(b).getRoomPrice();
        }
        prices += (VAT * prices);
        double roundOff = Math.round(prices *100.0)/100.0;
        return roundOff;
    }
    public int getRoomCount(){
    int rooms = 0;
    for (int b = 0; b < roomList.size();b++){
    rooms ++;
    }
    return rooms;
}
}
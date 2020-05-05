
public class Main {
    public static void main(String[] args) {

        Furniture f1 = new Furniture("Lamp", 59.99,0.23);
        Furniture f2 = new Furniture("Desk", 329.99,0.23);
        Furniture f3 = new Furniture("Mouse",29.87,0.23);
        Furniture f4 = new Furniture("Cup",9.99,0.23);
        Furniture f5 = new Furniture("Mirror",12.99 ,0.23);
        Furniture f6 = new Furniture("Bed",545.20,0.23);

        Room r1  = new Room("Bedroom");
        Room r2  = new Room("Kitchen");
        Room r3  = new Room("Bathroom");

        r1.addFurniture(f1);
        r1.addFurniture(f2);
        r1.addFurniture(f3);
        r1.addFurniture(f6);
        r2.addFurniture(f4);
        r3.addFurniture(f5);

        House h1 = new House("Blue");
        House h2 = new House("Red");

        h1.addRoom(r1);
        h1.addRoom(r2);
        h1.addRoom(r1);
        h1.addRoom(r3);
        h2.addRoom(r1);
        h2.addRoom(r2);
        h2.addRoom(r3);

        System.out.println("Furniture 1:");
        System.out.println("Name: " + f1.toString());
        System.out.println("Price: " + f1.getPrice() + ("$"));
        System.out.println("Price with VAT: " + f1.getVAT() + ("$"));
        System.out.println("");
        System.out.println("Furniture 2:");
        System.out.println("Name: " + f2.toString());
        System.out.println("Price: " + f2.getPrice() + ("$"));
        System.out.println("Price with VAT: " + f2.getVAT() + ("$"));
        System.out.println("");
        System.out.println("Furniture 3:");
        System.out.println("Name: " + f3.toString());
        System.out.println("Price: " + f3.getPrice() + ("$"));
        System.out.println("Price with VAT: " + f3.getVAT() + ("$"));
        System.out.println("");
        System.out.println("Furniture 4:");
        System.out.println("Name: " + f4.toString());
        System.out.println("Price: " + f4.getPrice() + ("$"));
        System.out.println("Price with VAT: " + f4.getVAT() + ("$"));
        System.out.println("");
        System.out.println("Furniture 5:");
        System.out.println("Name: " + f5.toString());
        System.out.println("Price: " + f5.getPrice() + ("$"));
        System.out.println("Price with VAT: " + f5.getVAT() + ("$"));
        System.out.println("");
        System.out.println("Furniture 6:");
        System.out.println("Name: " + f6.toString());
        System.out.println("Price: " + f6.getPrice() + ("$"));
        System.out.println("Price with VAT: " + f6.getVAT() + ("$"));
        System.out.println("");
        System.out.println("This is: " + r1.getName());
        System.out.println("Furniture list in this room: " + r1.furnitures);
        System.out.println("Price for this room is: " + r1.getRoomPrice());
        System.out.println("");
        System.out.println("This is: " + r2.getName());
        System.out.println("Furniture list in this room: " + r2.furnitures);
        System.out.println("Price for this room is: " + r2.getRoomPrice());
        System.out.println("");
        System.out.println("This is: " + r3.getName());
        System.out.println("Furniture list in this room: " + r3.furnitures);
        System.out.println("Price for this room is: " + r3.getRoomPrice());
        System.out.println("");
        System.out.println("House name: " + h1.getNAME());
        System.out.println("Rooms: " + h1.getRoomCount());
        System.out.println("Price for this house: " + h1.getHousePrice());
        System.out.println("");
        System.out.println("House name: " + h2.getNAME());
        System.out.println("Rooms: " + h2.getRoomCount());
        System.out.println("Price for this house: " + h2.getHousePrice());
    }
}
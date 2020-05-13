public class Car extends Vehicle {

    int numberOfSeats;
    String brand;
    String model;
    String type;
    String color;


    public Car(String brand, String model, String type, String color, int number){
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.color = color;
        this.numberOfSeats = number;
     }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public void setStart(String start){
        this.start = start;
        System.out.println("Start");
    }

    @Override
    public void setStop(String stop){
        this.stop = stop;
        System.out.println("Stop");
    }
}

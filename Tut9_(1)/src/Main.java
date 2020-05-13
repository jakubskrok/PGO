public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "i8", "Supercar", "Blue", 2);
        Car c2 = new Car("Mercedes", "GLE", "Suv", "Grey", 6);




        System.out.println("Brand: " + c1.getBrand() +  " , " + "Model: " + c1.getModel() + " , " + "Type: " + c1.getType() + " , " + "Color: " + c1.getColor() + " , " + "Seats: " + c1.getNumberOfSeats());
        System.out.println(c1.getBrand() + ": " + c1.getStart() + " or " + c1.getStop());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Brand: " + c2.getBrand() +  " , " + "Model: " + c2.getModel() + " , " + "Type: " + c2.getType() + " , " + "Color: " + c2.getColor() + " , " + "Seats: " + c2.getNumberOfSeats());
        System.out.println(c2.getBrand() + ": " + c2.getStart() + " or " + c2.getStop());


    }
}

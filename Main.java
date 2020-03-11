
public class Main {
    public static void main(String[] args) {
        System.out.println("PHONE:");
        phone phone = new phone("iPhone", 6, 455367889);
        String brand = phone.brand();
        System.out.println("Brand of this phone is: " + brand);
        int screenresolution = phone.screenresolutin();
        System.out.println("Screenresolution of this phone is: " + screenresolution);
        int number = phone.number();
        System.out.println("Number of this phone is: " + number);
        System.out.println();
        System.out.println();
        System.out.println("CAR:");
        {
            car car = new car("BMW","Night Blue","3.5l");
String model = car.model;
            System.out.println("Model of this car is: " + model);
            String color = car.color;
            System.out.println("Color of this car is: " + color);
            String capacity = car.capacity;
            System.out.println("capacity of this car is: " + capacity);



        }


    }
}



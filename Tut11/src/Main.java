import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList();

        Car c = new Car("Dodge Challenger",2019);
        Car c1 = new Car("Nissan Gtr",2014);
        Car c2 = new Car("Bentley Continental",2020);
        Car c3 = new Car("BMW M4",2015);
        Car c4 = new Car("Jeep Grand Cherokee SRT",2019);
        Car c5 = new Car("BMW M2 Competition",2017);
        Car c6 = new Car("Lexus nx300h",2016);
        Car c7 = new Car("Skoda Octavia",2015);
        Car c8 = new Car("Honda type-R",2020);
        Car c9 = new Car("Jaguar XF",2008);

        cars.add(c);
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);
        cars.add(c6);
        cars.add(c7);
        cars.add(c8);
        cars.add(c9);

        Collections.sort(cars);

        for(Car car : cars){
            System.out.println(car);
        }
    }
}

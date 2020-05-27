public class Car implements Comparable <Car> {

private String Brand;
private int YearOfProduction;

public Car(String Brand, int YearOfProduction){
    this.Brand = Brand;
    this.YearOfProduction = YearOfProduction;
}

@Override
    public String toString(){
    return Brand;
}

@Override
    public int compareTo(Car car) {
    return this.YearOfProduction - car.YearOfProduction;
    }
}

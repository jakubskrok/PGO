public class Circle implements Figure{

private double radius;

public Circle(double radius){
    this.radius = radius;
}

    @Override
    public String getType(){
        String type = "Circle";
        return type;
    }

    @Override
    public double getPerimeter(){
        double perimeter = 3.14 * radius * 2;
        return perimeter;
    }

    @Override
    public double getArea(){
        double area= 3.14 * radius * radius;
        return area;
    }

}

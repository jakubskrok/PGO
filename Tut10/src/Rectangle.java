public class Rectangle implements Figure {

    private double flank1;
    private double flank2;

    public Rectangle(double flank1, double flank2){
        this.flank1 = flank1;
        this.flank2 = flank2;
    }

    @Override
    public String getType() {
        String Type = "Rectangle";
        return Type;
    }

    @Override
    public double getPerimeter() {
        double perimiter = 2 * (flank1 + flank2);
        return perimiter;
    }

    @Override
    public double getArea() {
        double area = flank1 * flank2;
        return area;
    }
}

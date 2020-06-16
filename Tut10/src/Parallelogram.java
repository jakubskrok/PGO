public class Parallelogram implements Figure{

    private double basis;
    private double height;
    private double flank;

    public Parallelogram(double basis,  double height, double flank){
        this.basis = basis;
        this.height = height;
        this.flank = flank;
    }

    @Override
    public String getType() {
        String Type = "Parallelogram";
        return Type;
    }

    @Override
    public double getPerimeter() {
        double perimiter = 2 * (basis + flank);
        return perimiter;
    }

    @Override
    public double getArea(){
        double area = basis * height;
        return area;
    }
}

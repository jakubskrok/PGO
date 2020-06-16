import java.util.ArrayList;
import java.util.List;

interface Figure {

    String getType();

    double getPerimeter();

    double getArea();
}

    public class Main {

        public static void main(String[] args) {
            double radius = 3d;
            Figure circle = new Circle(radius);

            double basis = 10d;
            double flank = 5d;
            double height = 8d;
            Figure parallelogram = new Parallelogram(basis, flank, height);

            double flank1 = 15d;
            double flank2 = 10;
            Figure rectangle = new Rectangle(flank1, flank2);

            List<Figure> figures = new ArrayList<>(3);
            figures.add(circle);
            figures.add(parallelogram);
            figures.add(rectangle);

            for (Figure figure : figures) {
                System.out.println(figure.getType());
                System.out.println("Area: " + figure.getArea() + " units.");
                System.out.println("Perimeter: " + figure.getPerimeter() + " units.\n");

            }
        }
    }
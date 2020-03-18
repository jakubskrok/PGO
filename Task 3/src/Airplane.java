import java.util.Scanner;

public class Airplane {
    public static void main(String[] args) {
        System.out.println("Airplane:");
Engine engine = new Engine("Boeing",300.5 ,2014);

String model = engine.getBrand();
        System.out.println("Brand of this airplane is: " + model);

        double capacity = engine.getPower();
        System.out.println("Capacity of this airplane is: " + capacity);

        int year = engine.getYear();
        System.out.println("This airplane was produced at: " + year);

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("sit numbers: " + a);

        boolean ecological;
        ecological = engine.isEngineEcological();
        if(ecological == true){
            System.out.println("engine is ecological");
        }else{
            System.out.println("engine isn't ecological");

        }
    }
    }

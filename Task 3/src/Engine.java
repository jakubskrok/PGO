public class Engine {
    String model;
double capacity;
int seats;
int year;

    public Engine(String brand,double power,int year) {
        this.model = brand;
        this.capacity = power;
        this.year = year;
    }
    public String getBrand() {
        return this.model;
    }
    public double getPower(){
        return this.capacity;
    }
    public int getYear(){return this.year;
    }
   public boolean isEngineEcological(){
        if(capacity>20000 && year>2000){
            return true;
        }else{
            return false;
        }
    }
}

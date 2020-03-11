public class car {

        String model;
        String color;
        String capacity;

        public car(String brand, String color,String capacity ){
            this.model = brand;
            this.color = color;
            this.capacity = capacity;
        }
        public String getBrand() {
            return this.model;
        }
        public String getColor(){
            return this.color;
        }
        public String getCapacity(){
            return this.capacity;
        }
}
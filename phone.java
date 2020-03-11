public class phone {

    String getBrand;
    private String brand;
        private int screenresolutin;
        private int number;

        phone(String brand, int screenresolutin, int number) {
            this.brand = brand;
            this.screenresolutin = screenresolutin;
            this.number = number;
        }

        public String brand() {
            return this.brand;
        }

        public int screenresolutin() {
            return this.screenresolutin;
        }

        public int number() {
            return this.number;
        }

        public static void sendMassage(float number) {
            System.out.println("send the message");
            String message = "";
            System.out.println("send the message" + message + "to number" + number);
        }
    }





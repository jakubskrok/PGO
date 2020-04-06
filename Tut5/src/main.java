import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        User user = new User("Dominik", "Kowalski", "d.kow@gmail.com", "d.kowalski1122");
        User guest1 = new User("Błażej", "Tomczuk", "b.tom@gmail.com", "b.tomczuk3356");
        User guest2 = new User("Agata", "Lycha", "a.lych@gamiali.com", "a.lycha6835");

        String Name = user.getName();
        String LastName = user.getLastName();
        String email = user.getEmail();
        String password = user.getPassword();
        System.out.println("(type any email you want)");

        String emailValidation = null;

        Scanner in = new Scanner(System.in);
        System.out.println("Give me your email: ");
        emailValidation = in.nextLine();
        if (email.matches(emailValidation)) {
            System.out.println("You are registered as a User ");
        } else {
            System.out.println("do you want to continue as a Guest: ");
            System.out.println("yes - type [1] ");
            System.out.println("no - type [2] ");
            int check = in.nextInt();
            if (check == 2) {
                User user1 = new User("Kuba", "Krawczyk", "k.kraw@gmail.com", "k.krawczyk5463");
                System.out.println("You are registered as a new User ");
            } else {
                User user2 = new User(emailValidation);
                System.out.println("You are registered as a Guest ");
            }
            Category category1 = new Category("food");
            Category category2 = new Category("accessories");
            Category category3 = new Category("clothes", new ArrayList<>());

            category1.addProduct(new Product("hot-dog", 4.50, 545234253));
            category2.addProduct(new Product("charger", 45, 754647839));
            category3.addProduct(new Product("T-shirt", 89.99, 893746299));


            Busket busket1 = new Busket(new User("Dominik","Kowalski","d.kow@gmail.com","d.kowalski1122"));
            Busket busket2 = new Busket(new User("Jakub", "Skrok", "jakub.skrok@gamil.com", "j.skrok1234"));
            Busket busket3 = new Busket(new User("Ania", "Krawczyk", "ania.krawczyk@gamil.com", "a.krawczyk5678"), new Product[1]);

            Product product1 = new Product("T-shirt", 89.99, 893746299);
            Product product2 = new Product("hot-dog", 4.50, 545234253);
            Product product3 = new Product("charger", 45, 754647839);

            busket1.addProduct(product2);
            busket2.addProduct(product1);
            busket3.addProduct(product3);
            busket3.addProduct(product1);
            busket1.deleteProduct(product2);
            busket3.buy();

        }
    }
}
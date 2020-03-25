import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        System.out.println("User:");
        user user = new user("Dominik","Kowalski","d.kow@gmail.com",866546);
user guest1 = new user("Błażej", "Tomczuk", "b.tom@gmail.com",776153);
user guest2 = new user("Agata", "Lycha", "a.lych@gamiali.com", 456091);
        String Name = user.getName();
        System.out.println("name: " + Name);

        String LastName = user.getLastName();
        System.out.println("surname: " + LastName);

        String email = user.getEmail();
        System.out.println("email: " + email);

        int password = user.getPassword();
        System.out.println("password: " + password);

        String emailValidation;

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
                user user1 = new user("Kuba", "Krawczyk", "k.kraw@gmail.com", 456908);
                System.out.println("You are registered as a new User ");
            } else {
                user user1 = new user(emailValidation);
                System.out.println("You are registered as a Guest ");
            }
        }
    }
}
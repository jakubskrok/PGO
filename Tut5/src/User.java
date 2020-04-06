public class User {

    String Name;
    String LastName;
    String Email;
    String Password;
    String EmailGuest;

    public User(String Name, String LastName, String email, String password){
        this.Name = Name;
        this.LastName = LastName;
        this.Email = email;
        this.Password = password;
        this.EmailGuest = "User";
    }
    public User(String email){
        this.Email = email;
        this.EmailGuest = "Guest";
    }
    public String getName(){return this.Name;}
    public String getLastName(){return this.LastName;}
    public String getEmail(){return this.Email;}
    public String getPassword(){return this.Password;}

    public void isRegistered(){
        if(EmailGuest == "Guest"){
            System.out.println("You are registered as a Guest");
        }else{
            System.out.println("You are registered as a User");
        }
    }
}
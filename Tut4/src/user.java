public class user {

    String Name;
    String LastName;
    String email;
    int pin;
    String emailGuest;

    public user(String Name, String LastName, String email, int pin){
   this.Name = Name;
   this.LastName = LastName;
   this.email = email;
   this.pin = pin;
   this.emailGuest = "User";
    }
    public user(String email){
        this.email = email;
        this.emailGuest = "Guest";
    }
    public String getName(){return this.Name;}
    public String getLastName(){return this.LastName;}
    public String getEmail(){return this.email;}
    public int getPassword(){return this.pin;}

    public void isRegistered(){
        if(emailGuest == "Guest"){
            System.out.println("You are registered as a Guest");
        }else{
            System.out.println("You are registered as a User");
        }
    }
}

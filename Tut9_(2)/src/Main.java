public class Main {
    public static void main(String[] args) {

        Animal a = new Animal();
        Feline f = new Feline();
        Canine ca = new Canine();
        Lion l = new Lion("Lion");
        Cat c = new Cat("Cat");
        Wolf w = new Wolf("Wolf");
        Dog d = new Dog("Dog");

        System.out.println("Animals :" ); a.sleep();
        System.out.println(" ");
        f.setRoam("");
        System.out.println(l.getLion() + ":"); l.setMakeNoise("");
        System.out.println(" ");
        System.out.println(c.getCat() + ":"); c.setMakeNoise("");
        System.out.println(" ");
        System.out.println(" ");
        ca.setRoam("");
        System.out.println(w.getWolf() + ":"); w.setMakeNoise("");
        System.out.println(" ");
        System.out.println(d.getDog() + ":"); d.setMakeNoise("");


    }
}

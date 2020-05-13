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
        System.out.println(f.getRoam());
        System.out.println(l.getLion() + " " + l.getMakeNoise());
        System.out.println(c.getCat() + " " + c.getMakeNoise());
        System.out.println(" ");
        System.out.println(ca.getRoam());
        System.out.println(w.getWolf() + " " + w.getMakeNoise());
        System.out.println(d.getDog() + " " + d.getMakeNoise());

    }
}

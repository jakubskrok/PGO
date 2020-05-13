public class Feline extends Animal {

    public Feline(){}

    @Override
    public void setRoam(String roam) {
        this.roam = roam;
        System.out.println("Feline Roam");
    }
}

public class Canine extends Animal {

    public Canine(){}

    @Override
    public void setRoam(String roam) {
        this.roam = roam;
        System.out.println("Canine Roam");
    }
}

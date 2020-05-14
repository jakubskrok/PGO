public class Cat extends Feline {

    String cat;
    public Cat(String cat){
        this.cat = cat;
    }
    public String getCat() {
        return cat;
    }

    @Override
    public void setMakeNoise(String makeNoise) {
        this.makeNoise = makeNoise;
        System.out.println("Meowing");
    }
}

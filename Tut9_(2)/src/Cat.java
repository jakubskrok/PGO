public class Cat extends Feline {

    String cat;
    public Cat(String cat){
        this.cat = cat;
    }
    public String getCat() {
        return cat;
    }

    @Override
    public String getMakeNoise(){
        return "makes a noise";
    }
}

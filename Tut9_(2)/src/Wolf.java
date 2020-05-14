public class Wolf extends Canine {

    String wolf;
    public Wolf(String wolf){
        this.wolf = wolf;
    }
    public String getWolf() {
        return wolf;
    }

    @Override
    public void setMakeNoise(String makeNoise) {
        this.makeNoise = makeNoise;
        System.out.println("Howls loudly");
    }
}

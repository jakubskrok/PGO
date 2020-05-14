public class Lion extends Feline {

    String lion;
    public Lion(String lion){
        this.lion = lion;
    }
    public String getLion() {
        return lion;
    }

    @Override
    public void setMakeNoise(String makeNoise) {
        this.makeNoise = makeNoise;
        System.out.println("Roars loudly");
    }
}

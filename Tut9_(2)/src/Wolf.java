public class Wolf extends Canine {

    String wolf;
    public Wolf(String wolf){
        this.wolf = wolf;
    }
    public String getWolf() {
        return wolf;
    }

    @Override
    public String getMakeNoise(){
        return "makes a noise";}
}
